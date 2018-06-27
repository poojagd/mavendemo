package com.sample;

import java.io.IOException;
import java.io.StringReader;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

public class JsonReaderClass {

	JsonReader jsonReader;

	public JsonReaderClass(JsonReader jsonReader) {
		this.jsonReader=jsonReader;
	}

	public void readJson() {

		try {
			while(jsonReader.hasNext()) {
				JsonToken nextToken=jsonReader.peek();
				System.out.println(nextToken);
				System.out.println(JsonToken.values());


				if(JsonToken.BEGIN_OBJECT.equals(nextToken)){

					jsonReader.beginObject();

				} else if(JsonToken.NAME.equals(nextToken)){

					String name  =  jsonReader.nextName();
					System.out.println(name);

				} else if(JsonToken.STRING.equals(nextToken)){

					String value =  jsonReader.nextString();
					System.out.println(value);

				} else if(JsonToken.NUMBER.equals(nextToken)){

					long value =  jsonReader.nextLong();


					System.out.println(value);


				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
