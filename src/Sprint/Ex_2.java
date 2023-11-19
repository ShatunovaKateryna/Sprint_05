package Sprint;

public class Ex_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            System.out.println("Roll number " + i + " is " + sumOfTwoDice());
        }
    }

    public static int sumOfTwoDice() {
        int dice_1 = 1 + (int) (Math.random() * 6);
        int dice_2 = 1 + (int) (Math.random() * 6);
        int sum = dice_1 + dice_2;
        return sum;
    }
}
