package br.example.code_decode_page.codificador.Morse;

import java.util.ArrayList;

public class MorseTranslater {

    public static  String toMorse(char[] chars) {
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
                case ' ' -> stringBuilder.append("/");
                case '.' -> stringBuilder.append("·-·-·-");
                case ',' -> stringBuilder.append("--··--");
                default -> stringBuilder.append("········");
            }
            stringBuilder.append(" ");

        }
        return stringBuilder.toString();
    }


    public static String toAlfaNumeric(ArrayList<String> morseCodes){
        StringBuilder stringBuilder = new StringBuilder();
        for (String morseLetter : morseCodes){
            switch (morseLetter){
                case "·-"->stringBuilder.append("A");
                case "-···"->stringBuilder.append("B");
                case "-·-·"->stringBuilder.append("C");
                case "-··"->stringBuilder.append("D");
                case "·"->stringBuilder.append("E");
                case "··-·"->stringBuilder.append("F");
                case "--·"->stringBuilder.append("G");
                case "····"->stringBuilder.append("H");
                case "··"->stringBuilder.append("I");
                case "·---"->stringBuilder.append("J");
                case "-·-"->stringBuilder.append("K");
                case "·-··"->stringBuilder.append("L");
                case "--"->stringBuilder.append("M");
                case "-·"->stringBuilder.append("N");
                case "---"->stringBuilder.append("O");
                case "·--·"->stringBuilder.append("P");
                case "--·-"->stringBuilder.append("Q");
                case "·-·"->stringBuilder.append("R");
                case "···"->stringBuilder.append("S");
                case "-"->stringBuilder.append("T");
                case "··-"->stringBuilder.append("U");
                case "···-"->stringBuilder.append("V");
                case "·--"->stringBuilder.append("W");
                case "-··-"->stringBuilder.append("X");
                case "-·--"->stringBuilder.append("Y");
                case "--··"->stringBuilder.append("Z");
                case "·----"->stringBuilder.append("1");
                case "··---"->stringBuilder.append("2");
                case "···--"->stringBuilder.append("3");
                case "····-"->stringBuilder.append("4");
                case "·····"->stringBuilder.append("5");
                case "-····"->stringBuilder.append("6");
                case "--···"->stringBuilder.append("7");
                case "---··"->stringBuilder.append("8");
                case "----·"->stringBuilder.append("9");
                case "-----"->stringBuilder.append("0");
                case " "->stringBuilder.append(" ");
                case "·-·-·-" -> stringBuilder.append('.');
                case "--··--" -> stringBuilder.append(",");
                case "········" -> stringBuilder.append("ERROR");
            }
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }
}
