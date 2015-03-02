import java.io.IOException;

import mainFunctions.xvmFile;
import mainFunctions.xvmTag;

public class xvmMain {

	public static void main(String[] args) throws IOException {
		xvmFile file = new xvmFile("C:\\Games\\World_of_Tanks\\res_mods\\configs\\xvm\\default\\");
		xvmTag tag = new xvmTag("\"\\w+\"[^,]\\s");
//		file.listHashMap();
		tag.getTags(file.fileContents.get("hangar.xc"));
//		System.out.println(tag.tagList);
		System.out.println(file.readFileAtOnce(file.fileList.get(0).getAbsolutePath()));
		
		System.out.println(tag.isMainTag(file.fileContents.get("hangar.xc"), "hangar"));
		

	}

}
