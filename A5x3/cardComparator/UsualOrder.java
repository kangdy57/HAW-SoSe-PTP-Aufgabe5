package cardComparator;

import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Comparator for Cards defining "usual order"
 * 
 * @author Da Yeon Kang
 * @version 27.05.2022 v1
 */
public class UsualOrder implements Comparator<Card> {

	@Override
	public int compare(Card card1, Card card2) {

		Map<Suit, Integer> cardSuit = new HashMap<Suit, Integer>();
		cardSuit.put(CLUB, 0);
		cardSuit.put(SPADES, 1);
		cardSuit.put(HEART, 2);
		cardSuit.put(DIAMOND, 3);
		
		int RankCompare = card2.getRank().compareTo(card1.getRank());
		int SuitCompare = cardSuit.get(card1.getSuit()).compareTo(cardSuit.get(card2.getSuit()));
		
		return (RankCompare == 0) ? SuitCompare : RankCompare;
		
		

//		if (card1.getRank().value() < card2.getRank().value()) {
//			return 1;
//		} else if (card1.getRank().value() == card2.getRank().value()) {
//			return 0;
//		} else if (card1.getRank().value() > card2.getRank().value()) {
//			return -1;
//		} else {
//			return 100;
//		}

//		if (cardSuit.get(card1.getSuit()) > cardSuit.get(card2.getSuit())) {
//			return 1;
//		}
//
//		if (cardSuit.get(card1.getSuit()) == cardSuit.get(card2.getSuit())) {
//			return 0;
//		}
//		if (cardSuit.get(card1.getSuit()) < cardSuit.get(card2.getSuit())) {
//			return -1;
//		}

	}

}