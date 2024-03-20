package br.example.code_decode_page.domain;

import br.example.code_decode_page.codificador.Morse.Morse;
import br.example.code_decode_page.codificador.Morse.MorseTranslater;

public enum CodificacaoTexto {

    MORSE,
    ALFANUMERICO;

    public static CodificacaoTexto acharCodificacao(String nomeCodificacao){

        for (CodificacaoTexto codigo : CodificacaoTexto.values()){
            if (codigo.toString().equalsIgnoreCase(nomeCodificacao)){
                return codigo;
            }
        }
        return null;
    }

    public String decode(String textoADecodificar) {
        return switch (this){
            case MORSE -> Morse.decodificar(textoADecodificar);
            default -> textoADecodificar;
        };
    }

    public String code(String textoAConverterEmAlfanumerico) {
        return switch (this){
            case MORSE -> Morse.codificar(textoAConverterEmAlfanumerico);
            default -> textoAConverterEmAlfanumerico;
        };
    }
}
