package comandocondicionais;
import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        float n1 , n2, n3, media;

        Scanner nota = new Scanner(System.in);

        System.out.print(" entre com a primeira nota: ");
        n1 = nota.nextFloat();

        System.out.print(" entre com a segunda nota: ");
        n2 = nota.nextFloat();

        System.out.print(" entre com a terceira nota: ");
        n3 = nota.nextFloat();

        media = (n1+n2+n3)/3;
        System.out.printf(" a media das notas é: %.2f", media);

        if (media >=7) {
            System.out.println(" Você está aprovado!");
        } else if (media >= 5) {
            System.out.println(" Você está de recuperação!");
        } if (media < 5){
            System.out.println(" Você está repovado!");
        }
    }
}
