package util;

import java.security.SecureRandom;

public class GeradorNumConta {
    private static final String CHARACTERS = "0123456789";
    private static final SecureRandom random = new SecureRandom();

    public static String geradorNumConta(int length){
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++){
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }
        return sb.toString();
    }
}
