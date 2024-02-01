package org.phoenix;

import javax.swing.*;

public class Multiple_of_3_and_5 {
    public static void printTheProblemStatement(){
        //Will add this later
        /*JFrame frame = new JFrame();
        JLabel label = new JLabel("If we list all the natural numbers below " +
                "10 that are multiples of 3 or 5, we get 3,5,6 and 9. " +
                "The sum of these multiple is 23. " +
                "Find the sum of all multiple of 3 or 5 below 1000.",JLabel.CENTER);
        label.setOpaque(true);
        label.setSize(200,150);
        frame.add(label);
        frame.setSize(400,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        System.out.println("If we list all the natural numbers below \n" +
                "10 that are multiples of 3 or 5, we get 3,5,6 and 9.\n" +
                "The sum of these multiple is 23.\n" +
                "Find the sum of all multiple of 3 or 5 below 1000.\n");


    }
    public static void main(String...args){
        printTheProblemStatement();
        int sum = 0;
        for(int i = 0;i<1000;i++){
            if(i%3==0||i%5==0){
                sum+=i;
            }
        }
        System.out.println("Sum of all multiples of 3 and 5 below 1000 is "+sum);
    }
    //Sum of all multiples of 3 and 5 below 1000 is 233168
}
