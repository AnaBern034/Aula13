package ExercicioNove;

public class posicao {
    public static void main(String[] args) {
        int [] numerosInteiros = new int[50];
        int numero;

        for (int i = 0; i < numerosInteiros.length; i++) {
          numero = i + 101;
          numerosInteiros[i] = numero;
            System.out.println(numero);

        }
    }
}
