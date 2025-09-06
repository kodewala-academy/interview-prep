package com.kodewala.cache.config;

import java.time.Duration;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration.JedisClientConfigurationBuilder;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

@Configuration
@EnableCaching
@ComponentScan(basePackages = "com.kodewala.cache")
public class RedisConfig
{

	@Bean
	public JedisConnectionFactory jedisConnectionFactory()
	{
		RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration();
		redisConfig.setHostName("optimal-raven-34120.upstash.io"); // e.g.
																	// us1-yourdb.upstash.io
		redisConfig.setPort(6379);
		redisConfig.setPassword(RedisPassword.of("AYVIAAIjcDEzMTIzNjUxNzQ2ZmE0Yjk5OGVkYzMwZjE2MjhiYjliNHAxMA"));

		JedisClientConfiguration clientConfig = ((JedisClientConfigurationBuilder) JedisClientConfiguration.builder()
				.useSsl() // Upstash requires SSL
		).readTimeout(Duration.ofSeconds(10)).connectTimeout(Duration.ofSeconds(10)).build();

		return new JedisConnectionFactory(redisConfig, clientConfig);
	}

	@Bean
	public StringRedisTemplate redisTemplate()
	{
		return new StringRedisTemplate(jedisConnectionFactory());
	}

	@Bean
	public CacheManager cacheManager(RedisConnectionFactory factory)
	{
		RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofSeconds(100)); // TTL
																														// for
																														// cached
																														// items
		return RedisCacheManager.builder(factory).cacheDefaults(config).build();
	}
}
