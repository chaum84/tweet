/**
 * 
 */
package model;

import java.sql.Date;

/**
 * @author bastien
 *
 */
public class Tweet {
	int idTweet;
	int idUser;
	Date dateTweet;
	String content;
	int idUserRT;
	
	public Tweet(String idTweet, String idUser, String dateTweet, String content, String idUserRT)
	{
		try 
		{ 
			this.idTweet = Integer.parseInt(idTweet);
			this.idUser = Integer.parseInt(idUser);
			this.dateTweet = Date.valueOf(dateTweet);
			this.content = content;
			this.idUserRT = Integer.parseInt(idUserRT);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
