package entities;

public class Cliente {
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Cliente(String nome,String cpf, String dataNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;

    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public static String formatarCpf(String cpf){
        return cpf.substring(0,3) + "." + cpf.substring(3,6) + "." +
               cpf.substring(6,9) + "-" + cpf.substring(9);
    }

    public static String formatarDataNascimento(String dataNascimento){
        return dataNascimento.substring(0,2) + "/" + dataNascimento.substring(2,4) + "/" +
               dataNascimento.substring(4,8);
    }

    public String toString(){
        return "Nome: " +
                this.nome +
                "\nCPF: " +
                formatarCpf(cpf) +
                "\nData de nascimento: " +
                formatarDataNascimento(dataNascimento);

    }
}
