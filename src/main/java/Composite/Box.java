package Composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item{

    List<Item> list;
    public void addItem(Item item){
        if(list == null){
            list = new ArrayList<>();
        }
        list.add(item);
    }
    public void removeItem(Item item){
        if(list == null || !list.contains(item)){
            return;
        }
        list.remove(item);
    }
    @Override
    public int getCost() {
        if(list == null){
            return 0;
        }
        int cost = 0;
        for (Item item : list) {
            cost += item.getCost();
        }
        return cost;
    }
}
