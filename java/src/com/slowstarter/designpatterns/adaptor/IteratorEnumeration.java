package com.slowstarter.designpatterns.adaptor;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;

public class IteratorEnumeration<E> implements Enumeration<Object> {

	Iterator<E> iterator;
	
	public IteratorEnumeration (Iterator<E> iterator) {
		this.iterator = iterator;
	}
	
	public IteratorEnumeration(Set<String> keySet) {
		this.iterator = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public Object nextElement() {
		return iterator.next();
	}

}
