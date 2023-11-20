package Sprint;

public class Distance {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        distance(2, 6, 4, 12);
    }

    public static void distance(int x1, int y1, int x2, int y2) {
        System.out.println("Distance is " + Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
}
