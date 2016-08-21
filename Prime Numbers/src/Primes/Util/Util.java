/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primes.Util;

public class Util 
{
    

/**
 *
 * @author Corrado Canepari
 * @author Gianmarco Morbelli
 * This class contains the methods needed for the application to work
 */
/**

/**
 * 
 * @param x, the number you want to check
 * @return divisori: the number of i's by which the number is divisible
 */
public static int getDivisors(int x)
{
    int div=0;
    for(int i=2; i<=(x/2); i++)
    {
        if (x%i==0)
        {
            div++;
        }
        else{}
    }
    return div;
}
/**
 * 
 * @param divisori, number of parameters by which x is divisible
 * @return isPrime, boolean which indicates wether a number is prime or not
 */
public static Boolean isPrime(int divisori)
{
    boolean b=(divisori<=0?true:false);
    return b;
    
}
    
    }

