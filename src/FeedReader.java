
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import ie.cct.objectorientedconstructs.FeedFactoryInterface;
import ie.cct.objectorientedconstructs.FeedInterface;

// Modify this to match your package
import ie.cct.objectorientedconstructs.s2018447s2018245.FeedFactory;

public class FeedReader {
	
	public static void main(String[] args) throws IOException {
	
		// This will produce an error until you create your own class
		// FeedFactory and fix the import at line 7 
		FeedFactoryInterface factory = new FeedFactory();
    
		
		String file = "test.rss";
		BufferedReader in = new BufferedReader(new FileReader(file));
    
		FeedInterface feed = factory.createFeed(in);
    
		System.out.println("=== News items ===");
		
		for(String title : feed.listTitles()) {
			System.out.println(title);
		}
	}
}
