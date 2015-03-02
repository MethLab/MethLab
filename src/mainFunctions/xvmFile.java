package mainFunctions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class xvmFile {
	
	public HashMap<String,ArrayList<String>> fileContents = new HashMap<String,ArrayList<String>>();
	public ArrayList<File> fileList = new ArrayList<File>();
	
	private Set xvmSet;
	private Iterator iterHashMap;
	private Map.Entry xvmHashMapEntry;
	
//	Konstruktor, xvm-conf Pfad als Parameter
	public xvmFile(String path) throws IOException{
		File file = new File(path);

//		Listet alle Dateien in Verzeichnis auf >> fileList
		Collections.addAll(fileList, file.listFiles());
		
		for (int i = 0; i < fileList.size(); i++){
			fileContents.put(fileList.get(i).getName(),this.readFileAtOnce(fileList.get(i).getAbsolutePath()));
		}	
	}
	
//	listet Hashmap auf (debuggen)
	public void listHashMap(){
		this.xvmSet = fileContents.entrySet();
		this.iterHashMap = xvmSet.iterator();
		
		while(iterHashMap.hasNext()){
			xvmHashMapEntry = (Map.Entry)iterHashMap.next();
			System.out.println(xvmHashMapEntry.getKey()+": ");
			System.out.println(xvmHashMapEntry.getValue());
		}
	}
	
//	conf-File lesen	
	public ArrayList<String> readFileAtOnce(String absolutePath) throws IOException{
		
		ArrayList<String> bufferList = new ArrayList<String>();
		BufferedReader xvmReader = new BufferedReader(new FileReader(absolutePath));
		String bufferString = new String("");
		
		while((bufferString = xvmReader.readLine())!= null ){
			bufferList.add(bufferString);
		}
		xvmReader.close();
		return bufferList;	
	}

}
