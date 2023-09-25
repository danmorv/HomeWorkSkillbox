import javax.swing.text.Document;
import org.jsoup.Jsoup;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

//          DataCollector dataCollector = new DataCollector();
//          System.out.println(dataCollector.getNameStations() + "\n");
//
//          Lines lines = new Lines();
//          lines.getLinesInfo();
//          System.out.println();
//
//          Stations stations = new Stations();
//          stations.getStationsInfo();
//
//          ArrayList<File> fileArrayList = new ArrayList<File>();
//          SearchFiles searchFiles = new SearchFiles();
//          searchFiles.searchFiles(new File("/Users/danilmorozov/Downloads"), fileArrayList);
//          for (File file : fileArrayList) {
//              System.out.println(file);
//        }
        ParserJSON parserJSON = new ParserJSON();
        parserJSON.ParserCSV("/Users/danilmorozov/Downloads/data/4/6/dates-1.csv");

    }
}
