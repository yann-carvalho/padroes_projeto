package br.com.yanncarvalho.contas;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial() {
        super();
    }

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() >= valor) {
            double novoSaldo = getSaldo() - (valor * 0.99);
            setSaldo(novoSaldo);
            return true;
        } else {
            return false;
        }
    }

}
