package cardComparator;


import java.util.*;

import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * Sort with help of Comparator - see task
 * 
 * @author   Michael Schaefers (correct german writing: "Michael Schäfers");  P1@Hamburg-UAS.eu 
 * @version  2020/05/12 (#1)
 */
public class TestFrame {
    
    /**
     * Diese Methode testet die Loesung zu "usual order".
     * Diese Methode darf bis zur "Markierung" NICHT geaendert werden
     * ausser, dass Sie "den Kommentar vor den letzten Statements" entfernen muessen.
     * Wohl aber duerfen Sie am Ende/nach der Markierung eigene Tests ergaenzen.
     * 
     * @param unused  wird nicht genutzt
     */
    public static void main( final String... unused ){
        System.out.printf( "ITS1-P1 (SS21):\n" );
        System.out.printf( "===============\n" );
        System.out.printf( "\n" );
        
        
        final Deck deck = new Deck();
        final int randomNumber = 1+ (int)( 52*Math.random() );
        final List<Card> list = new ArrayList<Card>();
        for( int stillToDO=randomNumber; --stillToDO>=0; ){
            list.add( deck.deal() );
        }//for
        
        
      final Comparator<Card> usualOrder = new UsualOrder();
      System.out.println( list );
      Collections.sort( list, usualOrder );
      System.out.println( list );
        //----------------------------------------------------------------------// "MARKIERUNG" ;-)
        // Ab hier duerfen Sie eigene Tests Ergaenzen
    }//method()
    
}//class
