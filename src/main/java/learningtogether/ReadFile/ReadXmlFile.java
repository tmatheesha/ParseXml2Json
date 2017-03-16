/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtogether.ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author tmatheesha
 */
public class ReadXmlFile {
    
    public static String readXMLfile(String file) throws Exception{
        
        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        String line =null;
        
        StringBuilder stringBuilder = new StringBuilder();
        
        String Is = System.getProperty("line.separator");
        
        try {
                while((line = reader.readLine()) != null){
                    stringBuilder.append(line);
                    stringBuilder.append(Is);

                
                }
            
        } finally {
            reader.close();
        }
        
        
        
        return stringBuilder.toString();
        
    
    }
}
