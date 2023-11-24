package entities;

import util.Formatadores;

public class ContaBancaria {

    private String numConta;
    private double saldo;
    private double deposito;
    private double saque;

    public ContaBancaria(String numConta, double saldo, double deposito, double saque){
        this.numConta = numConta;
        this.saldo = saldo;
        this.deposito = deposito;
        this.saque = saque;
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

    public double getDeposito() {
        return deposito;
    }
    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }
    public void setSaque(double saque) {
        this.saque = saque;
    }


    public String toString(){
        return "\nEsse é o numero da sua conta: " +
                Formatadores.formatarNumConta(numConta) +
                "\nSeu saldo é: " +
                Formatadores.formatarSaldoConta(saldo);

    }
}