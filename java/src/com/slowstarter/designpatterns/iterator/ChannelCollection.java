package com.slowstarter.designpatterns.iterator;

/**
 * @reference http://www.journaldev.com/1716/iterator-design-pattern-in-java-example-tutorial
 */
public interface ChannelCollection {
    
    public void addChannel(Channel c);
    public void removeChannel(Channel c);
    public ChannelIterator iterator(ChannelTypeEnum type);
    
}
