package ie.cct.objectorientedconstructs.s2018447s2018245;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;

/*
 * @author Willian Voelz 2018447
 *
 */
 

public class Feed implements FeedInterface {
	
	private Collection<FeedItem> feedItems;
	
	public Feed (String title, List<FeedInterface> feedItems) {
		this.feedItems = new ArrayList<FeedItem>();
		
	}

	@Override
	public Collection<String> listTitles() {
		
		//return this.feedItems;
		return new ArrayList<String>();
		//return null;

	}

	@Override
	public FeedItem getItem(String title) {

		return this.getItem(title);
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
