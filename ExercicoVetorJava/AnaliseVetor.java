import java.util.Scanner;

public class AnaliseVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        
        int maior = numeros[0];
        int menor = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("\nSoma de todos os valores: " + soma);
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        
        System.out.println("\nValores inseridos:");
        for (int numero : numeros) {
            System.out.print(numero);
            if (numero == maior) {
                System.out.print(" (Maior)");
            }
            if (numero == menor) {
                System.out.print(" (Menor)");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
