package com.slowstarter.designpatterns.adaptor;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public class CollectionMain {

	public static void main (String[] args) {
		// int [] ourArray = {0,1,2,3,4,5,6,7,8,9};
        Vector<Integer> vector = new Vector<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        //Get Enumerator 
        Enumeration<Integer> enumerator = vector.elements();

        EnumerationItorator enumerationItorator = new EnumerationItorator(enumerator);
        System.out.println("========================================");
        System.out.println("** Enumeration Itorator");
        while(enumerationItorator.hasNext()) {
            System.out.print(enumerationItorator.next() + " : ");
        }
        System.out.println();
        System.out.println("========================================");
        
        
        System.out.println("========================================");
        System.out.println("** Itorator Enumeration");
        Map <String,Integer> testMap = new HashMap<String,Integer>();
        testMap.put("one",1);
        testMap.put("two",2);
        testMap.put("three",3);
        
        Iterator iterator = testMap.entrySet().iterator();
        IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(iterator);
        while(iteratorEnumeration.hasMoreElements()) {
            System.out.println(iteratorEnumeration.nextElement() + " : ");
        }
        
        Iterator iteratorKey = testMap.keySet().iterator();
        IteratorEnumeration iteratorEnumerationKey = new IteratorEnumeration(iteratorKey);
        while(iteratorEnumerationKey.hasMoreElements()) {
            System.out.println(iteratorEnumerationKey.nextElement() + " : ");
        }
        
        Iterator iteratorValue = testMap.values().iterator();
        IteratorEnumeration iteratorEnumerationValue = new IteratorEnumeration(iteratorValue);
        while(iteratorEnumerationValue.hasMoreElements()) {
            System.out.println(iteratorEnumerationValue.nextElement() + " : ");
        }
        
        System.out.println("========================================");
	}
}
