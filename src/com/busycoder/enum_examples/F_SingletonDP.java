package com.busycoder.enum_examples;

//What is singleton dp
class MySingleton {
	private static MySingleton mySingleton = new MySingleton();

	private MySingleton() {
	}

	public static MySingleton getMySingleton() {
		return mySingleton;
	}
}


enum MySingleton2{
	MySingleton2 ;
	
}
public class F_SingletonDP {

	public static void main(String[] args) {

		MySingleton mySingleton = MySingleton.getMySingleton();

		System.out.println(mySingleton.hashCode());

		MySingleton mySingleton2 = MySingleton.getMySingleton();

		System.out.println(mySingleton2.hashCode());

	}
}
