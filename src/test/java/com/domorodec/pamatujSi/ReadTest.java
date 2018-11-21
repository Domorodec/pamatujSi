package com.domorodec.pamatujSi;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTest {
    String s;
    public static final Scanner scanner = new Scanner(System.in);

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Tisk na zacatku tridy");
    }


    @Test
    public void readFile() {
        try (
                BufferedReader br = new BufferedReader(new
                        FileReader("C:\\Users\\PC\\projects\\pamatujSi\\pamatujSi\\src\\test\\java\\com\\domorodec\\pamatujSi\\readtest.txt"))) {

            while ((s = br.readLine()) != null) {
                String[] text = s.split("[^a-zA-Zěščřžýáíéůúň]+");

                for (String tisk : text) {
                    if(!tisk.isEmpty()){
                        System.out.println(tisk);
                    }

                }
            }
        } catch (
                IOException vyj) {
            System.out.println("Error during reading file: " + vyj);
        }
    }
}