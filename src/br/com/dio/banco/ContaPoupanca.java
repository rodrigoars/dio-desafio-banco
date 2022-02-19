package br.com.dio.banco;

public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato (){
        System.out.println("Extrato da Conta Poupança: ");
        super.infosComuns();
    }

}
