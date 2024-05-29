package br.com.yanncarvalho.contas;

public class ContaInvestimento extends Conta {
    private double taxa;
    private int prazo;

    public ContaInvestimento() {
        super();
    }

    public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {
        super(numero, saldo);
        this.taxa = taxa;
        this.prazo = prazo;
    }

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() >= valor) {
            double novoSaldo = getSaldo() - (valor * this.taxa);
            setSaldo(novoSaldo);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean depositar(double valor) {
        if (valor >= 0) {
            double novoSaldo = getSaldo() + (valor * this.taxa);
            setSaldo(novoSaldo);
            return true;
        } else {
            return false;
        }
    }

    public void aplicarRendimento(double taxa) {
        double novoSaldo = getSaldo() + (1 + taxa);
        setSaldo(novoSaldo);
    }
}

