package Iterator;

public class Client {

    public static void main(String[] args) {
        ChannelCollection channels = getChannelCollection();

        ChannelIterator teluguChannelIterator = channels.getChannelIterator(ChannelType.TELUGU);
        System.out.println("Printing All TELUGU Channels");
        while(teluguChannelIterator.hasNext()){
            System.out.println(teluguChannelIterator.next().toString());
        }

        System.out.println("****************************");
        System.out.println("Printing ALl Channels");
        ChannelIterator allChannelIterator = channels.getChannelIterator(ChannelType.ALL);
        while(allChannelIterator.hasNext()){
            System.out.println(allChannelIterator.next().toString());
        }
    }

    private static ChannelCollection getChannelCollection() {
        ChannelCollection channels = new IndianChannelCollection();
        channels.addChannel(new Channel(98.8, ChannelType.TELUGU));
        channels.addChannel(new Channel(97.6, ChannelType.TELUGU));
        channels.addChannel(new Channel(100.2, ChannelType.ENGLISH));
        channels.addChannel(new Channel(102.8, ChannelType.ENGLISH));
        channels.addChannel(new Channel(104.5, ChannelType.HINDI));
        channels.addChannel(new Channel(106.4, ChannelType.HINDI));

        return channels;
    }

}
