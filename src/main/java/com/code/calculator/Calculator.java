package com.code.calculator;

public class Calculator {
	public float x,y;
	 
	 public Calculator(int i, int j) {
		this.x=i;
		this.y=j;
	}

	public float add() {
		 return(x+y);
	 }
	 
	 public float subtract() {
		 return (x-y);
	 }
	 
	 public float multiply() {
		 return (x*y);
	 }
	 
	 public float divide() {
		 return (x/y);
	 }
}

