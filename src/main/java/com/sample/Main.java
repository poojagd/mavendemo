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

	public static void main(String args[]) {
		Main obj=new Main();
		System.out.println(obj.print());

		GsonBuilder gsonBuilder=new GsonBuilder();
		gsonBuilder.serializeNulls(); //it will serialize nulls also
		Gson gson=gsonBuilder.setPrettyPrinting().create();
		
		//converting Json to java object
		String jsonStudent="{\"name\" : \"jack\",\"rollNo\" : 4}";
		Student stud=gson.fromJson(jsonStudent, Student.class);
		System.out.println(stud.name+"  "+stud.rollNo);
		
		//converting java object to Json object
		Student stud1=new Student(null,3);
		String jsonStudent2=gson.toJson(stud1);
		System.out.println(jsonStudent2);

		//custom serialization
		gsonBuilder.registerTypeAdapter(String.class, new StringSerializer());
		Gson gson1=gsonBuilder.create();
		Student stud2=new Student("Nia",8);
		String jsonStudent3=gson1.toJson(stud2);
		System.out.println(jsonStudent3);

		//custom deserialization
		gsonBuilder.registerTypeAdapter(Integer.class, new IntDeserializer());
		Gson gson2=gsonBuilder.create();
		String jsonStudent4="{\"name\" : \"dfffgr\",\"rollNo\" : 0}";
		Student stud4 = gson2.fromJson(jsonStudent4, Student.class);
		System.out.println(stud4.name + "  " + stud4.rollNo);
		
		//Reading json string
		JsonReader jsonReader=new JsonReader(new StringReader(jsonStudent));
		JsonReaderClass reader=new JsonReaderClass(jsonReader);
		reader.readJson();
		
	}
}
