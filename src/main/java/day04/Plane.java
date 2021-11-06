package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int capacity;
    private List<Passanger> passangerList = new ArrayList<>();

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean addPassanger(Passanger passanger) {
        if (capacity > passangerList.size()){
            passangerList.add(passanger);
            return true;
        }else{
            return false;
        }
    }
    public int numberOfPackages(){
        int total = 0;
        for (Passanger luggage : passangerList){
            total += luggage.getNumOfPackages();
        }
        return total;
    }
}

