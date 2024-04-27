import java.util.Scanner;

public class App {

    static int[] vetor = new int[10];
    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        preencherVetor();

        int numero = Integer.parseInt(SCAN.nextLine());
        boolean retorno = encontrarNumero(numero);

        if (retorno == true) {
            System.out.println("ACHEI!");
        } else {
            System.out.println("NAO ACHEI.");
        }
    }

    public static void preencherVetor() {

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(SCAN.nextLine());
        }
    }

    public static boolean encontrarNumero(int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }
}
