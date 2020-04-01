package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaInt implements Interfata {

    int n;
    List<Integer> intArray;

    public ListaInt(int n) throws NumberTooLargeException, NumberTooSmallException {
        //if (n>0 && n <= Interfata.DIM_MAX) {
        //    this.n = n;
        //} else {
        //    throw new NumberTooLargeException(n);
        //}

        if (n < 0)
            throw new NumberTooSmallException(n);
        else if (n>Interfata.DIM_MAX) {
            throw new NumberTooLargeException(n);
        } else {
            this.n =n;
        }

        this.intArray = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<this.n;i++)
        {
            System.out.println("intArray["+i+"]=");
            this.intArray.add(scanner.nextInt());
        }
    }

    public int sum() {
        int s = 0;
        for (int i : intArray) {
            s += i;
        }
        return s;
    }

    @Override
    public void afisare() {
        for (int i=0;i<this.n;i++)
        {
            System.out.print(this.intArray.get(i) + " ");
        }
        System.out.println();
    }

    @Override
    public void multiplyElems() {
        for (int i=0;i<this.n;i++)
        {
            this.intArray.set(i, this.intArray.get(i)*i);
        }
    }
}
