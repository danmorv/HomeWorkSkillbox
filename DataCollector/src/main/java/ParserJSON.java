import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ParserJSON {
    List<Metro> list = new ArrayList<Metro>();

    public void ParserCSV(String file) {
        String line = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] stationsMetro = line.split(",");
                list.add(new Metro(stationsMetro[0], stationsMetro[1]));
            }
            System.out.println("Metro stations: " + new GsonBuilder().setPrettyPrinting().create().toJson(list));
        } catch (Exception e) {
            e.getMessage();
        }
    }




}
