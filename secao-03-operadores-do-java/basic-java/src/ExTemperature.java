public class ExTemperature {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Temperature em Fahrenheit: ");
        double tf = Double.parseDouble(scanner.nextLine());
        double tc = (tf - 32 ) / 9 * 5;

        System.out.println(" Temperature em Celsius: " + tc);
        System.out.printf(" Temperature em Celsius: %.2f%n", tc);
    }
}
