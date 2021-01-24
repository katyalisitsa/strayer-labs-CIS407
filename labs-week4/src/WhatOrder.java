import java.util.Scanner;

public class WhatOrder {
    // TODO: Define a generic method called checkOrder() method that
    //       takes in four variables of generic type as arguments.
    //       The return type of the method is integer


    // Check the order of the input: return -1 for ascending,
    // 0 for neither, 1 for descending
    public static <T extends Comparable<T>> Integer checkOrder(T item1, T item2, T item3, T item4) {
        //boolean descending = false;
        //boolean ascending = false;
        Integer checkOrder = 0;
        if (item1.compareTo(item2) > 0) {
            if (item2.compareTo(item3) > 0) {
                if (item3.compareTo(item4) > 0) {
                    checkOrder = 1;
                }
            }
        } else if (item4.compareTo(item3) > 0) {
            if (item3.compareTo(item2) > 0) {
                if (item2.compareTo(item1) > 0) {
                    checkOrder = -1;
                }
            }
        } //else {
        //checkOrder = 0;
        //}
        return checkOrder;
    }



    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Check order of four strings
        System.out.println("Order: " + checkOrder(scnr.next(), scnr.next(), scnr.next(), scnr.next()));

        // Check order of four doubles
        System.out.println("Order: " + checkOrder(scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble()));
    }
}
