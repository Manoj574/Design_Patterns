package Iterator;

import java.util.ArrayList;
import java.util.List;

public class IndianChannelCollection implements ChannelCollection{

    List<Channel> list;
    @Override
    public void addChannel(Channel channel) {
        if(list == null){
            list = new ArrayList<>();
        }
        list.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        if(list == null || !list.contains(channel)){
            return;
        }
        list.remove(channel);
    }

    @Override
    public ChannelIterator getChannelIterator(ChannelType reqType) {
        return new ChannelIterator(list, reqType);


    }
}
