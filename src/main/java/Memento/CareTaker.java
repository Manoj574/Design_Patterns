package Memento;

import java.util.ArrayList;
import java.util.Stack;

public class CareTaker {

    private Stack<Memento> list = new Stack<>();

    public void addMemento(Memento m){
        list.push(m);
    }

    public Memento getMemento(int i){
        if(i < list.size()){
            return list.get(i);
        }
        throw new ArrayIndexOutOfBoundsException("Memento not available");
    }

    public Memento undo(){
        if(list.size() > 0){
            return list.pop();
        }
        throw new ArrayIndexOutOfBoundsException("No Memento available");
    }
}
