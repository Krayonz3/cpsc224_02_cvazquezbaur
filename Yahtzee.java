package assignment_1;

import java.util.Random;
import java.util.Scanner;

/***************
Homework #1
Due Date: 1-31-2019
Names: Carlos Vazquez Baur, Joseph Torii
********************/
public class Yahtzee {
    
    /**
     * Simulates the rolling of a single die
     * @return int mod 6 w
     */
    public static int rollDie()
    {
        Random rand = new Random();
        int roll = rand.nextInt(6)+1; 
        return roll;
    }
    
      /**
     * Sorts the array of dice roll results in the hand
     * @param array[] is the dice roll results, 
     * @param size is the number of dice
     */
    public static void sortArray(int array[], int size)
    {
        boolean swap;
        int temp;
        
        do 
        {
            swap = false;
            for(int count = 0; count < (size - 1); count++)
            {
                if(array[count] > array[count + 1])
                {
                    temp = array[count];
                    array[count] = array[count + 1];
                    array[count + 1] = temp;
                    swap = true;
                }
            }
        } while (swap);  
    }
    
      /**
     * adds up the roll result for every die in the hand
     * @return the total dice roll
     * @param hand[] is the dice roll that is currently in the hand
     */
    public static int totalAllDice(int hand[])
    {
        int total = 0;
        for (int diePosition = 0; diePosition < 5; diePosition++)
        {
            total = total + hand[diePosition];
        }
        return total;
    }
    
      /**
     * checks to see what the most frequent die roll was
     * @return the max count of a kind of roll
     * @param hand[] is the dice roll in the current hand
     */
    public static int maxOfAKindFound(int hand[])
    {
        int maxCount = 0;
        int currentCount;
        for(int dieValue = 1; dieValue <= 6; dieValue++)
        {
            currentCount = 0;
            for(int diePosition = 0; diePosition < 5; diePosition++)
            {
                if(hand[diePosition] == dieValue)
                {
                    currentCount++;
                }
            }
            if(currentCount > maxCount)
            {
                maxCount = currentCount;
            }
        }
        return maxCount;
    }
    
      /**
     * checks to see if the roll is a full house
     * @return true or false
     * @param hand[] is the current dice roll in the hand
     */
    public static boolean fullHouseFound(int hand[])
    {
        boolean foundFH = false;
        boolean found3K = false;
        boolean found2K = false;
        int currentCount;
        
        for (int dieValue = 1; dieValue <= 6; dieValue++)
        {
            currentCount = 0;
            for(int diePosition = 0; diePosition < 5; diePosition++)
            {
                if(hand[diePosition] == dieValue)
                {
                    currentCount++;
                }
            }
            if(currentCount == 2)
            {
                found2K = true;
            }
            if(currentCount == 3)
            {
                found3K = true;
            }
        }
        if(found2K && found3K)
        {
            foundFH = true;
        }
        return foundFH;
    }
    
      /**
     * finds the longest straight in a hand
     * @return the longest straight
     * @param hand[] is the current dice roll
     */
    public static int maxStraightFound(int hand[])
    {
        int maxLength = 1;
        int curLength = 1;
        
        for (int counter = 0; counter < 4; counter++)
        {
            if (hand[counter] + 1 == hand[counter+1])  // jump of 1
            {
                curLength++;
            }
            else if (hand[counter] + 1 < hand[counter + 1]) // jump of >= 2
            {
                curLength = 1;
            }
            if (curLength > maxLength)
            {
                maxLength = curLength;
            }
        }
        return maxLength;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int DICE_IN_PLAY = 5;
        int[] hand = new int[DICE_IN_PLAY];
        Scanner scnr = new Scanner(System.in);
        
        char playAgain = 'y';
        
        while (playAgain == 'y')
        {
            String keep = "nnnnn"; // setup to roll all dice in the first roll
            int turn = 1;
            String keep2 = "yyyyy";
            char[] keep1 = keep.toCharArray();
            char[] temp = keep2.toCharArray();
            
            while (turn < 4 && keep1 != temp)
            {
                // roll dice not kept
                for (int dieNumber = 0; dieNumber < DICE_IN_PLAY; dieNumber++)
                {
                    if(keep1[dieNumber] != 'y')
                    {
                        hand[dieNumber] = rollDie();
                    }
                }
                // outpur roll
                System.out.println("Your roll was: ");
                for(int dieNumber2 = 0; dieNumber2 < DICE_IN_PLAY; dieNumber2++)
                {
                    System.out.println(hand[dieNumber2] + " ");
                }
                System.out.println(" ");
                if(turn < 3)
                {
                    System.out.println("Enter dice to keep (y or n)");
                    keep = scnr.next();
                }
                turn++;
            }
            // start scoring
            // hand need to be ssorted to check for straights 
            sortArray(hand, DICE_IN_PLAY);
            System.out.println("Here is your sorted hand: ");
            
            for (int dieNumber = 0; dieNumber < DICE_IN_PLAY; dieNumber++)
            {
                System.out.print(hand[dieNumber] + " ");
            }
            System.out.println(" ");
            // upper scorecard
            for(int dieValue =  1; dieValue <= 6; dieValue++)
            {
                int currentCount = 0;
                for(int diePosition = 0; diePosition < 5; diePosition++)
                {
                    if(hand[diePosition] == dieValue)
                    {
                        currentCount++;
                    }
                }
                System.out.println("Score " + dieValue * currentCount + " on the " + dieValue + " line");
            }
            // lower scorecard
            if (maxOfAKindFound(hand) >= 3)
            {
                System.out.println("Score " + totalAllDice(hand) + " on the 3 of a kind line");
            }
            else System.out.println("Score 0 on the 3 of a Kind line");
            
            if(maxOfAKindFound(hand) >= 4)
            {
                System.out.println("Score " + totalAllDice(hand) + " on the 4 of a Kind line");
            }
            else System.out.println("Score 0 on the 4 of a Kind line");
            
            if(fullHouseFound(hand))
            {
                System.out.println("Score 25 on the Full House line");
            }
            else
            {
                System.out.println("Score 0 on the Full House line");
            }
            
            if(maxStraightFound(hand) >= 4)
            {
                System.out.println("Score 30 on the Small Straight line");
            }
            else
            {
                System.out.println("Score 0 on the Small Straight line");
            }
            
            if(maxStraightFound(hand) >= 5)
            {
                System.out.println("Score 40 on the Large Straight line");
            }
            else
            {
                System.out.println("Score 0 on the Large Straight line");
            }
            
            if(maxOfAKindFound(hand) >= 5)
            {
                System.out.println("Score 50 on the Yahtzee line");
            }
            else
            {
                System.out.println("Score 0 on the Yahtzee line");
            }
            
            System.out.println("Score "+ totalAllDice(hand) + " on the Chance line");
            System.out.println("Enter 'y' to play again");
            playAgain = scnr.next().charAt(0);
        }
    }
}

    