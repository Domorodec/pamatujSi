package com.domorodec.pamatujSi;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import static org.junit.Assert.*;

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
                String[] text = s.split("\\s+");
                for (String tisk : text) {
                    System.out.println(tisk);
                }
            }
        } catch (
                IOException vyj) {
            System.out.println("Error during reading file: " + vyj);
        }
    }
}