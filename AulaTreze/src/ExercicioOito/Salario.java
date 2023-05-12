package ExercicioOito;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o salario de duas pesssoas: ");
        int [] salarioAtual = new int[2];
        for (int i = 0; i < salarioAtual.length; i++) {
            salarioAtual[i]= ler.nextInt();
        }
        System.out.println("Digite o valor de reajuste: ");
        int reajuste = ler.nextInt();
        int exibição[] = new int[2];

        for (int i = 0; i < exibição.length; i++) {
            int alteração=0;
            exibição[i]= alteração;
            alteração = salarioAtual[i] +reajuste;
            System.out.println("Os valores reajustados foram: "+alteração);
        }



    }
}
