import java.util.Locale;
import java.util.Scanner;

public class Algoritmo03 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //entrada de dados
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        double somaNota = nota1 + nota2 + nota3;
        double media = somaNota / 3;

        System.out.println("=========");
        System.out.println("BOLETIN");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.printf("A média das notas foi: %.2f%n", media);
        if(media < 5) {
            System.out.println("STATUS: Reprovado");
        } else if (media < 9) {
             System.out.println("STATUS: Aprovado");
        } else {
             System.out.println("STATUS: Aprovado com louvor. Parabéns!");
        }
        System.out.println("=========");
        
    }

    
}
