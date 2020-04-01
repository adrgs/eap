package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDouble implements Interfata {

    int n;

    List<Double> doubleArray;

    public ListaDouble(int n)
    {
        if (n>0 && n <= Interfata.DIM_MAX) {
            this.n = n;
        } else {
            throw new IllegalArgumentException();
        }

        this.doubleArray = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<this.n;i++)
        {
            System.out.print("doubleArray["+i+"]=");
            this.doubleArray.add(scanner.nextDouble());
        }
    }

    @Override
    public void afisare() {
        System.out.println(this.doubleArray.toString());
    }

    @Override
    public void multiplyElems() {
        for (int i=0;i<this.n;i++)
        {
            this.doubleArray.set(i, this.doubleArray.get(i)*2);
        }
    }
}
