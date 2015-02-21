package mainFunctions;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class xvmFile {
	
	public HashMap fileContents = new HashMap();
	public ArrayList<File> fileList = new ArrayList<File>();
	
	public xvmFile(String path){
		File file = new File(path);
		
		
		
		Collections.addAll(fileList, file.listFiles());
		
		for (int i = 0; i < fileList.size(); i++){
			fileContents.put(fileList.get(i).getName(),i);
			
		}
		
		
	}
}
