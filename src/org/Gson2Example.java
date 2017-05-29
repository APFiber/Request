package org;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.org.apache.bcel.internal.generic.Type;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Gson2Example {

    public static void main(String[] args) {

        Gson gson = new Gson();

        try {
    		String urlString = "http://irem.apsfl.co.in:9999/irem/status";
    	    
    	    // create the url
    	    URL url = new URL(urlString);
//            Reader reader = new FileReader("http://irem.apsfl.co.in:9999/irem/status");
    	    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			// Convert JSON to Java Object
    	    String line;
//    	    while ((line = reader.readLine()) != null)
//    	    {
            Staff staff = gson.fromJson(reader.readLine(), Staff.class);
            System.out.println(staff);
//    	    }
            List<Staff> list = new ArrayList<Staff>();
            for (int i = 0; i < 20; i++) {
                    list.add(new Staff());
            }
            java.lang.reflect.Type type = new TypeToken<List<Staff>>() {}.getType();
            String json = gson.toJson(list, type);
            System.out.println(json);
            List<Staff> fromJson = gson.fromJson(json, type);

            for (Staff task : fromJson) {
                    System.out.println(task);
            }
            
			// Convert JSON to JsonElement, and later to String
            /*JsonElement json = gson.fromJson(reader, JsonElement.class);
            String jsonInString = gson.toJson(json);
            System.out.println(jsonInString);*/

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}