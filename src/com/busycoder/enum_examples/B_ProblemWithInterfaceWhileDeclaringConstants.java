package com.busycoder.enum_examples;

/*
 * Problems without eunum:
1. no semantic meaning
2. how to iterate all constants
3. can not get size of constants
 */
interface Months {
	public static final int JAN = 0;
	public static final int FAB = 1;
	public static final int MARCH = 2;

}

interface Gender {
	public static final int MALE = 0;
	public static final int FEMALE = 1;
}

enum FanSwitch{
	OFF, ON;
}

enum MarrageStatus{
	NO, YES;
}

public class B_ProblemWithInterfaceWhileDeclaringConstants {

	public static void main(String[] args) {
		
		MarrageStatus status =MarrageStatus.NO;
		
		switch (status) {
		case NO: System.out.println("one");
		case YES: System.out.println("two");
		}
		
//		if(FanSwitch.OFF==MarrageStatus.NO) {
//			
//		}
		
		if(Months.FAB==Gender.FEMALE) {
			
		}
		
	}
}
