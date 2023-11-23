package application;

import util.Cliente;
import util.ContaBancaria;

import java.util.Scanner;

import static configs.GeradorNumConta.geradorNumConta;

public class Program {
    public static void main(String[]args){
        Scanner tc = new Scanner(System.in);

        //Definindo a quantidade de caracters do numero da conta bancária
        int numConta = 6;
        String nome, cpf, dataNascimento;

        String numeroGerado = geradorNumConta(numConta);

        System.out.println("-----Bem-Vindo ao nosso banco-----");

        System.out.println("Para abrir uma conta, insira seus dados");
        System.out.println("Nome completo");
        nome = tc.nextLine();

        //conferindo se o CPF etá correto
        do{
            System.out.println("Insira o CPF(APENAS NÚMEROS)");
            cpf = tc.nextLine();

            if (cpf.length() != 11){
                System.out.println("CPF inválido. O CPF deve ter 11 dígitos.");
            }
        } while (cpf.length() != 11);

        //Conferindo se a data está correta
        do{
            System.out.println("Insira sua data de nascimento(APENAS NÚMEROS: DDMMAAAA)");
            dataNascimento = tc.nextLine();

            if (dataNascimento.length() != 8){
                System.out.println("Data invalida. A data deve ter 8 dígitos.");
            }
        } while (dataNascimento.length() != 8);

        System.out.println("Parabéns! Sua conta foi criada" +
                "\n-----Esses são os dados apresentados-----");
        Cliente cliente = new Cliente(nome, cpf, dataNascimento);
        ContaBancaria conta = new ContaBancaria(numeroGerado, 0, 0.0, 0.0);

        System.out.println(cliente);
        System.out.println(conta);

        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⢛⣿⣿⣿⣿⠟⠛⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠱⠄⢸⣿⣿⡿⡑⠄⢠⣿⣿⠛⠿⢋⡙⠿⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⡿⠿⠿⠿⠿⠿⠿⠿⣿⣿⣿⢃⡇⠄⢸⣿⡟⣰⠁⠄⣾⣿⣿⣧⣤⣤⣤⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⠿⠿⠿⢿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⣿⣿⡏⣸⡇⠄⢸⡿⢱⡏⠄⢠⣿⣿⣿⡟⢉⣶⡆⠈⣿⡟⠄⢰⢟⡁⠄⢈⣿⡟⠄⢀⣿⣿⠇⠄⣸⣿⠄⠄⠄⠄⠄⠄⠰⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣷⣶⣶⣶⣶⣶⣶⣶⣿⣿⢡⣿⡇⠄⢸⢡⣿⠁⠄⢸⣿⣿⡏⠄⠸⢛⣠⣼⣿⠄⠄⣰⣿⠁⠄⣼⣿⠃⠄⣸⣿⡏⠄⢠⣿⣿⣶⣶⣶⣶⣶⣶⣶⣾⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⢻⡿⢃⣾⣿⠁⠄⢠⣿⣿⡄⠄⠘⠿⠟⡁⠄⠘⠿⠿⠟⡁⠄⢸⣿⡇⠄⠰⠿⣋⠄⠄⠿⠟⡀⠄⠸⠿⣡⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⣤⣴⣿⣿⣿⣤⣴⣿⣿⣿⣿⣤⣤⣴⣿⣿⣦⣤⣤⣴⣾⣿⣤⣼⣿⣷⣤⣤⣾⣿⣦⣤⣴⣿⣷⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("");
        tc.close();
    }
}