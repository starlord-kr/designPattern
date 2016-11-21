package com.slowstarter.designpatterns.observer.kindergarten;

public class Mother implements Observer {

	String childName;
	
	Mother(String childName) {
		this.childName = childName;
	}
	
	@Override
	public void update() {
		System.out.println("Im' mother no : " + this.hashCode());
		System.out.println("I'm " + childName + "'s Mother");
		System.out.println("I'll care she.");
	}

}
