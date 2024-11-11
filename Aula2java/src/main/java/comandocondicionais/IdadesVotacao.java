package comandocondicionais;
import java.util.Scanner;

public class IdadesVotacao {

    public static void main(String[] args) {
        int age;

        Scanner idade = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        age = idade.nextInt();

        if (age >= 18 && age <= 68) {
            System.out.println("Seu voto é obritório!");
        } else if (age == 16 || age >= 69) {
            System.out.println("Voto é opcional");
        } else {
            System.out.println("Voce ainda não tem idade pra votar");
        }
    }
}
