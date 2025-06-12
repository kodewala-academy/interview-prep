package com.kodewala.cache.service;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ProductService
{

	@Cacheable("products")
	public String getProductById(String id)
	{
		simulateDelay();
		return "Product-" + id;
	}

    @Cacheable("abcd")
	public String getProductByIdFromCatalog(String id)
	{
		simulateDelay();

		String jsonCatalog = "{\n" + "  \"products\": [\n"
				+ "    {\"id\": \"101\", \"name\": \"Product-101\", \"price\": 29.99, \"category\": \"Books\"},\n"
				+ "    {\"id\": \"102\", \"name\": \"Product-102\", \"price\": 59.99, \"category\": \"Electronics\"},\n"
				+ "    {\"id\": \"103\", \"name\": \"Product-103\", \"price\": 15.49, \"category\": \"Toys\"}\n"
				+ "  ]\n" + "}";

		JSONObject catalog = new JSONObject(jsonCatalog);
		JSONArray products = catalog.getJSONArray("products");

		for (int i = 0; i < products.length(); i++)
		{
			JSONObject product = products.getJSONObject(i);
			if (product.getString("id").equals(id))
			{
				return product.toString();
			}
		}

		return "{}"; // product not found
	}

	private void simulateDelay()
	{
		try
		{
			System.out.println("Getting data from MYSQL database...");
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			throw new RuntimeException(e);
		}
	}
}
