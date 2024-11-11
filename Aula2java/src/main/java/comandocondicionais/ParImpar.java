package comandocondicionais;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        int num;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = in.nextInt();

        if(num % 2 == 0) {
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é impar");
        }
    }
}
