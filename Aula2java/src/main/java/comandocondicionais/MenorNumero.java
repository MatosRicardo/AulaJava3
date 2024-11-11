package comandocondicionais;
import java.util.Scanner;

public class MenorNumero {

    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = in.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = in.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3 = in.nextInt();

        if(num1 < num2 && num1 < num3 ) {
            System.out.println("O número  menor é" + num1 + " pois os outros números são " + num2 + " " +num3);
    } else if(num2 < num1 && num2 < num3) {
            System.out.println("O número menor é " + num2 + " pois os outros números são " + num1 + " " + num3);
        } else if(num3 < num1 && num3 < num2) {
            System.out.println("O número menor é " + num3 + " pois os outros números são " + num1 + " " + num2);
        }
    }
}
