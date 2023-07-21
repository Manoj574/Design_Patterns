package Iterator;

public class Channel {

    private double freq;
    private ChannelType type;

    public Channel(double freq, ChannelType type){
        this.freq = freq;
        this.type = type;
    }

    public double getFreq() {
        return this.freq;
    }

    public ChannelType getChannelType(){
        return this.type;
    }
    public String toString(){
        return "Frequency : "+this.freq+" Channel Type : "+this.type;
    }
}
