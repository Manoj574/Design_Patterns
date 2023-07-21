package Iterator;

import java.util.List;

public class ChannelIterator implements Iterator{

    private List<Channel> list;
    private ChannelType type;
    private int pos;

    public ChannelIterator(List<Channel> list, ChannelType type){
        this.list = list;
        this.type = type;
    }
    @Override
    public boolean hasNext() {
        while(this.pos < this.list.size()){
            if(this.type == list.get(pos).getChannelType() || this.type == ChannelType.ALL){
                return true;
            }
            this.pos++;
        }
        return false;
    }

    @Override
    public Channel next() {
        return list.get(pos++);
    }
}
