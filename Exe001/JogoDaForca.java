import java.util.Scanner;

public class JogoDaForca {
    private static final String[] PALAVRAS = {"JAVA", "PROGRAMACAO", "DESENVOLVIMENTO", "SOFTWARE", "COMPUTADOR"};
    private static final int MAX_TENTATIVAS = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavraSecreta = PALAVRAS[(int) (Math.random() * PALAVRAS.length)];
        char[] progresso = new char[palavraSecreta.length()];
        for (int i = 0; i < progresso.length; i++) {
            progresso[i] = '_';
        }

        int tentativas = 0;
        boolean venceu = false;

        System.out.println("Bem-vindo ao Jogo da Forca!");

        while (tentativas < MAX_TENTATIVAS && !venceu) {
            System.out.println("\nPalavra: " + new String(progresso));
            System.out.println("Tentativas restantes: " + (MAX_TENTATIVAS - tentativas));
            System.out.print("Digite uma letra: ");
            char tentativa = scanner.next().toUpperCase().charAt(0);

            boolean acertou = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == tentativa) {
                    progresso[i] = tentativa;
                    acertou = true;
                }
            }

            if (!acertou) {
                tentativas++;
                System.out.println("Errado! Essa letra não está na palavra.");
            }

            if (new String(progresso).equals(palavraSecreta)) {
                venceu = true;
            }
        }

        if (venceu) {
            System.out.println("\nParabéns! Você adivinhou a palavra: " + palavraSecreta);
        } else {
            System.out.println("\nVocê perdeu! A palavra era: " + palavraSecreta);
        }

        scanner.close();
    }
}
