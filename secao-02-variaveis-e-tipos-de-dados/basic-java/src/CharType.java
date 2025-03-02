public class CharType {

    public static void main(String[] args) {

        char c1 = 'A';
        System.out.println(c1);

        // ASCII table
        int i1 = c1;
        System.out.println(i1);

        char c2 = 'A' + 2;
        int i2 = c2;
        System.out.println(c2);
        System.out.println(i2);

        char c3 = 49;
        System.out.println(c3);

        char c4 = (char) -10;  // cuidado, o valor pode ser o não esperado
        System.out.println(c4);
    }
}
