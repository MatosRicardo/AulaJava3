package comandocondicionais;
import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {
        int num1, num2;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = in.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo");
        } else if (num2 > num1){
            System.out.println("O numero dois é maior que o numero um");
        } else if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Por favor digite números válidos");
        }
    }

}
