package com.kodewala.cache;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.cache.config.RedisConfig;
import com.kodewala.cache.service.ProductService;

public class App
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(RedisConfig.class);
		context.refresh();

		ProductService service = context.getBean(ProductService.class);

		/*
		 * System.out.println(service.getProductById("1006")); // takes 2 sec
		 * 
		 * System.out.println(service.getProductById("1006")); // returns instantly
		 * (from Redis cache)
		 */

		System.out.println(" First Request : " + service.getProductByIdFromCatalog("101"));

		System.out.println(" 2nd Request : " + service.getProductByIdFromCatalog("101"));
		context.close();
	}
}
