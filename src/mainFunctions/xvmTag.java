package mainFunctions;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class xvmTag {
	
	String tagPattern = new String("");
	public ArrayList<String> tagList = new ArrayList<String>();

	
	public xvmTag(String tagPattern){
		this.tagPattern = tagPattern;
	}
	
	public void getTags(String stringToParse){
		Pattern tagPattern = Pattern.compile(this.tagPattern);
		Matcher tagMatcher = tagPattern.matcher(stringToParse);
		
		while (tagMatcher.find()){
			this.tagList.add(tagMatcher.group().replace(":", ""));
		}
	}
	


}
