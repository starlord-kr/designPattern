package com.slowstarter.designpatterns.observer.kindergarten;

import java.util.ArrayList;
import java.util.List;

public class KinderGarten implements Subject {
	
	private List<Observer> observerList = new ArrayList<>();
	private List<Father> fatherList = new ArrayList<>();
	private List<Mother> matherList = new ArrayList<>();
	
	@Override
	public void attatch(Observer observer) {
		observerList.add(observer);
		
		if(observer instanceof Father) {
			fatherList.add((Father) observer);
		} else if(observer instanceof Mother) {
			matherList.add((Mother) observer);
		}
	}

	@Override
	public void detach(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observerList) {
			observer.update();
		}
	}
	
	public void notifyFathers() {
		for(Observer observer : fatherList) {
			observer.update();
		}
	}
	
	public void notifyMothers() {
		for(Observer observer : matherList) {
			observer.update();
		}
	}
}
