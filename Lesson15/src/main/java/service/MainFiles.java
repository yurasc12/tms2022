package service;

import org.apache.commons.io.FileUtils;
import utils.FilesUtils;

import java.io.File;
import java.util.List;

public class MainFiles {
    public static final String DIR_NAME = "C:/Users/PC/IdeaProjects/tms2022";

    public static void main(String[] args) {
        FilesUtils.readFiles(new File(DIR_NAME));


        List<File> files = (List<File>) FileUtils.listFiles(new File(DIR_NAME), null, true);
        for (File file : files) {
            System.out.println(file + " size -" + file.length());
        }

    }
}

