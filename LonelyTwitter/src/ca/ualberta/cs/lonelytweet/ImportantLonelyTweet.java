package ca.ualberta.cs.lonelytweet;

import java.io.Serializable;
import java.util.Date;

public class ImportantLonelyTweet extends 
LonelyTweet implements Serializable {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		String tweetString = getTweetDate() + " | " + getTweetBody();
		return tweetString;
	}

	public String getTweetBody()
	{
		return tweetBody.toUpperCase();
	}
}