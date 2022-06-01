package cardProcessor;


import java.util.*;

import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * Remove duplicates - see task
 * 
 * @author   Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *           P1@Hamburg-UAS.eu 
 * @version  2022/05/16 (#1)
 */
public class TestFrame {
    
    /**
     * Diese Methode testet die Loesung zu "remove duplicate cards".
     * Diese Methode darf bis zur "Markierung" NICHT geaendert werden
     * ausser, dass Sie "den Kommentar vor den letzten Statements" entfernen muessen.
     * Wohl aber duerfen Sie am Ende/nach der Markierung eigene Tests ergaenzen.
     * 
     * @param unused  wird nicht genutzt
     */
    public static void main( final String... unused ) {
        System.out.printf( "2022/05/16 (#01):\n" );
        System.out.printf( "=================\n" );
        System.out.printf( "\n" );
        
        
        final Card[] testCase = { CJ, DJ, DJ, C9, HQ, D2, HQ };
        System.out.println( Arrays.toString( testCase ) );
        final CardProcessor cardProcessor = new CardProcessor();
        final Card[] result = cardProcessor.removeDuplicates( testCase );       // Entfernen Sie die Kommentarzeichen am Anfang der Zeile
        System.out.println( Arrays.toString( result ) );                        // Entfernen Sie die Kommentarzeichen am Anfang der Zeile
        //----------------------------------------------------------------------// "MARKIERUNG" ;-)
        // Ab hier duerfen Sie eigene Tests Ergaenzen
    }//method()
    
}//class
