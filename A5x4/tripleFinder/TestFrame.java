package tripleFinder;
//Internal Note:
//==============
//Entfernen Sie die Block-Kommentar-Zeichen "/*" und "*/"


import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * TestFrame for CardProcessor/TripleFinder - see task.
 * 
 * @author   Michael Schaefers (correct german writing: "Michael Schäfers");  P1@Hamburg-UAS.eu 
 * @version  2020/06/03 #1
 */
 public class TestFrame {
    
    public static void main( final String... unused ){
        System.out.printf( "ITS1-P1 (SS21):\n" );
        System.out.printf( "===============\n" );
        System.out.printf( "\n" );
        
        
        final boolean dbgOutputEnable = true;
        
        
        System.out.printf( "ACHTUNG!: Es folgen zufallsbasierte Tests.\n" );
        System.out.printf( "\n\n" );
        
        
        System.out.printf( "Test1: Ziehe solange Karten bis der 1.Drilling aufgetreten ist.\n" );
        System.out.printf( "======\n" );
        final CardProcessor_I cp = new CardProcessor();
        Deck deck = new Deck();
        Object result;
        do{
            final Card card = deck.deal();
            if( dbgOutputEnable )  System.out.printf( "%s",  card );
            result = cp.process( card );
        }while( null == result );
        if( dbgOutputEnable )  System.out.printf( "\n==>> " );
        System.out.printf( "%s\n", result );
        System.out.printf( "\n\n" );
        
        
        System.out.printf( "Test2:\n" );
        System.out.printf( "======\n" );
        cp.reset();
        System.out.printf( " -- \"reset()\" ---\n" );
        System.out.printf( "Ziehe solange Karten bis der 1.Drilling aufgetreten ist, aber NICHT mehr als 13 Karten.\n" );
        deck = new Deck();
        result = null;
        int stillToDo=13;
        while( null==result  &&  --stillToDo>=0 ){
            final Card card = deck.deal();
            if( dbgOutputEnable )  System.out.printf( "%s",  card );
            result = cp.process( card );
        }//while
        if( dbgOutputEnable )  System.out.printf( "\n==>> " );
        System.out.printf( "%s\n", result );
        System.out.printf( "\n\n" );
        
        
        System.out.printf( "Test3:\n" );
        System.out.printf( "======\n" );
        cp.reset();
        System.out.printf( " -- \"reset()\" ---\n" );
        System.out.printf( "Ziehe solange Karten bis der 1.Drilling aufgetreten ist.\n" );
        result = null;
        while( null==result ){
            final Card card = deck.deal();
            if( dbgOutputEnable )  System.out.printf( "%s",  card );
            result = cp.process( card );
        }//while
        if( dbgOutputEnable )  System.out.printf( "\n==>> " );
        System.out.printf( "%s\n", result );
        
    }//method()
    
}//class
