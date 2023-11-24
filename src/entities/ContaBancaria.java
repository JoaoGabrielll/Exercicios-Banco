package entities;

import util.Formatadores;

public class ContaBancaria {

    private String numConta;
    private double saldo;

    public ContaBancaria(String numConta, double saldo){
        this.numConta = numConta;
        this.saldo = saldo;

    }
    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Metodo para depositos na conta:
    public String depositoEmConta(double deposito){
            this.saldo += deposito;
            System.out.println("Deposito de " +
                    Formatadores.formatarSaldoConta(deposito) +
                    " efetuado");
            return "Saldo atual da conta: " + Formatadores.formatarSaldoConta(saldo);
    }

    //Metodo para saque na conta:
    public String saqueConta(double valorSaque){

        double valorTotalSaque = valorSaque + 2.0;

        if (valorTotalSaque <= this.saldo && valorSaque >= 0){
            this.saldo -= valorTotalSaque;
            System.out.println("Saque de " +
                    Formatadores.formatarSaldoConta(valorSaque) +
                    " efetuado");
            return "Saldo atual da conta: " + Formatadores.formatarSaldoConta(saldo);
        }else{
            return "Saldo indisponivel para saque";
        }
    }

    public String mostrarSaldo(){
        return "Saldo:" + Formatadores.formatarSaldoConta(saldo);
    }

    public String toString(){
        return "\nEsse é o numero da sua conta: " +
                Formatadores.formatarNumConta(numConta) +
                "\nSeu saldo é: " +
                Formatadores.formatarSaldoConta(saldo);

    }
}