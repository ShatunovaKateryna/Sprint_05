package Sprint;

public class Ex_5 {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        int Month = 12;
        System.out.println("Month No   Number of pairs");
        for (int i = 1; i <= Month; i++) {
            System.out.println("\t" + i + "\t\t\t   " + (int) fibonacchi(i));
        }
        System.out.println();
    }

    public static double fibonacchi(int N) {
        double FN = 1 / Math.sqrt(5) * ((Math.pow(((1 + Math.sqrt(5)) / 2), N)) - (Math.pow(((1 - Math.sqrt(5)) / 2), N)));
        return FN;
    }
}
