package com.sample;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

import java.io.IOException;
import java.io.StringReader;

import com.google.gson.*;

public class Main {
	public String print() {
		return "Hello world123.";
	}
//new branch added
	public static void main(String args[]) {
		Main obj=new Main();
		System.out.println(obj.print());

		GsonBuilder gsonbuilder=new GsonBuilder();
		gsonbuilder.serializeNulls();
		Gson gson=gsonbuilder.setPrettyPrinting().create();

		String json1="{\"name\" : \"jack\",\"rollno\" : 4}";
		Student stud=gson.fromJson(json1, Student.class);
		System.out.println(stud.name+"  "+stud.rollno);

		Student stud1=new Student();
		stud1.name=null;
		stud1.rollno=3;
		String json2=gson.toJson(stud1);
		System.out.println(json2);

		//custom serialization
		GsonBuilder gsonbuilder1=new GsonBuilder();
		gsonbuilder1.registerTypeAdapter(String.class, new StringSerializer());
		Gson gson1=gsonbuilder1.create();
		Student stud2=new Student();
		stud2.name="Nia";
		stud2.rollno=8;
		String json3=gson1.toJson(stud2);
		System.out.println(json3);

		//custom deserialization

		GsonBuilder gsonBuilder2=new GsonBuilder();
		gsonBuilder2.registerTypeAdapter(Integer.class, new IntDeserializer());
		Gson gson2=gsonBuilder2.create();

		String json4="{\"name\" : \"dfffgr\",\"rollno\" : 0}";
		Student stud4 = gson2.fromJson(json4, Student.class);

		System.out.println(stud4.name + "  " + stud4.rollno);

		JsonReader jsonReader=new JsonReader(new StringReader(json1));

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
