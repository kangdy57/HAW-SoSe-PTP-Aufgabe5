package cardProcessor;


import java.util.*;

import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * CardProcessor removing duplicates - see task
 * 
 * @author   Da Yeon Kang
 * @version  26.05.2022 v1
 */
public class CardProcessor {
	
	public Card[] removeDuplicates(Card[] cards) {
		
		
		HashSet<Card> cardSet = new HashSet<>();
		int arrayLength = cards.length;
		for(int i = 0; i < arrayLength - 1; i++) {
			cardSet.add(cards[i]);
		}
		
		Card[] nonDuplicateCards = new Card[cardSet.size()]; 

		
		return cardSet.toArray(nonDuplicateCards);
	}
 
}//class






//Iterator cardIterator = cardSet.iterator();
//for(int i=0; i< nonDuplicateCards.length; i++) {
//	nonDuplicateCards[i] = cardIterator.;
//}


	
//HashMap<Card,Integer> map = new HashMap<>();
//int arrayLength = cards.length;
//
//for(int i = 0; i < arrayLength - 1; i++) {
//	if (map.containsKey(cards[i])) {
//		map.put(cards[i], map.get(cards[i]) + 1);
//	} else {
//		map.put(cards[i], 1);
//	}
//}
//
//map.forEach((k,v) -> System.out.print(k + " "));

