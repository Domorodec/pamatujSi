package com.domorodec.pamatujSi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareIt{
   static List<String> pole  = new ArrayList<>();
   public static final Scanner scanner2 = new Scanner(System.in);

    public static void ulozPole(String item){
        pole.add(item);

    }

    public static void porovnej(){
        int count = 0;
        String vstupZkl;
        System.out.println("Probiha porovnavani hodnot....");
        for(int i=0; i < pole.size();i++) {
              vstupZkl = scanner2.nextLine();
                if (pole.contains(vstupZkl)) {
                    count++;
                }
            }


        System.out.println("Uspesne jste uhodli "+count+" slov.");
        scanner2.close();
    }

    public static void tiskPole(){
        for(int i=0;i < pole.size();i++){
            System.out.println(pole.get(i));

        }
    }



}