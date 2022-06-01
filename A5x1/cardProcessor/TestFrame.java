// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package cardProcessor;


import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * Reverse order - see task
 * 
 * @author   Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *           P1@Hamburg-UAS.eu 
 * @version  2022/05/16 (#1)
 */
public class TestFrame {
    
    /**
     * Diese Methode testet die Loesung zu "cards in reverse order".
     * Diese Methode darf bis zur "Markierung" NICHT geaendert werden
     * ausser, dass Sie "den Kommentar vor den letzten Statements" entfernen muessen.
     * Wohl aber duerfen Sie am Ende/nach der Markierung eigene Tests ergaenzen.
     * 
     * @param unused  wird nicht genutzt
     */
    public static void main( final String... unused ){
        System.out.printf( "2022/05/16 (#01):\n" );
        System.out.printf( "=================\n" );
        System.out.printf( "\n" );
        
        
        final Deck deck = new Deck();
        final CardProcessor cardProcessor = new CardProcessor();
        cardProcessor.reverseOrder( deck, CJ, true );                           // Entfernen Sie die Kommentarzeichen am Anfang der Zeile
        //----------------------------------------------------------------------// "MARKIERUNG" ;-)
        // Ab hier duerfen Sie eigene Tests ergaenzen
    }//method()
    
}//class
