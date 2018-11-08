package com.domorodec.pamatujSi;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Read{
    String s;
    public static final Scanner scanner = new Scanner(System.in);

    public void readFile() {



        try(BufferedReader br = new BufferedReader(new
                FileReader(/*"C:\\Users\\PC\\projects\\javaProject1\\src\\com\\domorodec\\read.txt"*/"C:\\Users\\PC\\projects\\pamatujSi\\pamatujSi\\src\\main\\java\\com\\domorodec\\pamatujSi\\read.txt"))){

            while((s = br.readLine()) !=  null) {
                String[] text = s.split("\\s+");
                //for(String tisk:text);
                //int delkaPole = tisk.length();
                Random random = new Random();
               // boolean extSmycka = true;

                boolean smycka = true;
                boolean smycka1;

                //while (!smycka) {
                do{
                    smycka1 = true;
                    System.out.println("Zadej pocet slov pro zapamatovani. Maximalne " + text.length);
                    if (!scanner.hasNextInt()) {
                        scanner.nextLine();
                        System.out.println("Nezadali jste cislo. Znovu..");
                        //scanner.nextLine();
                        smycka1 = false;
                    }

                    // }
                    while (smycka1) {
                        smycka=false;
                        int slova = scanner.nextInt();
                        if (slova <= text.length) {
                            for (int i = 0; i < slova; i++) {
                                int n = random.nextInt(text.length - 1) + 1;
                                System.out.println(text[n]);
                                String item = text[n];
                                //new CompareIt().ulozPole(item);
                                CompareIt.ulozPole(item);
                            }
                           smycka1=false;


                        }else{
                                System.out.println("Zadali jste prilis velke cislo. Znovu.");
                                smycka=true;
                            }

                          //  break;


                        }
                    }while(smycka);
                }


        }catch(IOException vyj){
            System.out.println("Error during reading file: " +vyj);
        }
        finally{
        //scanner.close();
        //metoda pro casovac
            //metoda pro porovnani vstupu z klavesnice s vybranymi slovy
        }

    }
}
