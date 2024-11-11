package comandocondicionais;
import java.util.Scanner;

public class CalculoBanco {

    public static void main(String[] args) {
        float salario1, salario2, salario3, salario4, salario5, salario6, media;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o seu primeiro salario: ");
        salario1 = in.nextFloat();
        System.out.print("Digite o seu segundo salario: ");
        salario2 = in.nextFloat();
        System.out.print("Digite o seu terceiro salario: ");
        salario3 = in.nextFloat();
        System.out.print("Digite o seu quarto salario: ");
        salario4 = in.nextFloat();
        System.out.print("Digite o seu quinto salario: ");
        salario5 = in.nextFloat();
        System.out.print("Digite o seu sexto salario: ");
        salario6 = in.nextFloat();

        media = (salario1 + salario2 + salario3 + salario4 + salario5 + salario6) / 6;

        if (media < 500) {
            System.out.println("Nenhum crédito");
        } else if (media >= 501 && media <= 1000) {
            System.out.println("Você terá 30% de crédito ou seja o acréscimo de: " + "R$ " + (media * 0.30));
        } else if (media >= 1001 && media <= 3000) {
            System.out.println("Você terá 40% de crédito ou seja o acréscimo de: " + "R$ " + (media * 0.40));
        } else if (media > 3001) {
            System.out.println("Você terá 50% de crédito ou seja o acréscimo de: " + "R$ " + (media * 0.50));
        } else {
            System.out.println("Digite um valor válido");
        }
    }
}
