package HomeWork4;

public class Car extends Vehicle{
    int handsteer;
    int gear;
    int headlights;
    int CurrentGear = 0;

    public Car (int handsteer, int headlights, int gear){
        this.handsteer = handsteer;
        this.headlights = headlights;
        this.gear = gear;
    }
    public Car (){
        this.handsteer = handsteer;
        this. headlights = headlights;
        this.gear = gear;
        this.CurrentGear = 0;
    }
    public void gear (int gear) {
        this.CurrentGear = gear;
            System.out.println("USing " + CurrentGear + " gear.");
    }
    public static void main(String [] args) {
        Car mers = new Car (1, 2, 1);
        mers.steer(90 );
        int voil = mers.getCurrentVelocity();

        Car ford = new Car (1, 2, 1);
        ford.move(10, -90);
        int voil1 = ford.getCurrentVelocity();

        Car bmw = new Car (1, 2, 1);
        bmw.move(10, 90);
        int voil2 = bmw.getCurrentVelocity();
    }
    public int getCurrentGear() {
        return CurrentGear;
    }

}
