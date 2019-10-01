package HomeWork4;

public class SpecificCar extends Car {
    int headlights;

    public SpecificCar (int headlights){
        this.headlights = headlights;
    }

    public static void main (String [] args){
        SpecificCar mersA = new SpecificCar(1);
        mersA.gear(1);
        int bright = mersA.getCurrentGear();
    }
}
