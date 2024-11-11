package comandocondicionais;
import java.util.Scanner;

public class IMC {


    public static void main(String[] args) {
        float peso, altura, imc;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        peso = in.nextFloat();

        System.out.print("Digite a sua altura: ");
        altura = in.nextFloat();

        imc = peso / (altura * altura);
        System.out.println(imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if (imc > 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal(Parabéns)");
        } else if (imc > 25 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc > 30 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc > 35 && imc <= 39.9) {
            System.out.println("Obesidade grau II(Severa)");
        } else if (imc > 40) {
            System.out.println("Obesidade gráu III(Mórbida)");
        } else{
            System.out.println("Digite um peso valido");
        }
    }
}
