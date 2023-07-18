package Observer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Publisher {

    Set<Observer> observers;
    String message = null;
    private final Object MONITOR = new Object();

    public void registerObserver(Observer observer){
        if(observer == null){
            return;
        }
        synchronized (MONITOR){
            if(observers == null){
                observers = new HashSet<Observer>();
            }
            if(!observers.contains(observer)){
                observers.add(observer);
            }
        }
    }

    public void unregisterObserver(Observer observer){
        if(observers == null || !observers.contains(observer)){
            return;
        }
        synchronized (MONITOR){
            observers.remove(observer);
        }
    }
    public void postMessage(String message){
        this.message = message;
        Set<Observer> copyObservers;
        synchronized (MONITOR){
            if(observers == null){
                return;
            }
            copyObservers = new HashSet<Observer>(observers);
        }
        for (Observer copyObserver : copyObservers) {
            copyObserver.update(this.message);
        }
        this.message = null;
    }





}
