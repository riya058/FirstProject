package org.example;
import java.util.*;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        ArrayList<String>cart = new ArrayList<>();
        while(true){
            System.out.println("1 => category");
            System.out.println("2 => exit");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if(i == 1) {

                while (true) {
                    System.out.println("1 => home");
                    System.out.println("2 => sports");
                    System.out.println("3 => electronics");
                    System.out.println("4 => back");

                    int j = sc.nextInt();
                    if (j == 1) {
                        System.out.println("TABLE" +
                                " price - 5000");
                        System.out.println("CHAIR" +
                                " price - 3000");
                        System.out.println("LAMP" +
                                " price - 1000");
                        System.out.println("4 => back");

                        System.out.println("add items in cart");
                        while(true) {
                            int n = cart.size();
                            for(int a = 0;a < n;a++ ){
                                System.out.println(cart.get(a));
                            }


                            int k = sc.nextInt();

                            if (k == 1) {
                                cart.add("table");
                            } else if (k == 2) {
                                cart.add("chair");
                            } else if (k == 3) {
                                cart.add("lamp");
                            } else {
                                break;
                            }

                        }





                    }

                    if (j == 2) {
                        System.out.println("BAT" +
                                " price - 1000");
                        System.out.println("BALL" +
                                " price - 100");
                        System.out.println("RACKET" +
                                " price - 2000");
                        System.out.println("FOOTBALL" +
                                " price - 1000");
                        System.out.println("4 => back");

                        int k = sc.nextInt();
                        if (k == 4)
                            continue;
                    }

                    if (j == 3) {
                        System.out.println("MOBILE" +
                                " price - 50000");
                        System.out.println("LAPTOP" +
                                " price - 30000");
                        System.out.println("FRIDGE" +
                                " price - 10000");
                        System.out.println("4 => back");

                        int k = sc.nextInt();
                        if (k == 4)
                            continue;
                    }


                    if (j == 4) {
                        break;

                    }
                }
            }
            else if (i == 2) {
                break;
            }
       }
    }
}


