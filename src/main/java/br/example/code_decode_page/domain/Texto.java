package br.example.code_decode_page.domain;

import br.example.code_decode_page.DadosCodificaTexto;

public class Texto {

    private String textoAConverter;
    private String textoConvertido;
    private CodificacaoTexto codigoTextoAConverter;
    private CodificacaoTexto codigoTextoConvertido;

    public Texto(DadosCodificaTexto dados) {
        this.setTextoAConverter(dados.textoAConverter());

        CodificacaoTexto codificacaoTextoAConverter = CodificacaoTexto.acharCodificacao(dados.code());
        this.setCodigoTextoAConverter(codificacaoTextoAConverter);

        CodificacaoTexto codificacaoTextoConvertido = CodificacaoTexto.acharCodificacao(dados.code2());
        this.setCodigoTextoConvertido(codificacaoTextoConvertido);

        this.setTextoConvertido(" ");
    }

    public Texto() {
        this.setTextoAConverter(" ");
        this.setCodigoTextoAConverter(CodificacaoTexto.ALFANUMERICO);
        this.setCodigoTextoConvertido(CodificacaoTexto.ALFANUMERICO);
        this.setTextoConvertido(" ");

    }


    public String getTextoAConverter() {
        return textoAConverter;
    }

    public void setTextoAConverter(String textoAConverter) {
        this.textoAConverter = textoAConverter;
    }

    public String getTextoConvertido() {
        return textoConvertido;
    }

    public void setTextoConvertido(String textoConvertido) {
        this.textoConvertido = textoConvertido;
    }

    public CodificacaoTexto getCodigoTextoAConverter() {
        return codigoTextoAConverter;
    }

    public void setCodigoTextoAConverter(CodificacaoTexto codigoTextoAConverter) {
        this.codigoTextoAConverter = codigoTextoAConverter;
    }

    public CodificacaoTexto getCodigoTextoConvertido() {
        return codigoTextoConvertido;
    }

    public void setCodigoTextoConvertido(CodificacaoTexto codigoTextoConvertido) {
        this.codigoTextoConvertido = codigoTextoConvertido;
    }
}
