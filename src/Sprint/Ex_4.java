package Sprint;

public class Ex_4 {
    //Shatunova Kateryna CS-12
    public static final double G = 6.67 * Math.pow(10, -11);//m3/kg*s2 universal gravity
    public static final double Me = 5.98 * Math.pow(10, 24);//kg mass of earth
    public static final double R = 6.3781 * Math.pow(10, 6);//m radius of earth

    public static void main(String[] args) {
        //System.out.println(satelliteSpeed(35786000));//геостационарная орбита
        //System.out.println(satelliteSpeed(545000));//хаббл

        System.out.println("The height at which the first space object is located is 35786000 m\nThe height at which the second space object is located is 545000 m\nBut speed of the first object is "+satelliteSpeed(35786000)+" ,and the second object is "+satelliteSpeed(545000)+"\nAs you can see, the lower the height, the higher the speed");
    }

    public static double satelliteSpeed(double d) {
        double r = R + d;//m
        double v = Math.sqrt((G * Me) / r);//m/s
        //System.out.println(v);
        return v;
    }
}
