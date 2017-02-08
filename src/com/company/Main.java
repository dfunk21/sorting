package com.company;

public class Main {

    public static void main(String[] args) {

        int theArray[] = {4, 8, 15, 16, 23, 42};

        sort(theArray);

        for(int j = 0; j < theArray.length; j++) {

            System.out.print(theArray[j] + " "); }

        System.out.println( " ");
    }

    public static void sort(int a[ ]) {
        int blah;

        for (int i = 1; i < a.length; i++)
        {
            if (a[i-1] > a[i])
            {
                blah = a[i-1];
                a[i-1]=a[i];
                a[i]=blah;
            }
        }

    }
}
