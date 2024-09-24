package math282a1q1;

/*
 *  Date created:  Fall 2024
 *  Course name:  MATH 282
 *  Instructors:  Michael Grzesina
 *  File name:  CoinCounter.java
 */

/**
 *  Purpose:  Enumerated type representing Canadian coins
 *
 * @author Michael Grzesina
 * @author Andrea Grzesina
 * @version August 30, 2017
 */
public enum Coin
{
    PENNY("Penny", 0.01),
    NICKEL("Nickel", 0.05),
    DIME("Dime", 0.10),
    QUARTER("Quarter", 0.25),
    LOONIE("Loonie", 1.00),
    TOONIE("Toonie", 2.00); 

    
    /**
     * Constructor for the Coin class.
     * 
     * @param coinName  Name of coin
     * @param value     Value of coin as Canadian currency
     */
    Coin(String coinName, double value) 
    { 
        this.coinName = coinName;
        this.value = value; 
    } 

    
    /**
     * Name of coin
     */
    private final String coinName;
    
    /**
     * Value of coin as Canadian currency
     */
    private final double value; 

    
    /**
     * Method coinName: Provides name of coin
     * 
     * @return  name of coin
     */
    public String coinName()
    {
        return coinName;
    }
    
    
    /**
     * Method value: Provides value of coin as Canadian currency
     * 
     * @return  value of coin
     */
    public double value() 
    { 
        return value; 
    }
}
