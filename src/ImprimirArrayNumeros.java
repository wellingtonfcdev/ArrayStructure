import java.util.Scanner;

public class ImprimirArrayNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int valor = scanner.nextInt();

        int[] numeros = new int[valor];

        for(int i = 0; i < valor; i++){
            numeros[i] = scanner.nextInt();
        }

        for(int i = 0; i < valor; i++){
            System.out.println(numeros[i]);
        }
        scanner.close();
        
    }
}
