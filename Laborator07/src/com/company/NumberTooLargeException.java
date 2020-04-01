package com.company;

public class NumberTooLargeException extends Exception {

    private Integer number;

    public NumberTooLargeException(Integer number) {
        super(number.toString());
        this.number = number;
    }

    public String getErrorMessage() {
        return "Numarul " + this.number + " este prea mare";
    }
}
