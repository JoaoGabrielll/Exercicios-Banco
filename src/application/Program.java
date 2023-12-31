package application;

import entities.Cliente;
import entities.ContaBancaria;
import java.util.Scanner;
import static util.GeradorNumConta.geradorNumConta;

public class Program {
    public static void main(String[]args){
        Scanner tc = new Scanner(System.in);

        //Definindo a quantidade de caracters do numero da conta bancária:
        int numConta = 6;
        //Demais variaveis:
        String senha;
        String nome, cpf, dataNascimento;

        //Variável responsável para receber o número da conta que for gerado:
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
                System.out.println("CPF inválido. O CPF deve conter 11 dígitos.");
            }
        } while (cpf.length() != 11);

        //Conferindo se a data está correta
        do{
            System.out.println("Insira sua data de nascimento(APENAS NÚMEROS: DDMMAAAA)");
            dataNascimento = tc.nextLine();

            if (dataNascimento.length() != 8){
                System.out.println("Data invalida. A data deve conter 8 dígitos.");
            }
        } while (dataNascimento.length() != 8);

        do {
            System.out.println("Crie uma senha numerica de 4 digitos");
            senha = tc.nextLine();

            if (senha.length() != 4){
                System.out.println("[ERRO]A senha numerica deve conter 4 digitos");
            }
        } while (senha.length() != 4);

        //Instanciando objetos:
        Cliente cliente = new Cliente(nome, cpf, dataNascimento);
        ContaBancaria conta = new ContaBancaria(numeroGerado, 0);

        System.out.println("Parabéns! Sua conta foi criada" +
                "\n-----Seus Dados-----");

        System.out.println(cliente);
        System.out.println(conta);

        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⢛⣿⣿⣿⣿⠟⠛⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠱⠄⢸⣿⣿⡿⡑⠄⢠⣿⣿⠛⠿⢋⡙⠿⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⡿⠿⠿⠿⠿⠿⠿⠿⣿⣿⣿⢃⡇⠄⢸⣿⡟⣰⠁⠄⣾⣿⣿⣧⣤⣤⣤⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⠿⠿⠿⠿⢿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⣿⣿⡏⣸⡇⠄⢸⡿⢱⡏⠄⢠⣿⣿⣿⡟⢉⣶⡆⠈⣿⡟⠄⢰⢟⡁⠄⢈⣿⡟⠄⢀⣿⣿⠇⠄⣸⣿⠄⠄⠄⠄⠄⠄⠰⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣷⣶⣶⣶⣶⣶⣶⣶⣿⣿⢡⣿⡇⠄⢸⢡⣿⠁⠄⢸⣿⣿⡏⠄⠸⢛⣠⣼⣿⠄⠄⣰⣿⠁⠄⣼⣿⠃⠄⣸⣿⡏⠄⢠⣿⣿⣶⣶⣶⣶⣶⣶⣶⣾⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⢻⡿⢃⣾⣿⠁⠄⢠⣿⣿⡄⠄⠘⠿⠟⡁⠄⠘⠿⠿⠟⡁⠄⢸⣿⡇⠄⠰⠿⣋⠄⠄⠿⠟⡀⠄⠸⠿⣡⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⣤⣴⣿⣿⣿⣤⣴⣿⣿⣿⣿⣤⣤⣴⣿⣿⣦⣤⣤⣴⣾⣿⣤⣼⣿⣷⣤⣤⣾⣿⣦⣤⣴⣿⣷⣤⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");

        int opcao = 0;

        while (opcao != 4){
            System.out.println("\n1- Realizar um depósito" +
                    "\n2- Realizar um Saque[Taxa de serviço: R$2,00]" +
                    "\n3- Consultar saldo" +
                    "\n4- Sair");
            opcao = tc.nextInt();
                    tc.nextLine();

            switch (opcao){
                case 1:
                    double deposito;
                    do {
                        System.out.println("Valor de depósito:");
                        deposito = tc.nextInt();
                        if (deposito <= 0){
                            System.out.println("Valor invalido");
                        }
                    }while (deposito <= 0);
                    System.out.println(conta.depositoEmConta(deposito));
                break;
                case 2:
                    double saque;
                    String senhaSaque;

                    do {
                        System.out.println("Valor de saque:");
                        saque = tc.nextInt();

                        if (saque <= 0){
                            System.out.println("Valor incorreto");
                        }

                    }while (saque <= 0);
                    tc.nextLine();

                    do {
                        System.out.println("Digite sua senha");
                        senhaSaque = tc.nextLine();

                        if (!senhaSaque.equals(senha)) {
                            System.out.println("Senha incorreta");
                        }
                    }while (!senhaSaque.equals(senha));
                    System.out.println(conta.saqueConta(saque));

                break;
                case 3:
                    System.out.println(conta.mostrarSaldo());

                break;
                case 4:
                    System.out.println("Encerrando sistema!");
                    break;
                default:
                    System.out.println("[ERRO]Opção inválida");
                    break;
            }
        }
        tc.close();
    }
}