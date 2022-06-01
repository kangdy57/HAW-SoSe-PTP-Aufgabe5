// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package cardProcessor;

import java.util.*;

import cards.*;

/**
 * CardProcessor printing cards in reverse order - see task
 * 
 * @author Da Yeon Kang
 * @version 25.05.2022.v1
 */

public class CardProcessor {

	public void reverseOrder(Deck deck, Card lastCard, boolean dbgOutputEnable) {

		Stack<Card> cardList = new Stack<Card>();

		for (int i = 0; i < 52; i++) {
			Card drawnCard = deck.deal();
			if (!drawnCard.equals(lastCard)) {
				cardList.add(drawnCard);
				if (dbgOutputEnable) {
					System.out.print(drawnCard);
				}
			} else if (drawnCard.equals(lastCard)) {
				cardList.add(drawnCard);
				if (dbgOutputEnable) {
					System.out.print(drawnCard);
				}
				break;
			}
		}

		System.out.println();

		for (int i = cardList.size(); i > 0; i--) {
			Card poppedCard = cardList.pop();
			if (dbgOutputEnable) {
				System.out.print(poppedCard);
			}
		}
	}

}

/**
 * Die Methode reverseOrder() zieht solange Karten von einem Kartenstapel bis
 * eine gewuenschte Karte gezogen wird und gibt danach alle gezogenen Karten in
 * umgekehrter Reihenfolge wieder aus.
 *
 * @param deck            der Kartenstapel von dem die Karten gezogen werden.
 * @param lastCard        die gewuenschte Karte, die die Ziehung beendet.
 * @param dbgOutputEnable true schaltet Kontrollausgabe an und false aus.
 */