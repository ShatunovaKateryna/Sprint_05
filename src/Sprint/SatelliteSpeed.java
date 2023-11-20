package Sprint;

public class SatelliteSpeed {
    //Shatunova Kateryna CS-12
    public static final double G = 6.67 * Math.pow(10, -11);
    public static final double Me = 5.98 * Math.pow(10, 24);
    public static final double R = 6.3781 * Math.pow(10, 6);

    public static void main(String[] args) {
        System.out.println("The height at which the first space object is located is 35786000 m\n" +
                "The height at which the second space object is located is 545000 m\n" +
                "But speed of the first object is " + satelliteSpeed(35786000) +
                " ,and the second object is " + satelliteSpeed(545000) +
                "\nAs you can see, the lower the height, the higher the speed");
    }

    public static double satelliteSpeed(double d) {
        double r = R + d;
        double v = Math.sqrt((G * Me) / r);
        return v;
    }
}
