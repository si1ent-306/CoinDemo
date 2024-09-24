package math282a1q1;

/*
 *  Date created:  Fall 2024
 *  Course name:  MATH 282
 *  Instructors:  Michael Grzesina
 *  File name:  CoinCounter.java
 */

/**
 *  Purpose:  Counts the number of coins of a specified type. 
 *   Uses the Coin enum for the possible coin types.
 *
 * @author Michael Grzesina
 * @author Andrea Grzesina
 * @version August 30, 2017
 */
public class CoinCount
{
    /**
     * Type of coin to be counted
     */
    private Coin coinType;
    
    /**
     * Number of coins counted of specified type
     */
    private int numCoins;
    
    
    /**
     * Constructor for the CoinCount class.
     * 
     * @param coinType type of coin
     */
    public CoinCount( Coin coinType )
    {
        this.coinType = coinType;
        numCoins = 0;
    }
    
    
    /**
     * Method addACoin: Adds a coin of the type being counted
     */
    public void addACoin()
    {
        numCoins++;
    }

    
    /**
     * Method getCoinType: Gets the type of coin being counted
     * 
     * @return  type of coin
     */
    public Coin getCoinType()
    {
        return coinType;
    }

    
    /**
     * Method getNumCoins: Gets the number of coins of the type being counted
     * @return  number of coins
     */
    public int getNumCoins()
    {
        return numCoins;
    }
}
