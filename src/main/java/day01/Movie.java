package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int release;
    private List<Actor> actorList = new ArrayList<>();

    public Movie(String title, int release) {
        this.title = title;
        this.release = release;
    }

    public void addActor(Actor actor){
        this.actorList.add(actor);
    }
    public int actorsInTheirTwenties(){
        int result = 0;
        for (int i = 0; i < actorList.size(); i++){
            int age = release - actorList.get(i).getYob();
            if (age > 19 & age < 30){
                result++;
            }
        }return result;
    }
}
