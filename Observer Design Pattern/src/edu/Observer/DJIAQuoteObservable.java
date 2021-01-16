package edu.Observer;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class DJIAQuoteObservable extends Observable {

	float quote;

	void changeQuote(float q) {
		this.quote = q;
		setChanged();
		notifyObservers(new DJIAEvent(q));
	}
}
