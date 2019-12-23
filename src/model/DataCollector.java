package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class DataCollector{
	List<Tweet> tweetCollection;
	
	
	public DataCollector(String filename) 
	{
		BufferedReader br = new BufferedReader(new FileReader(filename));
		
		String line;
		while((line = br.readLine()) != null)
		{
			line
		}
		br.close();
		while(br.read() != null)
		{
			
		}
	}
}
