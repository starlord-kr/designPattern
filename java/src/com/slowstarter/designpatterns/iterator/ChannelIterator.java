package com.slowstarter.designpatterns.iterator;

/**
 * @reference http://www.journaldev.com/1716/iterator-design-pattern-in-java-example-tutorial
 */
public interface ChannelIterator {
    
    public boolean hasNext();
    public Channel next();
    
}
