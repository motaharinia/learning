package com.motaharinia.msutility.fso.mimetype;

import java.io.IOException;
import java.net.FileNameMap;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-09-07<br>
 * Time: 15:00:41<br>
 * Description:<br>
 */
public interface FsoMimeTypeTools {



    static void main(String[] args) {
        List<String> fileList = new ArrayList<>();
        fileList.add("test.doc");
        fileList.add("test.docx");
        fileList.add("test.xls");
        fileList.add("test.xlsx");
        fileList.add("test.ppt");
        fileList.add("test.pptx");
        fileList.add("test.jpg");
        fileList.add("test.tif");
        fileList.add("test.tiff");
        fileList.add("test.gif");
        fileList.add("test.png");
        fileList.add("test.bmp");
        fileList.add("test.xwd");
        fileList.add("test.xbm");
        fileList.add("test.xpm");
        fileList.add("test.ppm");
        fileList.add("test.pgm");
        fileList.add("test.pbm");
        fileList.add("test.pnm");
        fileList.add("test.ras");


        //         FileUtils.getMimeType
//         URLConnection.guessContentTypeFromName
//         FilenameUtils.getMimeType

        System.out.println("=====================URLConnection.getFileNameMap().getContentTypeFor(''):");
        FileNameMap fileNameMap = URLConnection.getFileNameMap();
        fileList.stream().forEach(item -> System.out.println(fileNameMap.getContentTypeFor(item)));

        System.out.println("=====================URLConnection.guessContentTypeFromName(''):");
        fileList.stream().forEach(item -> System.out.println(URLConnection.guessContentTypeFromName(item)));

        System.out.println("=====================Files.probeContentType(Paths.get('')):");
        fileList.stream().forEach(item -> {
            try {
                System.out.println(Files.probeContentType(Paths.get(item)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
