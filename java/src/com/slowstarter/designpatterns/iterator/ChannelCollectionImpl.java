package com.slowstarter.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @reference http://www.journaldev.com/1716/iterator-design-pattern-in-java-example-tutorial
 */
public class ChannelCollectionImpl implements ChannelCollection {
    private List<Channel> channelsList;
    
    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }
 
    public void addChannel(Channel c) {
        this.channelsList.add(c);
    }
 
    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }
 
    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channelsList);
    }
    
    private class ChannelIteratorImpl implements ChannelIterator {
        
        private ChannelTypeEnum type;
        private List<Channel> channels;
        private int position;
 
        public ChannelIteratorImpl(ChannelTypeEnum ty,
                List<Channel> channelsList) {
            this.type = ty;
            this.channels = channelsList;
        }
 
        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                Channel c = channels.get(position);
                if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }
 
        @Override
        public Channel next() {
            Channel c = channels.get(position);
            position++;
            return c;
        }
 
    }
}
