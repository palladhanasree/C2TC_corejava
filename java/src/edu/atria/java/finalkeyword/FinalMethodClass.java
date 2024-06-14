package edu.atria.java.finalkeyword;

final public class FinalMethodClass {
	//constructor
	FinalMethodClass(){
		System.out.println("this is a default constructor");
	}
	
	final int a=23;
	
	//final method
	final void show() {
		System.out.println("value of a: "+a);
	}

}
