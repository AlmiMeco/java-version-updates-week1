package com.noteworthyJavaVersionUpdates.Java14Additions;

public class SwitchCaseImprovements {

    public static void main(String[] args) {

//        Switch Cases before Java 14

        var month =4;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
                System.out.println("this month has 30 days");
                break;
            case 2:
                System.out.println("February can have 28 or 29 days");
                break;
            default:
                System.out.println("invalid month");
        }

        System.out.println("***************************************");

//        Switch Cases after Java 14 (using Lambda Token)

        switch (month){
            case 1,3,5,7,8,10,12 -> System.out.println("This month has 31 Days");
            case 4,6,9 -> System.out.println("This month has 30 Days");
            case 2 -> System.out.println("This month has 28 OR 29 Days");
            default -> System.out.println("Invalid Input");

        }




















    }
}