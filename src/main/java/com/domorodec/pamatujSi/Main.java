package com.domorodec.pamatujSi;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Read rd = new Read();
        rd.readFile();
        System.out.println("**************************");

        System.out.println("Zacnete psat slova, ktera jste si zapamatovali:");
        CompareIt.porovnej();
        System.out.println("***************************");
        System.out.println("Puvodni hodnty byly:");
        CompareIt.tiskPole();
    }
}
