package ExercicioSete;

import java.util.Scanner;

public class lerNumeroUsuario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;

        System.out.print("Digite seu nome: ");
         nome = ler.next();


        System.out.print("Digite um numero para repetir seu nome: ");
        int numero = ler.nextInt();

        String [] N = new String [numero];
        for (int i = 0; i < N.length ; i++) {
            N[i] = nome;
            System.out.println(nome);

        }


    }
}
