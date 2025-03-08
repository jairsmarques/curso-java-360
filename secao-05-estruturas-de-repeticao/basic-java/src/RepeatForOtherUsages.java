public class RepeatForOtherUsages {

    public static void main(String[] args) {
        int i;
        int j;

        for (i = 0, j = 9; i < 10; i++, j--) {
            System.out.println(i + " - " + j);
        }

        System.out.println("-------------------------");
        for (int x = 1; x < 100; x *= 2) {
            System.out.print(x + " \n");
        }

        System.out.println("-------------------------");
        int y = 0;
        for(; y < 10 ;) {
            System.out.println("A");
            y++;
        }
    }
}
