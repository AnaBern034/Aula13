package ExercicioSeis;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero, soma=0;

        do {
            System.out.println("Digite um numero:");
            numero = ler.nextInt();
            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0) ;
        System.out.println("A soma dos numeros é: "+ soma);

    }
}
