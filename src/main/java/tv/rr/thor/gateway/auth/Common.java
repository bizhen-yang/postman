package tv.rr.thor.gateway.auth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class Common {
	static String readPostmanJson(String fileName){
		String encoding = "UTF-8";  
        File file = new File(fileName);  
        Long filelength = file.length();  
        byte[] filecontent = new byte[filelength.intValue()];  
        try {  
            FileInputStream in = new FileInputStream(file);  
            in.read(filecontent);  
            in.close();  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        try {  
            return new String(filecontent, encoding);  
        } catch (UnsupportedEncodingException e) {  
            System.err.println("The OS does not support " + encoding);  
            e.printStackTrace();  
            return null;  
        }  
	}
	
	static void writePostmanJson(String jsonData, String fileName) throws  IOException{
		FileOutputStream fos = new FileOutputStream(fileName);   
	    OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");   
	    osw.write(jsonData);   
	    osw.flush();   
	}
	
	static String repalce(String jsonData, Map<String, String> variables){
		Iterator<Map.Entry<String, String>> it = variables.entrySet().iterator();
		while (it.hasNext()) {
		   Map.Entry<String, String> entry = it.next();
		   String v = "{{"+entry.getKey()+"}}";
		   jsonData = jsonData.replace(v, entry.getValue());
		}
		
		return jsonData;
	}
}
