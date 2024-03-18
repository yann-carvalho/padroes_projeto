//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta ContaTeste = new Conta(1234, 1000.0);

        double valorSaque = 500.0;
        if (ContaTeste.sacar(valorSaque)) {
            System.out.println("Saque de " + valorSaque + " realizado com sucesso. Novo saldo: " + ContaTeste.saldo);
        } else {
            System.out.println("Saque de " + valorSaque + " falhou. Saldo atual: " + ContaTeste.saldo);
        }

        double valorDeposito = 200.0;
        if (ContaTeste.depositar(valorDeposito)) {
            System.out.println("Depósito de " + valorDeposito + " realizado com sucesso. Novo saldo: " + ContaTeste.saldo);
        } else {
            System.out.println("Depósito de " + valorDeposito + " falhou.");
        }

        System.out.println(ContaTeste.saldo);
    }
}