import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro.");
        int primeiro = sc.nextInt();
        System.out.println("Digite o segundo parâmetro.");
        int segundo = sc.nextInt();

        try {
            contar(primeiro, segundo);
        } catch (ParametrosInvalidosException e) {
            throw new RuntimeException(e);
        }
    }

    static void contar(int primeiro, int segundo) throws ParametrosInvalidosException {
        int contador = segundo - primeiro;
        if (contador < 0) {
            throw new ParametrosInvalidosException("O Segundo parâmetro deve ser maior que o primeiro");
        }
        for (int i = 1; i <= contador; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}