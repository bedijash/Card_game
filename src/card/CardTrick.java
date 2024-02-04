/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Name :Jashanpreet singh Bedi  Student id: 991715257  Exercise-1
//IN Class search the randomly generated array of 7 cards and search for lucky card if it is there it print win otherwise loose
package card;
 

import java.util.Scanner;
import java.util.Random;

public class CardTrick {
    private static final int HAND_SIZE = 7;
    private static final String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    private static final String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        String[] magicHand = generateRandomHand();
        String luckyRank = "8";  
        String luckySuit = "Spades"; 
        String luckyCard = luckyRank + " of " + luckySuit;
         
        System.out.print("Enter the card value (1-13): ");
        int cardValue = input.nextInt();
        System.out.print("Enter the suit (0-3 in which 0 is hearts,1 is diamond, 2 is clubs, 3 is spades): ");
        int suitValue = input.nextInt();

       
        int rankIndex = cardValue - 1;  
        int suitIndex = suitValue - 1;  

         
        String userCard = ranks[rankIndex] + " of " + suits[suitIndex];

         
        if (isCardInHand(userCard, magicHand)) {
            System.out.println("Congratulations! Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand. Have a good luck next time!");
        }
    }

    
    private static String[] generateRandomHand() {
        Random random = new Random();
        String[] hand = new String[HAND_SIZE];
        for (int i = 0; i < HAND_SIZE; i++) {
            String randomSuit = suits[random.nextInt(suits.length)];
            String randomRank = ranks[random.nextInt(ranks.length)];
            hand[i] = randomRank + " of " + randomSuit;
        }
        return hand;
    }

    private static boolean isCardInHand(String userCard, String[] magicHand) {
        for (String card : magicHand) {
            if (card.equalsIgnoreCase(userCard)) {
                return true;
            }
        }
        return false;
    }
}
