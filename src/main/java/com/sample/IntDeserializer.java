package com.sample;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class IntDeserializer implements JsonDeserializer<Integer>{

	public Integer deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {
		return json.getAsInt() == 0 ? 99999 : json.getAsInt();
	}
		
}
