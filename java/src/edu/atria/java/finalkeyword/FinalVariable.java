package edu.atria.java.finalkeyword;

public class FinalVariable {
	
	//final int x; 
	final int x=89;
	
	//declare static blank final variable
	final static int Y;
	
	//declare and initialize static final variable
	final static int Z=66;
	
	//instance method
	void change() {
		//x=96; //final variable can't be reassigned
		//Y=200; //final static variable can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y=" + Y +"]";
	}
	
	//declare a static block to initialize the final static variable
	static {
		Y=36;
		//Z=42; //once initialized can't be reassigned 
		System.out.println("value of Y: "+Y);
	}
	

}
