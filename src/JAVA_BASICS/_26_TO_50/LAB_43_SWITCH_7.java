package JAVA_BASICS._26_TO_50;

import java.util.Scanner;

public class LAB_43_SWITCH_7 {
    public static void main(String[] args) {

        // Program to Check Grade Based on Marks
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your markes");
        int marks = sc.nextInt();

        //  90 ->  90/10 -> 9 -> A ( 90-100) -> A
        //  87 ->  87/10 -> 8 -> B (80-89) -> B
        //  77 ->  77/10 -> 7 -> C ( 70-79) -> C

        marks = marks/10;
        System.out.println(marks);

//        switch (marks){
//            case 9:
//                System.out.println("A");
//                break;
//            case 8:
//                System.out.println("B");
//                break;
//            case 7:
//                System.out.println("C");
//                break;
//            case 1:
//                System.out.println("F");
//                break;
//            default:
//                System.out.println("None");
//        }
        switch (marks){
            case 9 -> System.out.println("A");
            case 8 -> System.out.println("B");
            case 7 -> System.out.println("C");
            case 6 -> System.out.println("D");
            case 5 -> System.out.println("F");
            default -> System.out.println("NONE");
        }




    }
}
