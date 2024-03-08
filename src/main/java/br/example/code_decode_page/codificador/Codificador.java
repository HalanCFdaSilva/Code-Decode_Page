package br.example.code_decode_page.codificador;

import br.example.code_decode_page.domain.Texto;

public class Codificador {


    public void codificarTexto(Texto texto){
        String textoAConverterEmAlfanumeric = texto.getCodigoTextoAConverter().decode(
                texto.getTextoAConverter());
        String textoConvertido = texto.getCodigoTextoConvertido().code(textoAConverterEmAlfanumeric);
        texto.setTextoConvertido(textoConvertido);

    }

}
