package com.slowstarter.designpatterns.observer.kindergarten;

public class FindYourChild {

	public static void main(String[] args) {
		
		Father father1 = new Father("유지환");
		Father father2 = new Father("Jessy");
		
		Mother mother1 = new Mother("유지환");
		Mother mother2 = new Mother("handerson");
		
		
		KinderGarten kinderGarten = new KinderGarten();
		kinderGarten.attatch(father1);
		kinderGarten.attatch(father2);
		
		kinderGarten.attatch(mother1);
		kinderGarten.attatch(mother2);
		
		
		System.out.println("Notify All Parents ... ");
		kinderGarten.notifyObservers();
		System.out.println("\n");
		
		System.out.println("Notify Fathers ... ");
		kinderGarten.notifyFathers();
		System.out.println("\n");
		
		System.out.println("Notify Mothers ... ");
		kinderGarten.notifyMothers();
		System.out.println("\n");
	}
}
