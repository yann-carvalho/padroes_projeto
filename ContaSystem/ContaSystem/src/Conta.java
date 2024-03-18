public class Conta {
    int numero;
    double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldo = this.saldo + valor;
            return true;
        } else {
            return false;
        }

    }
}