public class NumberRepresentation {

    public static void main(String[] args) {

        long a = 20_000_000_000L; // tem que colocar L no final
        double b = 435.567650;
        System.out.println(a);
        System.out.println(b);

        int c = 0b1010_1111_0101; // representa um tipo binário
        System.out.println(c);

        int d = 0x12AF_2020; // representa um tipo hexadecimal
        System.out.println(d);

        int e = 0144;  // representa um tipo octaldecimal
        System.out.println(e);
    }
}
