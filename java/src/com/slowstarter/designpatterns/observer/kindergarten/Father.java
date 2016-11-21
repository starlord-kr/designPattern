package com.slowstarter.designpatterns.observer.kindergarten;

public class Father implements Observer {

	String childName;
	
	Father(String childName) {
		this.childName = childName;
	}
	
	@Override
	public void update() {
		System.out.println("Im' father no : " + this.hashCode());
		System.out.println("I'm " + childName + "'s Father");
		System.out.println("I'll care him.");
	}
}
