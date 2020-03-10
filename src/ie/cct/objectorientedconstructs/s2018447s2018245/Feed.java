package ie.cct.objectorientedconstructs.s2018447s2018245;

import java.util.Collection;

import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;

public class Feed implements FeedInterface {

	@Override
	public Collection<String> listTitles() {
		return null;
	}

	@Override
	public FeedItem getItem(String title) {
		return null;
	}

	@Override
	public int numItems() {
		return 0;
	}

	@Override
	public Collection<FeedItem> findItems(String keyword) {
		return null;
	}

}
