import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileUtility {

    protected void copyFolder(String fileToSave, String whereToSave) {
        String source = fileToSave;
        File srcDir = new File(source);

        String destination = whereToSave;
        File destDir = new File(destination);

        try {
            FileUtils.copyDirectory(srcDir, destDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
