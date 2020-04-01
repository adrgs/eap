package com.company;

import java.util.List;

public abstract class Lista {
    int n;
    List<Integer> array;

    public void afisare()
    {
        for (int i=0;i<this.n;i++)
        {
            System.out.print(array.get(i) +  " ");
        }
        System.out.println();
    }

    abstract void multiplyElems();
}
