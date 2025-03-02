public class ExplicitCasting {

    public static void main(String[] args) {

        double d = 240.56;
        int i = (int) d; // casting explicito -> perde valor

        System.out.println(d);
        System.out.println(i);

        long l = 30000000000000L;
        int i2 = (int) l; // cuidado, pois o resultado pode ser totalmente diferente

        System.out.println(l);


        long l2 = 10L;
        int i3 = (int) l2;

        System.out.println(l2);
        System.out.println(i3);
    }
}
