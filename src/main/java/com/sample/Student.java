package com.sample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;

public class Student {
	
	
     //@Expose(serialize = false, deserialize = false)
     public String name=null;
     public int rollNo=0;
     
     public Student(String name , int rollNo) {
    	 this.name=name;
    	 this.rollNo=rollNo;
     }
     
}
