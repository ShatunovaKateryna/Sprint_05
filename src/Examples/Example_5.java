package Examples;

public class Example_5 {
    public static void main(String[] args) {
        drawLine(5, "+", "|", "o");
        System.out.println();
        drawLine(9, "+", "|", "o");
        System.out.println();
        drawLine(11, "+", "|", "o");
        System.out.println();
        drawLine(8, "+", "|", "o");
        System.out.println();
        drawLine(3, "+", "|", "o");

    }

    public static void drawLine(int lineWidth, String sym, String startSym, String endSym) {
        System.out.print(startSym);
        for (int i = 2; i <= lineWidth - 1; i++) {
            System.out.print(sym);
        }
        System.out.print(endSym);
    }

    public static void drawLine(int lineWidth, String sym) {
        for (int i = 1; i <= lineWidth; i++) {
            System.out.print(sym);
        }
    }

    public static void drawLine(int lineWidth) {
        for (int i = 1; i <= lineWidth; i++) {
            System.out.print("*");
        }
    }
}
