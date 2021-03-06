package com.vishva.CricInfo.util;

import org.springframework.stereotype.Component;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

@Component
public class FileFetcher {
    public List<File> getFilesFromFolder(String folderName) throws URISyntaxException {
        URL resource = getClass().getClassLoader().getResource(folderName);
        assert resource != null;
        File folder = new File(resource.toURI());
        File[] listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        return Arrays.asList(listOfFiles);
    }
}