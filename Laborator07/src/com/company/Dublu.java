package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Dublu extends Lista {

    public Dublu(int n)
    {
        this.n = n;
        this.array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<this.n;i++)
        {
            System.out.print("array["+i+"]= ");
            this.array.add(scanner.nextInt());
        }
    }

    @Override
    void multiplyElems() {
        for (int i=0;i<this.n;i++)
        {
            this.array.set(i, this.array.get(i)*2);
        }
    }
}
