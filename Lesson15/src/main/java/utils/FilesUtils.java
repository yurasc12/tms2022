package utils;

import lombok.experimental.UtilityClass;

import java.io.File;
import java.util.Objects;

@UtilityClass
public class FilesUtils {
    public void readFiles(File dirName) {
        if (dirName.isDirectory()) {
            for (File file : Objects.requireNonNull(dirName.listFiles())) {
                if (file.isFile()) {
                    System.out.println("file : " + file.getAbsoluteFile() + " " + file.length());
                } else {
                    System.out.println("dir : " + file.getAbsoluteFile());
                    readFiles(file);
                }
            }
        }

    }
}
