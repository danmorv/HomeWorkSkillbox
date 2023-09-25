import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Stations extends DataCollector  {

    public void getStationsInfo() throws Exception {
        Document stations = getNameStations();
        Elements stationsInfo = stations.select("div[data-line]");
        for (Element element : stationsInfo) {
            String numberLines = element.attr("data-line");
            System.out.println("Линия: " + numberLines);
            System.out.println(element.text());
        }
    }
}