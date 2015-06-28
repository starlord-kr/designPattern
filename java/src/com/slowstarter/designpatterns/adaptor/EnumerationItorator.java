package com.slowstarter.designpatterns.adaptor;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationItorator implements Iterator<Object> {

	Enumeration<?> enumeration;
	
	public EnumerationItorator (Enumeration<?> enumeration) {
		this.enumeration = enumeration;
	}
	
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement();
	}
	
	public void remove () {
		throw new UnsupportedOperationException ();
	}

}
