package util;

import java.text.NumberFormat;
import java.util.Locale;

public class Formatadores {
    //Método para formatar numero da conta bancária
    public static String formatarNumConta(String numConta){
        return numConta.substring(0,5) + "-" + numConta.substring(5,6);
    }

    //Método para formatar o saldo da conta bancária
    public static String formatarSaldoConta(double saldo){
        NumberFormat formatoSaldo = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formatoSaldo.format(saldo);
    }
}
