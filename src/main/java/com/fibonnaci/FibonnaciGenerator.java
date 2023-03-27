package com.fibonnaci;

public class FibonnaciGenerator {
    public static void main(String[]args){
        int numberOfTerms=20;
        int[] fibonnaciSequence = new int[numberOfTerms];// storing them in n array
        //generate  the sequence
        fibonnaciSequence[0]=0;
        fibonnaciSequence[1]=1;
        //looping through to do the adding
        for (int i=2; i<numberOfTerms; i++) {
            fibonnaciSequence[i] = fibonnaciSequence[i-1] + fibonnaciSequence[i-2];
        } //printing the sequence
        System.out.println("Fibonnaci sequence upto : " + numberOfTerms + "terms" );
        for (int i =0; i < numberOfTerms; i++){
            System.out.print(fibonnaciSequence[i] + " ");
        }

    }
}
