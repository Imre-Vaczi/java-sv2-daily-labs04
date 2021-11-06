package day04;

public class PlaneMain {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.setCapacity(4);
        System.out.println(plane.addPassanger(new Passanger("firstPassanger", "ID01", 1)));
        System.out.println(plane.addPassanger(new Passanger("secPassanger", "ID02", 2)));
        System.out.println(plane.addPassanger(new Passanger("thirdPassanger", "ID03", 3)));
        System.out.println(plane.addPassanger(new Passanger("forthPassanger", "ID04", 4)));
        System.out.println(plane.addPassanger(new Passanger("fifthPassanger", "ID05", 1)));

        System.out.println(plane.numberOfPackages());

    }
}
