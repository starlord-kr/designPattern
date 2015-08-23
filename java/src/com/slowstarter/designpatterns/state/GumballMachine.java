package com.slowstarter.designpatterns.state;

public class GumballMachine {

	State soldState;
	State soldOutState;
	State hasQuarterState;
	State noQuarterState;

	State currentState = soldOutState;
	private int count = 0;

	public GumballMachine(int numberGumballs) {
		this.soldState = new SoldState(this);
		this.soldOutState = new SoldOutState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			currentState = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		currentState.insertQuarter();
	}
	
	public void ejectQuarter() {
		currentState.ejectQuarter();
	}
	
	public void turnCrank() {
		currentState.turnCrank();
		currentState.dispense();
	}
	
	void setState(State state) {
		this.currentState = state;
	}
	
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count -1;
		}
	}
	
	public State getSoldState() {
		return soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getCurrentState() {
		return currentState;
	}
	
	public int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		return "CurrentState : " + currentState + ", Count : " + count;
	}
}
