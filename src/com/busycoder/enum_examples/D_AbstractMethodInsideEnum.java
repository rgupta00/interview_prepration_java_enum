package com.busycoder.enum_examples;

//RED,YELLOW,GREEN
enum TrafficLight {
	RED() {

		@Override
		public TrafficLight next() {
			return GREEN;
		}

	},
	YELLOW() {

		@Override
		public TrafficLight next() {
			return RED;
		}

	},
	GREEN() {

		@Override
		public TrafficLight next() {
			return YELLOW;
		}

	};

	public abstract TrafficLight next();
}

public class D_AbstractMethodInsideEnum {

	public static void main(String[] args) {

		TrafficLight light=TrafficLight.GREEN;
		TrafficLight next=light.next();
		
		
	}

}
