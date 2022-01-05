import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    drawTriangle();
                    break;
                case 2:
                    drawSquare();
                    break;
                case 3:
                    drawIsoscelesTriangle();
                    break;
                case 0:
                    break;
                default:
                    alertInvalidInput();
            }
        } while (choice != 0);
        exit();
    } // end of main method

    public static void alertInvalidInput() {
        System.out.println("Please enter one of the numbers below!");
    }

    public static void exit() {
        System.out.println("Exiting...\nGoodbye.");
    }

    public static void drawTriangle() {
        System.out.print("Enter triangle's side length: ");
        int side = sc.nextInt();

        System.out.println("1. top-left");
        System.out.println("2. top-right");
        System.out.println("3. bottom-left");
        System.out.println("4. bottom-right");
        System.out.println("Other. default");
        System.out.print("Enter the right corner: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            default:
                drawTriangleTopLeft(side);
                break;
            case 2:
                drawTriangleTopRight(side);
                break;
            case 3:
                drawTriangleBottomLeft(side);
                break;
            case 4:
                drawTriangleBottomRight(side);
                break;
        }


    }

    public static void drawTriangleTopLeft(int side) {
        for (int row = 0; row < side; row++) {
            for (int count = side - row; count > 0; count--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void drawTriangleTopRight(int side) {
        for (int row = 0; row < side; row++) {
            for (int count = 0; count < row; count++) {
                System.out.print("  ");
            }

            for (int count = side - row; count > 0; count--) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }
    }

    public static void drawTriangleBottomLeft(int side) {
        for (int row = 0; row < side; row++) {
            for (int count = 0; count <= row; count++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void drawTriangleBottomRight(int side) {
        for (int row = 0; row < side; row++) {
            for (int count = side - 1; count > row; count--) {
                System.out.print("  ");
            }
            for (int count = 0; count <= row; count++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void drawSquare() {
        System.out.print("Enter square's side length: ");
        int side = sc.nextInt();

        for (int row = 0; row < side; row++) {
            for (int col = 0; col < side; col++) {
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }

    public static void drawIsoscelesTriangle() {
        System.out.print("Enter triangle's height: ");
        int height = sc.nextInt();

        for (int row = 0; row < height; row++) {
            for (int i = height-row; i > 0; i--) {
                System.out.print("   ");
            }
            for (int j = -1; j < row; j++) {
                System.out.print("*  ");
            }
            for (int k = 0; k <row; k++){
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }

}
