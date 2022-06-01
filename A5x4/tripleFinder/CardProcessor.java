package tripleFinder;

import java.util.HashMap;
import java.util.Map;

import cards.Card;
import cards.Card.Rank;
import cards.Deck;

public class CardProcessor implements CardProcessor_I {

	Map<Integer, Card> storeCards = new HashMap<>();
	int index = 0;

	@Override
	public Object process(Card card) {

		storeCards.put(index, card);
		Map<Integer, Card> threeCards = new HashMap<>();

		if (index >= 2 && index < 52) {
			for (int i = 0; i < storeCards.size(); i++) {
				int counter = 0;
				for (int j = 0; j < storeCards.size(); j++) {
					if (storeCards.get(i).getRank().value() == storeCards.get(j).getRank().value()
							&& storeCards.get(i).getSuit().ordinal() != storeCards.get(j).getSuit().ordinal()) {
						counter++;
						if (counter == 1) {
							Card card1 = storeCards.get(i);
							Card card2 = storeCards.get(j);
							threeCards.put(0, card1);
							threeCards.put(1, card2);
						}
						if (counter == 2) {
							Card card3 = storeCards.get(j);
							threeCards.put(2, card3);
							return threeCards;
						}
					}
				}
			}
		}

		index = index + 1;
		return null;

	}

	@Override
	public void reset() {
		index = 0;
		storeCards.clear();
	}

}
