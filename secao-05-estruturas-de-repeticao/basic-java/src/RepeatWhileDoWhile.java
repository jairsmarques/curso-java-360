public class RepeatWhileDoWhile {

    public static void main(String[] args) {

        System.out.println("WHILE");
        int i = 0;

        // Estrutura mais usada
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("FIM!");

        System.out.println("-----------------------------------");
        System.out.println("DO..WHILE");
        int j = 0;

        do {
            System.out.println(j);
            j++;
        } while (j <= 10);
    }
}
