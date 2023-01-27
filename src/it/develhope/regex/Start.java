package it.develhope.regex;

public class Start {
    public static void main(String[] args) {

        String str = "tup tuup tuuup tuuuup";
        String result = str.replaceAll("u{2,3}","X");
        System.out.println(result);
    }
}


