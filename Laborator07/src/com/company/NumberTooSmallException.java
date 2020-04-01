package com.company;

public class NumberTooSmallException extends Exception {

    private Integer number;

    public NumberTooSmallException(Integer number) {
        super(number.toString());
        this.number = number;
    }

    public String getErrorMessage() {
        return "Numarul " + this.number + " este prea mic";
    }
}
