package Sprint;

public class Ex_4 {
    public static final double G = 6.67 * Math.pow(10, -11);//m3/kg*s2 universal gravity
    public static final double Me = 5.98 * Math.pow(10, 24);//kg mass of earth
    public static final double R = 6.3781 * Math.pow(10, 6);//m radius of earth

    public static void main(String[] args) {
        double a = satelliteSpeed(35786000);//геостационарная орбита
        double b = satelliteSpeed(545000);//хаббл
        double c = satelliteSpeed(20000000);//gps
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        double km = (c*3600)/1000;//км в час
        System.out.println((int)km);//км в час
    }

    public static double satelliteSpeed(double d) {
        double r = R + d;//m
        double v = Math.sqrt((G * Me) / r);//m/s
        //System.out.println(v);
        return v;
    }
}
