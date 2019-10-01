package HomeWork4;

public class SpecificCar extends Car {

    boolean headlights;

    public SpecificCar (boolean headlights){
        this.headlights = headlights;
        if (headlights == true){
            System.out.println("Headlights switch on");
        }
        if (headlights == false){
            System.out.println("Headlights switch on");
        }
    }

    public static void main (String [] args){
        SpecificCar mersA = new SpecificCar(true);
        mersA.gear(4);
        int bright = mersA.getCurrentGear();
    }
}
