package Desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Abbreviations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        String text;
        do {
            text = sc.nextLine();
            if (!text.equalsIgnoreCase("."))
                list.add(text.toLowerCase());

        } while (!text.equalsIgnoreCase("."));

        for (String strText : list)
            findMaxWord(strText);
    }

    private static void findMaxWord(String text) {
        String[] words = text.split(" ");
        Map<String, String> mapAbb = new TreeMap<>();
        Map<String, Integer> mapQtd = new TreeMap<>();
        int cont = 0;

        for (String aux : words) {
            if (aux.length() < 3)
                continue;

            for (String compare : words) {
                if (aux.equals(compare))
                    cont++;
            }
            //se não existir uma abreviaçao com a primeira letra, insere no MAP
            if (!mapAbb.containsKey(aux.charAt(0) + ".")) {
                mapAbb.put(aux.charAt(0) + ".", aux);
                mapQtd.put(aux.charAt(0) + ".", cont);
            }
            // se existir abreviação, compara se a quantidade de letras economizadas
            // é maior do que da palavra que ja está armaezenada no MAP
            else if ((aux.length() - 2) * cont > (mapAbb.get(aux.charAt(0) + ".").length() - 2) * mapQtd.get(aux.charAt(0) + ".")) {
                mapAbb.put(aux.charAt(0) + ".", aux);
                mapQtd.put(aux.charAt(0) + ".", cont);
            }
            cont = 0;
        }
        printOutput(words, mapAbb);
    }

    private static void printOutput(String[] words, Map<String, String> mapAbb) {

        for (String key : mapAbb.keySet()) {
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(mapAbb.get(key))) {
                    words[i] = key;
                }
            }
        }

        String output = " ";
        for (int j = 0; j < words.length; j++) {
            output = output + words[j] + " ";
        }

        System.out.println(output.trim());
        System.out.println(mapAbb.size());

        for (String key : mapAbb.keySet()) {
            System.out.println(key + " = " + mapAbb.get(key));
        }
    }
}

