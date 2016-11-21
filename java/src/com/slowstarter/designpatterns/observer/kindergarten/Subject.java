package com.slowstarter.designpatterns.observer.kindergarten;

interface Subject {
	
	void attatch(Observer observer);
	void detach(Observer observer);
	void notifyObservers();
}
