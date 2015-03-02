package mainFunctions;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class xvmTag {
	
	String tagPattern = new String();
	public ArrayList<String> tagList = new ArrayList<String>();

	
	public xvmTag(String tagPattern){
		this.tagPattern = tagPattern;
	}
	
	private String toString(ArrayList<String> ListToString){
		String buffer = new String();
		
		for(int i=0; i<ListToString.size(); i++){
			buffer += ListToString.get(i);
		}
		return buffer;
	}
	
	public void getTags(ArrayList<String> dataToParse){
		
		Pattern tagPattern = Pattern.compile(this.tagPattern);
		
		for (int i=0; i<dataToParse.size();i++){
			Matcher tagMatcher = tagPattern.matcher(dataToParse.get(i));
			while (tagMatcher.find()){
				this.tagList.add(tagMatcher.group().replace(":", ""));
			}
		}
	}
	
	
	
	public int isMainTag(ArrayList<String> dataToParse, String tag){
		int braceLeft = 0;
		int braceRight = 0;
		
		String stringToParse = this.toString(dataToParse);
		char[] charContentArray = this.toString(dataToParse).toCharArray();
		
		
		for (int i = stringToParse.indexOf(tag) + tag.length();i < charContentArray.length;i++){
			System.out.print(charContentArray[i]);
			
		}
		
		do {
			
			
			
		} while (braceLeft != braceRight);
		
		return stringToParse.indexOf(tag) + tag.length(); 
		
		
		
	}
}
