package com.slowstarter.designpatterns.adaptor;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class CollectionMain {

	public static void main (String[] args) {
		// int [] ourArray = {0,1,2,3,4,5,6,7,8,9};
        Vector<Integer> vector = new Vector<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        //Get Enumerator 
        Enumeration<Integer> enumerator = vector.elements();

        EnumerationItorator enumerationItorator = new EnumerationItorator(enumerator);
        System.out.println("========================================");
        System.out.println("** EnumerationItorator");
        while(enumerationItorator.hasNext()) {
            System.out.print(enumerationItorator.next() + ",");
        }
        System.out.println();
        System.out.println("========================================");
        
        
        
	}
}
