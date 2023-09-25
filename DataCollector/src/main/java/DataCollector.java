import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.net.URL;

public class DataCollector {
    protected Document nameStations;
    private final String url = "https://skillbox-java.github.io/";
    public Document getNameStations() throws Exception {
            nameStations = Jsoup.parse(new URL(url), 3000);
            return nameStations;
    }
}




