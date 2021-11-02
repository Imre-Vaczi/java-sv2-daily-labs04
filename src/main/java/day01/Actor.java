package day01;

public class Actor {
    private String name;
    private int yob;

    public Actor(String name, int yob) {
        this.name = name;
        this.yob = yob;
    }

    public String getName() {
        return name;
    }

    public int getYob() {
        return yob;
    }
}
