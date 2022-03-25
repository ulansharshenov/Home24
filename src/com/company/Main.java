package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(2);
            arrayList.add(rnd.nextInt(2));
            linkedList.add(rnd.nextInt(2));
        }

        sort(array);
        sort(arrayList);
        sort(linkedList);

        for (int i: array) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i: arrayList) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i: linkedList) {
            System.out.print(" " + i);
        }
    }

    public static void sort(int[] array){
        Arrays.sort(array);
    }

    public static void sort(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
    }

    public static void sort(LinkedList<Integer> linkedList){
        Collections.sort(linkedList);
    }
}
