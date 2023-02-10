package com.noteworthyJavaVersionUpdates.Java13Additions;

public class TextBlockDemo {

    public static void main(String[] args) {


//        Code Blocks pre Java 13 (using \n is now redundant )
        var address = "6904 River Heights Dr \n " +
                "Nashville, TN 37122 \n" +
                "Almi Meco's Address";


        var addressWithTextBlock = """
                6904 River Heights Dr 
                Nashville, TN 37122
                Almi Meco's Address
                Written using Text Blocks! 
                """;

        System.out.println("\tPre Java 12:: \n" + address);
        System.out.println("--------------------");
        System.out.println("\t Post Java 12:: \n" + addressWithTextBlock);


    }


}
