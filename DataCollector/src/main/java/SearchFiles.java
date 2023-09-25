import java.io.File;
import java.util.ArrayList;

public class SearchFiles {
    public void searchFiles(File file, ArrayList<File> fileArrayList) {
        if (file.isDirectory()) {
            File[] directoryFiles = file.listFiles();
            if (directoryFiles != null) {
                for (File file1 : directoryFiles) {
                    if (file1.isDirectory()) {
                        searchFiles(file1, fileArrayList);
                    } else {
                        if (file1.getName().toLowerCase().endsWith(".json") ||
                                file1.getName().toLowerCase().endsWith(".csv")) {
                             fileArrayList.add(file1);
                        }
                    }
                }
            }
        }
    }
}
