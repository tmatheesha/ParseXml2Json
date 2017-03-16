/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtogether.parsexmltojson;
import java.io.File;
//import java.io.FileOutputStream;
import java.io.FileWriter;
//import java.io.PrintStream;
//import java.io.PrintWriter;
import org.json.JSONObject;
import org.codehaus.jackson.map.ObjectMapper;

import learningtogether.ReadFile.ReadXmlFile;
import org.json.XML;
import org.json.JSONException;

/**
 *
 * @author tmatheesha
 */
public class ParseXmlToJson {
    
    public static int PRETTY_PRINT_INDENT_FACTOR =4;
   // public static String PATH = "E/Uni/Syllabus/Level4/FYP/DataSets/StackExchange/Posts.xml";
   //public static String PATH = "E:/Uni/Syllabus/Level4/FYP/datasets/NewDataSet/Movies/Posts.xml";
   public static String PATH = "E:/Uni/Syllabus/Level4/FYP/datasets/NewDataSet/metaStackOverflow/Comments.xml";
    
    public static void main(String[] args) throws Exception{
        try {
            String textXML =ReadXmlFile.readXMLfile(PATH); 
            JSONObject xmlJson = XML.toJSONObject(textXML);
            String jsonPrettyPrint = xmlJson.toString(PRETTY_PRINT_INDENT_FACTOR);
            System.out.println(jsonPrettyPrint);
            /*File file = new File("C:/posts.json");
            FileWriter fw = new FileWriter(file);*/
//            try (PrintWriter pw = new PrintWriter(fw)) {
//                pw.println(jsonPrettyPrint);
//                pw.close();
//                //JSObject xmlJson = XML.(textXML);
//            }catch(Exception e){
//                System.out.println("out put file error");
//            }
        } catch (JSONException e) {
            System.out.println(e.toString());
        }
    
    }
    
}
