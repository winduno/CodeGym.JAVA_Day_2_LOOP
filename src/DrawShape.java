import java.util.Scanner;

public class DrawShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                DrawRect();
                break;
            case 2:
                DrawTriangles();
                break;
            case 3:

                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }


    }

    public static void DrawRect(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void DrawTriangles(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 7; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 7; i > 0; i--) {
            for (int j = 7; j > 0; j--) {
                if (i < j){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 7; i > 0; i--) {
            for (int j = 1; j < 8; j++) {
                if (j >= i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void DrawIsoscelesTriangles(){
        for (int i = 0; i < 7; i++) {

        }
    }
}
