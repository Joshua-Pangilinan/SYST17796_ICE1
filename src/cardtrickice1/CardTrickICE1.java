/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan
 * @modifier Joshua Pangilinan 991442827
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        Boolean checkFlag = false;
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuits("spades");
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card card = new Card();
            card.setValue(r.nextInt(13) + 1);
            card.setSuits(card.SUITS[r.nextInt(4)]);
            System.out.println(card.toString());
            magicHand[i] = card;
        }
        //step 2:take input 
        System.out.print("Pick a card, any card: ");
        String input = scanner.nextLine();
        //step 3: match with array 
        for (int i=0; i<magicHand.length; i++){
            if (magicHand[i].toString().equals(input)){
                checkFlag = true;
            }
        }

        if (checkFlag == true){
            System.out.println("Your card was in the hand!");
        } else {
            System.out.println("Try again!");
        }
    }
}
