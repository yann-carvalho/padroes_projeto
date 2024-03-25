package br.com.yancarvalho.apps;

import br.com.yanncarvalho.contas.Conta;
import br.com.yanncarvalho.contas.ContaEspecial;
import br.com.yanncarvalho.contas.ContaInvestimento;

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        ContaEspecial contaesp1 = new ContaEspecial();
        ContaInvestimento contaInv1 = new ContaInvestimento();

        conta1.setNumero(1);
        conta1.setSaldo(10000);
        conta1.depositar(10000);
        conta2.setNumero(2);
        conta2.setSaldo(20000);
        conta2.sacar(5000);

        contaesp1.setNumero(1);
        contaesp1.setSaldo(12000);
        contaInv1.setNumero(2);
        contaInv1.setSaldo(13000);

        System.out.println("Número da conta 1: " + conta1.getNumero());
        System.out.println("Número do saldo 1: " + conta1.getSaldo());
        System.out.println("Número da conta 2: " + conta2.getNumero());
        System.out.println("Número do saldo 2: " + conta2.getSaldo());


    }
}