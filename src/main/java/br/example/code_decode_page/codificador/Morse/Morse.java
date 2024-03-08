package br.example.code_decode_page.codificador.Morse;


import java.util.ArrayList;
import java.util.Locale;

public class Morse {



    public static String codificar(String textoAConverter){
        textoAConverter = textoAConverter.toUpperCase(Locale.ROOT);
        char[] chars = textoAConverter.toCharArray();
        return MorseTranslater.toMorse(chars);

    }

    public static String decodificar (String textoEmMorse){

        ArrayList<String> morseCodes = new ArrayList<>();
        while (textoEmMorse.contains(" ")){
            int posicaoEspaco = textoEmMorse.indexOf(" ");
            if (posicaoEspaco == 0){
                morseCodes.add(" ");
                textoEmMorse = textoEmMorse.substring(1);
            }else {
                String letraEmMorse = textoEmMorse.substring(0,posicaoEspaco);
                morseCodes.add(letraEmMorse);
                textoEmMorse = textoEmMorse.substring(posicaoEspaco + 1);
            }

        }

        return MorseTranslater.toAlfaNumeric(morseCodes);

    }



}
