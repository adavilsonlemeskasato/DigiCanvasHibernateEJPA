package digCanvasAPPBaseTerminal;

import java.util.Scanner;

public class Teclado {

    public static String lerString(String rotulo) {
        System.out.println(rotulo);
        Scanner scann = new Scanner(System.in);
        return scann.nextLine();
    }

    public static int lerInt(String rotulo) {
        System.out.println(rotulo);
        Scanner scann = new Scanner(System.in);
        return scann.nextInt();
    }

    public static double lerDouble(String rotulo) {
        System.out.println(rotulo);
        Scanner scann = new Scanner(System.in);
        return scann.nextDouble();
    }

}
