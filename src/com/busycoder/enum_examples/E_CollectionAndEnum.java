package com.busycoder.enum_examples;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map.Entry;
import java.util.Set;

enum MyCounter {
	ONE(1), TWO(2);

	private int counter;

	private MyCounter(int counter) {
		this.counter = counter;
	}

	public int getCounter() {
		return counter;
	}

}

public class E_CollectionAndEnum {

	public static void main(String[] args) {

		//EnumMap
		EnumMap<MyCounter, String> enumMap=new EnumMap<>(MyCounter.class);
		
		enumMap.put(MyCounter.ONE, "it is one");
		enumMap.put(MyCounter.TWO, "it is two");
//		
//		Set<MyCounter> keySet = enumMap.keySet();
//		
//		for(MyCounter c: keySet) {
//			System.out.println(c.name()+": "+enumMap.get(c));
//		}
		

//		Set<Entry<MyCounter, String>> entrySet = enumMap.entrySet();
//		
//		for(Entry<MyCounter, String>  e: entrySet) {
//			System.out.println(e.getKey()+": " +e.getValue());
//		}
		
		enumMap.forEach((k,v)->System.out.println(k+": "+ v));
		
		//EnumSet
		
//		for(MyCounter c: EnumSet.range(MyCounter.ONE, MyCounter.TWO)) {
//			System.out.println(c.name());
//		}
	}
}
