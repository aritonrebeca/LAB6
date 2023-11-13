public class Bicycle extends Vehicle {
    private static final String TYPE = "Bicycle";

    public void speedUp(){
        int increasedSpeed = 5;
        setspeed(getSpeed() + increasedSpeed );
        System.out.println( TYPE + "Speed incresed by " + increasedSpeed + " units.New speed: " + getSpeed());
    }

}
