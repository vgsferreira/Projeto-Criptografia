package projeto.criptografia;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1510028941
 */
public class Cesar {

    public static String alfabetoCodificado(String alfabeto1, int chave) {
        
        chave = chave % alfabeto1.length();		
		
		if ( chave == 0 )
			return alfabeto1;
		
		if (chave < 0) chave = chave + alfabeto1.length();

        String codificar = alfabeto1.substring(chave, alfabeto1.length()) + alfabeto1.substring(0, chave);

        return codificar;

    }

    public static String codificaCesar(String msg, String alfabeto1, String alfabeto2) {

        String msgCod = "";

        for (int i = 0; i < msg.length(); i++) {
            int local = alfabeto1.indexOf(msg.charAt(i));

            if (local >= 0) {

                msgCod += alfabeto2.charAt(local);
            }

        }
        return msgCod;
    }

    public static String decodificaCesar(String msgCod, String alfabeto2, String alfabeto1) {

        String msgDecod = "";

        for (int i = 0; i < msgCod.length(); i++) {
            int local = alfabeto2.indexOf(msgCod.charAt(i));

            if (local >= 0) {

                msgDecod += alfabeto1.charAt(local);
            }

        }
        return msgDecod;
    }

}
