import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o preço do item?");
        double preco = scanner.nextDouble();

        System.out.println("Qual é a qualidade do item? (de 1 a 10)");
        int qualidade = scanner.nextInt();

        System.out.println("O item é necessário? (true/false)");
        boolean necessario = scanner.nextBoolean();

    
        if (preco < 100 && qualidade >= 8 && necessario) {
            System.out.println("Compre o item.");
        } else {
            System.out.println("Não compre o item.");
        }

        scanner.close();
    }
}
