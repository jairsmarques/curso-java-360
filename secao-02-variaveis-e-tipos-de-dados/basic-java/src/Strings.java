public class Strings {

    public static void main(String[] args) {

        // String não é um tipo primitivo e sim uma classe
        // cadeia de caracteres

        String s = "abc";
        String f = "FFF";
        String z = s + f;
        System.out.println(z);

        z = z.toLowerCase();
        System.out.println(z);

        z = z.toUpperCase();
        System.out.println(z);
    }
}
