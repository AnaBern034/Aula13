/* Escreva um algoritmo que leia o número de identificação, as 3 notas
obtidas por um aluno nas 3 verificações e a média dos exercícios que
fazem parte da avaliação, e calcule a média de aproveitamento,
usando a fórmula: MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7

A atribuição dos conceitos obedece a tabela abaixo. O algoritmo
deve escrever o número do aluno, suas notas, a média dos exercícios,
a média de aproveitamento, o conceito correspondente e a
mensagem 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o
conceito for D ou E.
Média de aproveitamento Conceito
>= 90 A
>= 75 e < 90 B
>= 60 e < 75 C
>= 40 e < 60 D
< 40 E */


package ExercicioTres;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Double> nota = new ArrayList<>();
        double[] notas = new double[3];
        System.out.println("Digite o numero de identifação");
        int numero;
        numero = ler.nextInt();

        System.out.println("Digite o seu nome");
        String nome = ler.next();

        System.out.println("Digite as notas: ");
        for (int i = 0; i < 3; i++) {

            notas[i] = ler.nextDouble();

        }
        System.out.println("Digite a media dos exercicio");
        double media = ler.nextDouble();

        Double mediaDeAproveitamento = (notas[0] + notas[1] * 2 + notas[2] * 3 + media) / 7;
        System.out.println("Numero de identificação do aluno " + numero);
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Notas: " + notas[0] + "," + notas[1] + "," + notas[2]);
        System.out.println("Media dos exercicios: " + media);
        System.out.println("Media de aproveitamento: " + mediaDeAproveitamento);


        /*if (mediaDeAproveitamento >= 90) {
            return "A";
        } else if (mediaDeAproveitamento >= 76) {
            return "B";
        } else if (mediaDeAproveitamento >= 60) {
            return "C";
        } else if (mediaDeAproveitamento >= 40) {
            return "D";
        } else {
            return "E";
        }*/

          String resultado = validacao(mediaDeAproveitamento);

         if (resultado.equals("A")  || resultado.equals("B") || resultado.equals("B") ){
             System.out.println("Aprovado");
         }else {
             System.out.println("Reprovado");
         }
    }
    public static String validacao(double mediaDeAproveitamento){

        if (mediaDeAproveitamento >= 90) {
            return "A";
        } else if (mediaDeAproveitamento >= 76) {
            return "B";
        } else if (mediaDeAproveitamento >= 60) {
            return "C";
        } else if (mediaDeAproveitamento >= 40) {
            return "D";
        } return "E";
        }
    }
