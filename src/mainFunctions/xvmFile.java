package mainFunctions;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class xvmFile {
	
	public HashMap<String,Object> fileContents = new HashMap<String,Object>();
	public ArrayList<File> fileList = new ArrayList<File>();
	
	private Set xvmSet;
	private Iterator iterHashMap;
	private Map.Entry xvmHashMapEntry;
	
	public xvmFile(String path){
		File file = new File(path);
		Collections.addAll(fileList, file.listFiles());
		
		
		for (int i = 0; i < fileList.size(); i++){
			fileContents.put(fileList.get(i).getName(),i);
		}	
	}
	
	public void listHashMap(){
		this.xvmSet = fileContents.entrySet();
		this.iterHashMap = xvmSet.iterator();
		
		while(iterHashMap.hasNext()){
			xvmHashMapEntry = (Map.Entry)iterHashMap.next();
			System.out.print(xvmHashMapEntry.getKey()+": ");
			System.out.println(xvmHashMapEntry.getValue());
		}
	}
}
