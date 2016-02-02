package com.company;


        import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {
    public static void main(String[] args) {
        int [][]matr = new int [3][];
        int []vect = new int [3];
        int []Result = new int [3];

        System.out.println("Matrix: ");
        for (int i=0; i < matr.length; i++)
        {
            matr[i] = new int [3];
            vect[i] = (int)Math.round(Math.random()*10);
            for (int j=0; j < matr[i].length; j++){
                matr[i][j] = (int)Math.round(Math.random()*10);
                System.out.println(matr [i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Vector: ");
        for (int i = 0; i < vect.length; i++)System.out.println(vect[i]);
        System.out.println();
        for (int i=0; i < matr.length; i++)
        {
            for (int j=0; j < matr[i].length; j++) {
                Result[i] += matr[i][j]*vect[j];
            }
        }
        System.out.println("Result:");
        for (int i = 0; i < vect.length; i++)System.out.println(Result[i]);
    }
}
