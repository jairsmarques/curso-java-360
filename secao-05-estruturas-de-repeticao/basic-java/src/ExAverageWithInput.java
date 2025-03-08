public class ExAverageWithInput {

    public static void main(String[] args) {

        var scanner = new java.util.Scanner(System.in);
        int n = 1;
        double sum = 0.0;

        while (true) {
            System.out.print("Digite a nota " + n + ": ");
            String line = scanner.nextLine();
            if (line.equals("")) { // .isBlank() -> verifica se está vazia
                n--;
                break;
            }

            sum += Double.parseDouble(line);
            n++;
        }

        double avg = sum / n;
        System.out.println(n + " nota(s) fornecida(s)");
        System.out.println("A média é: " + avg);
    }
}
