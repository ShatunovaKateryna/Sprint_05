package Sprint;

public class Ex_1 {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        dayOfWeek(2, 14, 2000);
        dayOfWeek(11, 19, 2023);//19.11.2023 неділя = 0
    }

    public static int dayOfWeek(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        System.out.println(d0);
        return d0;
    }
}
