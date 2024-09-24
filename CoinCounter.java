package math282a1q1;

/*
 *  Date created:  Fall 2024
 *  Course name:  MATH 282
 *  Instructors:  Michael Grzesina
 *  File name:  CoinCounter.java
 */

import java.util.*;

/**
 *  Purpose:  Keeps track of number of coins of different types
 *    and total value of all coins.
 *   Uses the CoinCount class to count the coins of each type.
 *   Uses the Coin enum to determine the value of the coin types.
 *
 * @author Michael Grzesina
 * @author Andrea Grzesina
 * @version August 30, 2017
 */
public class CoinCounter
{
    /**
     * Purse containing multiple types of coins, each identified by a
     *  single-character specifier.  Uses the HashMap generic type.
     */
    private HashMap<Character, CoinCount> purse =
        new HashMap<Character, CoinCount>();

    /**
     * Total value of coins in purse
     */
    private double dTotal;
    
    /**
     * Default constructor for the CoinCounter class - creates an empty purse.
     */
    public CoinCounter()
    {
        purse.put( 't', new CoinCount( Coin.TOONIE ) );
        purse.put( 'l', new CoinCount( Coin.LOONIE ) );
        purse.put( 'q', new CoinCount( Coin.QUARTER ) );
        purse.put( 'd', new CoinCount( Coin.DIME ) );
        purse.put( 'n', new CoinCount( Coin.NICKEL ) );
        purse.put( 'p', new CoinCount( Coin.PENNY ) );
        dTotal = 0;
    }
    
    
    /**
     * Method getNumCoins: Get number of coins in purse for a desired type of
     *  coin
     *  
     * @param coinCode  character code for desired type of coin
     * @return  number of coins of desired type in purse
     */
    public int getNumCoins( char coinCode )
    {
        CoinCount result = purse.get( coinCode );
        return result == null ? 0 : result.getNumCoins();
    }
    
    
    /**
     * Method getTotal: Returns total value of coins in purse
     * 
     * @return  Total value of coins in purse
     */
    public double getTotal()
    {
//        double dTotal = 0.0;
//        for ( Character c : purse.keySet() )
//        {
//            CoinCount temp = purse.get( c );
//            dTotal += temp.getNumCoins() * temp.getCoinType().value();
//        }
        
        return dTotal;
    }
    
    /**
     * Method addCoin: Adds specified coin to purse
     * 
     * @param cCoinToAdd    character indicating coin to be added
     * @throws IllegalArgumentException if an invalid character is given
     */
    public void addCoin(char cCoinToAdd) throws IllegalArgumentException
    {
        if ( !purse.containsKey( cCoinToAdd ))
        {
            throw new IllegalArgumentException("Invalid coin type");
        }
        CoinCount result = purse.get( cCoinToAdd );
        result.addACoin();
        dTotal += result.getCoinType().value();
    }
}
