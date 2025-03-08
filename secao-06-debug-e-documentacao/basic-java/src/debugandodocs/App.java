package debugandodocs;

public class App {

    public static void main(String[] args) {
        // Comentário qualquer
        int x = 2;
        int y = x + 5;
        // FIXME corrigir aqui

        while (y < 10) {
            System.out.println(y);
            y += 2;
            // TODO voltar aqui depois
        }

        /* Comentário de
           várias
           linhas
        */
    }
}
