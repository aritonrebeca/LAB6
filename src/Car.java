public class Car extends Vehicle{
    private static final String TYPE ="Car";

    public void speedUp(){
        int increasedSpeed = 20;
        setspeed(getSpeed() + increasedSpeed );
        System.out.println( TYPE + "Speed incresed by " + increasedSpeed + " units.New speed: " + getSpeed());
    }

}
