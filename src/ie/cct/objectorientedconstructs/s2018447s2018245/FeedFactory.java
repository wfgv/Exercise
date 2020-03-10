package ie.cct.objectorientedconstructs.s2018447s2018245;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import ie.cct.objectorientedconstructs.FeedFactoryInterface;
import ie.cct.objectorientedconstructs.FeedInterface;

//@author Edwards Jr 2018245

public class FeedFactory implements FeedFactoryInterface {
	
	Feed f1 = new Feed("BREAKING NEWS", null);

	public FeedFactory() {
		//reading from the rss file
		File file = new File("test.rss");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public FeedInterface createFeed(BufferedReader in) throws IOException {
		return f1;

	}

}
