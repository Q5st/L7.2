package com.company;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        int a=100, b=999;
        for (int i=0; i<7; i++){
            System.out.println("Enter name");
            map.put((int) (Math.random()*(b-a)+a), scanner.nextLine());
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        int id;
        String nm;
        do{
            System.out.println("Enter ID");
            id = scanner.nextInt();
            if (map.containsKey(id)){ System.out.println(map.get(id)); }
            System.out.println("Enter name");
            scanner.nextLine();
            nm = scanner.nextLine();
            for (Map.Entry<Integer,String> entry : map.entrySet()) {
                if(entry.getValue().equals(nm)) {
                    System.out.println(entry.getKey());
                }
            }

        }while (map.containsKey(id)==false || map.containsValue(nm)==false );
    }
}
