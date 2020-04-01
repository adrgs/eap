package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Dublu dublu = new Dublu(5);
	    //Pozitie pozitie = new Pozitie(5);

	    //dublu.afisare();
	    //pozitie.afisare();

	    //dublu.multiplyElems();
	    //pozitie.multiplyElems();

	    //dublu.afisare();
	    //pozitie.afisare();

		//ListaInt listaInt = new ListaInt(5);
		//ListaDouble listaDouble = new ListaDouble(5);

		//listaInt.afisare();
		//listaDouble.afisare();

		//listaInt.multiplyElems();
		//listaDouble.multiplyElems();

		//listaInt.afisare();
		//listaDouble.afisare();

		//System.out.println(listaInt.sum());

		try {
			Scanner scanner = new Scanner(System.in);
			ListaInt listaInt = new ListaInt(scanner.nextInt());
		} catch (NumberTooLargeException e) {
			System.out.println(e.getErrorMessage());
		} catch (NumberTooSmallException e) {
			System.out.println(e.getErrorMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		//try {
		//	Scanner scanner = new Scanner(System.in);
		//	ListaInt listaInt = new ListaInt(scanner.nextInt());
		//} catch (Exception e) {
		//	e.printStackTrace();
		//}

		System.out.println("Am ajuns pana aici");

    }
}
