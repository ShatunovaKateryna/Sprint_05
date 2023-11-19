package Examples;

public class Example_3 {
    public static void main(String[]args){
        drawLine2(6,"#");
        System.out.print("\n");
        drawLine2(11,"-");
        System.out.print("\n");
        drawLine2(3,"+");
    }
    public static void drawLine2(int lineWidth, String sym) {
        for (int i = 1; i <= lineWidth; i++) {
            System.out.print(sym);
        }
    }
    public static void drawLine ( int lineWidth){
        for (int i = 1; i <= lineWidth; i++) {
            System.out.print("*");
        }
    }
}
