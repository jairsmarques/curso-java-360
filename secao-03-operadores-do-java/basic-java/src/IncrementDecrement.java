public class IncrementDecrement {

    public static void main(String[] args) {

        int a = 2;
        int b = 3 + a++; // incrementa depois de somar

        System.out.println(a);
        System.out.println(b);

        int c = 2;
        int d = 3 + ++c; // incrementa antes de somar
        System.out.println(c);
        System.out.println(d);
    }
}
