import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Lines extends DataCollector{
    public void getLinesInfo() throws Exception {
        Document stations = getNameStations();
        Elements stationsName = stations.select("span[data-line]");
        //int number = 1;
        for (Element elements : stationsName) {
            String numberLines = elements.attr("data-line");
            System.out.println(numberLines + " " + elements.text());

        }
    }
}

