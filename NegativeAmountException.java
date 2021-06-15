package com.meritamerica.assignment5;

public class NegativeAmountException extends Exception
{
    NegativeAmountException(String error)
    {
        super(error);
    }
}