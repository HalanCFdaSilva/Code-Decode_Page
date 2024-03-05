package br.example.code_decode_page.domain;

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
}
