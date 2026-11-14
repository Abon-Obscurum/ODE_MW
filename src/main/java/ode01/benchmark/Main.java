package ode01.benchmark;

public class Main {
    public static void main(String[] args) {

        int i = 0;

        //start time for timer
        long startTime = System.currentTimeMillis();

        while( i < 1000000){
            System.out.print(".");
            i++;
        }

        //end time for timer
        long endTime = System.currentTimeMillis();

        //Line break after Dots
        System.out.printf("\n");


        System.out.println("Printen " + i + " Dots");
        System.out.println("Took the function " + ((endTime - startTime)) + "ms");

    }
}

