package br.example.code_decode_page.codificador;


import java.util.Locale;

public class CodificadorMorse {



    public String codificar(String textoAConverter){
        textoAConverter = textoAConverter.toUpperCase(Locale.ROOT);
        char[] chars = textoAConverter.toCharArray();
        String textoCodificado = this.toMorse(chars);
        return textoCodificado;
    }

    private String toMorse(char[] chars) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char character : chars){
            switch (character){
                case 'A' -> stringBuilder.append("·-");
                case 'B' -> stringBuilder.append("-···");
                case 'C' -> stringBuilder.append("-·-·");
                case 'D' -> stringBuilder.append("-··");
                case 'E' -> stringBuilder.append("·");
                case 'F' -> stringBuilder.append("··-·");
                case 'G' -> stringBuilder.append("--·");
                case 'H' -> stringBuilder.append("····");
                case 'I' -> stringBuilder.append("··");
                case 'J' -> stringBuilder.append("·---");
                case 'K' -> stringBuilder.append("-·-");
                case 'L' -> stringBuilder.append("·-··");
                case 'M' -> stringBuilder.append("--");
                case 'N' -> stringBuilder.append("-·");
                case 'O' -> stringBuilder.append("---");
                case 'P' -> stringBuilder.append("·--·");
                case 'Q' -> stringBuilder.append("--·-");
                case 'R' -> stringBuilder.append("·-·");
                case 'S' -> stringBuilder.append("···");
                case 'T' -> stringBuilder.append("-");
                case 'U' -> stringBuilder.append("··-");
                case 'V' -> stringBuilder.append("···-");
                case 'W' -> stringBuilder.append("·--");
                case 'X' -> stringBuilder.append("-··-");
                case 'Y' -> stringBuilder.append("-·--");
                case 'Z' -> stringBuilder.append("--··");
                case '.' -> stringBuilder.append("·-·-·-");
                case ',' -> stringBuilder.append("--··--");
                case '"' -> stringBuilder.append("·-··-·");
                case '\'' -> stringBuilder.append("·----·");
                case '!' -> stringBuilder.append("-·-·--");
                case '?' -> stringBuilder.append("··--··");
                case '/' -> stringBuilder.append("-··-·");
                case '(' -> stringBuilder.append("-·--·");
                case ')' -> stringBuilder.append("-·--·-");
                case '&' -> stringBuilder.append("·-···");
                case '@' -> stringBuilder.append("·--·-·");
                case ';' -> stringBuilder.append("-·-·-·");
                case ':' -> stringBuilder.append("---···");
                case '¿' -> stringBuilder.append("··-·-");
                case '_' -> stringBuilder.append("··--·-");
                case '-' -> stringBuilder.append("-····-");
                case '+' -> stringBuilder.append("·-·-·");
                case '=' -> stringBuilder.append("-···-");
                case '1' -> stringBuilder.append("·----");
                case '2' -> stringBuilder.append("··---");
                case '3' -> stringBuilder.append("···--");
                case '4' -> stringBuilder.append("····-");
                case '5' -> stringBuilder.append("·····");
                case '6' -> stringBuilder.append("-····");
                case '7' -> stringBuilder.append("--···");
                case '8' -> stringBuilder.append("---··");
                case '9' -> stringBuilder.append("----·");
                case '0' -> stringBuilder.append("-----");
                case ' ' -> stringBuilder.append(" ");
                default -> stringBuilder.append(character);

            }
            stringBuilder.append(" ");

        }
        return stringBuilder.toString();
    }
}
