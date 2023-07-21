package Iterator;

import java.util.List;

public interface ChannelCollection {

    public void addChannel(Channel channel);
    public void removeChannel(Channel channel);
    ChannelIterator getChannelIterator(ChannelType type);
}
