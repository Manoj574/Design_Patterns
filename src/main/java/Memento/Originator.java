package Memento;

public class Originator {

    private String state;

    public void setState(String state){
        this.state = state;
    }

    public Memento save(){
        return new Memento(this.state);
    }

    public void restore(Memento m){
        state = m.getState();
    }
    public String getState(){
        return this.state;
    }
}
