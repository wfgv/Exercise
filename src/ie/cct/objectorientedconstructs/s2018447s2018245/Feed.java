package ie.cct.objectorientedconstructs.s2018447s2018245;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;

//@author Willian Voelz 2018447

public class Feed implements FeedInterface {
	
	
	
	private Collection<FeedInterface> feedItems;
	
	public Feed (String title, List<FeedInterface> feedItems) {
		this.feedItems = feedItems;
		
	}

	@Override
	public Collection<String> listTitles() {
		// TODO Auto-generated method stub
		return this.feedItems;
	}

	@Override
	public FeedItem getItem(String title) {
		// TODO Auto-generated method stub
		return this.feedItems.get(title);
	}

	@Override
	public int numItems() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<FeedItem> findItems(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
