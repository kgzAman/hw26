package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JsonReader {
   public static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static KeyValue[] ReadKeyAndValue(){
        String fromFile = "";
        try (
                FileReader fileReader = new FileReader("./key.json");
                Scanner sc =  new Scanner(fileReader)
                ){
            while (sc.hasNextLine()){
                fromFile+=sc.nextInt();
            }
        }catch (IOException a ){
            a.printStackTrace();
        }
        return gson.fromJson(fromFile, KeyValue[].class);
    }

    public void WriteKeyAndValue(Object obj){
            try (FileWriter fw = new FileWriter("./key.Json")){
                fw.write(gson.toJson(obj));
            }catch (IOException e ){
                e.printStackTrace();
            }
    }

}
