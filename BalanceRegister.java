package math282a1q1;

/*
 *  Date created:  Fall 2024
 *  Course name:  MATH 282
 *  Instructors:  Michael Grzesina
 *  File name:  CoinCounter.java
 */

import java.util.Scanner;

/**
 *  Purpose:  Gets amount of money in register and then gets coins in
 *    register and compares to amount of money.  Uses CoinCounter class to
 *    demonstrates problems with floating-point representations and allows
 *    testing of various solutions.
 *   Note that this program does not do any validation of user input.
 *
 * @author Michael Grzesina
 * @author Andrea Grzesina
 * @version August 30, 2017
 */
public class BalanceRegister
{
    /**
     *  The program starts here.
     *
     * @param args  the command line parameters
     */
    public static void main(String[] args)
    {
        Scanner consoleInput = new Scanner(System.in);

        System.out.println("*** This program will balance the amount of \n"
                + "    change that should be in the cash register with\n"
                + "    the amount that is actually in the register. ***\n");
        
        System.out.print("Enter the amount that should be in the register: ");
        double dRegisterBalance = Math.abs(consoleInput.nextDouble());
        
        CoinCounter changeInRegister = countCoins();
        double dCoinAmount = Math.abs(changeInRegister.getTotal());
        
        System.out.println("\nAmount that should be in register: "
                + dRegisterBalance);
        System.out.println("Value of all coins counted: "
                + dCoinAmount);
        if (Math.abs(dRegisterBalance) > Math.abs(dCoinAmount))
        {
            System.out.println("-=> You are short!");
            System.out.println("Amount: " + (dRegisterBalance - dCoinAmount));
        }
        else if (Math.abs(dRegisterBalance) < Math.abs(dCoinAmount))
        {
            System.out.println("-=> You have more money than you should!");
            System.out.println("Amount: " + (dCoinAmount - dRegisterBalance));
        }
        else
        {
            System.out.println("-=> Amounts balance");
        }
    }
    
    
    /**
     *  Gets coins in register and adds them to CoinCounter object.
     *  Note that this method could be replaced or altered to get input from a
     *   machine where coins are dropped in instead of requiring the user to
     *   type in all the coins.
     *
     * @return change that has been counted
     */
    public static CoinCounter countCoins()
    {
        Scanner consoleInput = new Scanner(System.in);
        CoinCounter change = new CoinCounter();
        
        System.out.println("\nEnter the coins in the register as follows: "
                + " t for toonie / l for loonie /");
        System.out.println(" q for quarter / d for dime / n for nickel /"
                + " p for penny");
        System.out.print("Coins: ");

        String coinString = consoleInput.next().toLowerCase();
        
        for (int i = 0; i < coinString.length(); i++)
        {
            try
            {
                change.addCoin(coinString.charAt(i));
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(coinString.charAt(i) + " is not a valid"
                        + " coin and was ignored.");
            }
        }
        
        return change;
    }
}
