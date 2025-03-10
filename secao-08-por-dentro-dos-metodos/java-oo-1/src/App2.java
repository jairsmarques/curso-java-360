public class App2 {

    public static void main(String[] args) {

        Account a = new Account();
        boolean success;
        if (!a.deposit(-100.0)) {
            System.out.println("Ops, depósito inválido!");
        }
        a.printBalance();

        a.deposit(200.0);

        System.out.println("------------------------");
        if (!a.withdraw(-50.0)) {
            System.out.println("Ops, saque inválido!");
        }
        a.printBalance();

    }
}
