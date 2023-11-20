package Examples;

public class Example_2 {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        drawLine(6);
        System.out.print("\n");
        drawLine(10);
    }

    public static void drawLine(int lineWidth) {
        for (int i = 1; i <= lineWidth; i++) {
            System.out.print("*");
        }
    }
}
