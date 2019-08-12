import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter \"2\" if you want 2 - dimentional fractal\n" +
                "enter \"3\" if you want 3 - dimentional fractal");
        int dimention = scanner.nextInt();

        System.out.println("*********************************************");
        Iks2 iks2 = new Iks2(1);
        //System.out.println(iks2.generateListOfPoints());
        iks2.drawIks2(1111);
    }
}
