package com.sample;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class StringSerializer  implements JsonSerializer<String> {

	public JsonElement serialize(String src, Type typeOfSrc, JsonSerializationContext context) {
		// TODO Auto-generated method stub
		if(src.equals("Nia"))
		   return new JsonPrimitive("None");
		else 
		   return new JsonPrimitive("null");
				   

	}
		
}
