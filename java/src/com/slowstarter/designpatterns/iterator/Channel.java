package com.slowstarter.designpatterns.iterator;

/**
 * @reference http://www.journaldev.com/1716/iterator-design-pattern-in-java-example-tutorial
 */
public class Channel {
    private double frequency;
    private ChannelTypeEnum TYPE;
     
    public Channel(double freq, ChannelTypeEnum type){
        this.frequency=freq;
        this.TYPE=type;
    }
 
    public double getFrequency() {
        return frequency;
    }
 
    public ChannelTypeEnum getTYPE() {
        return TYPE;
    }
     
    @Override
    public String toString(){
        return "Frequency="+this.frequency+", Type="+this.TYPE;
    }
}
