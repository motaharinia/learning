package com.motaharinia.msutility.fso;


import com.motaharinia.msutility.customfield.CustomDate;
import com.motaharinia.msutility.encoding.EncodingTools;
import com.motaharinia.msutility.fso.mimetype.FsoMimeTypeEnum;
import com.motaharinia.msutility.fso.mimetype.FsoMimeTypeModel;
import org.apache.commons.io.FileUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Administrator
 */

public class FSOService {

    static String thumbName = ".thumb";
    static String pathBase = "/mbazardata";
    static String pathFso = pathBase + "/fso";
    static String pathUploadedFileDirectory = pathBase + "/uploadedfile";

//    @Autowired
//    @Qualifier(value = "LogUploadedFileServiceImpl")
//    private LogUploadedFileService logUploadedFileService;

//    private FSO fso = new FSOFileImpl();


    public HashMap<String, List<FileViewModel>> list(String mainPath, String path) throws Exception {
        HashMap<String, List<FileViewModel>> resultHashMap = new HashMap();
        List<FileViewModel> fileModelList = new ArrayList<>();
        FileViewModel fileViewModel = null;
        Path pathData = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String fullPath = pathFso + mainPath;

        HashMap<String, List<String[]>> hashMapList = FsoTools.list(fullPath, null, null, new String[]{"Thumbs.db"}, new String[]{"thumb"}, false);

        String[] tempArray = null;
        fileModelList = new ArrayList<>();
        for (int i = 0; i < hashMapList.get("file").size(); i++) {
            tempArray = hashMapList.get("file").get(i);
            pathData = Paths.get(fullPath + path + tempArray[0]);
            fileViewModel = new FileViewModel();
            fileViewModel.setLastModifiedDate(new CustomDate(simpleDateFormat.parse(tempArray[2])));
            fileViewModel.setFullPath(path + tempArray[0]);
            fileViewModel.setHashedPath(EncodingTools.base64Encode(path + tempArray[0]));
            fileViewModel.setFullName(tempArray[0]);
            fileViewModel.setName(FsoTools.getFileNameWithoutExtension(fileViewModel.getFullName()));
            fileViewModel.setExtension(FsoTools.getFileExtension(fileViewModel.getFullName()));
            fileViewModel.setMIMEType(Files.probeContentType(pathData));
            fileViewModel.setSize(Long.valueOf(tempArray[1]));

//            tempArray[3] = path + tempArray[0];
//            tempArray[4] = FileUtility.base64encode(path + tempArray[0]);
            hashMapList.get("file").set(i, tempArray);
//            fileModelList.add(new FileListModel(tempArray[0], Long.valueOf(tempArray[1]), tempArray[2], tempArray[3], tempArray[4]));
            fileModelList.add(fileViewModel);
        }
        resultHashMap.put("file", fileModelList);
        fileModelList = new ArrayList<>();
        for (int i = 0; i < hashMapList.get("folder").size(); i++) {
            tempArray = hashMapList.get("folder").get(i);
            pathData = Paths.get(fullPath + path + tempArray[0]);
            fileViewModel = new FileViewModel();
            fileViewModel.setLastModifiedDate(new CustomDate(simpleDateFormat.parse(tempArray[2])));
            fileViewModel.setFullPath(path + tempArray[0]);
            fileViewModel.setHashedPath(EncodingTools.base64Encode(path + tempArray[0]));
            fileViewModel.setFullName(tempArray[0]);
//            fileModel.setName(FileUtility.getFileNameWithoutExtension(fileModel.getFullName()));
//            fileModel.setExtension(FileUtility.getFileExtension(fileModel.getFullName()));
//            fileModel.setMIMEType(Files.probeContentType(pathData));
            fileViewModel.setSize(Long.valueOf(tempArray[1]));

//            tempArray[3] = path + tempArray[0];
//            tempArray[4] = FileUtility.base64encode(tempArray[3]);
            hashMapList.get("folder").set(i, tempArray);
//            fileModelList.add(new FileListModel(tempArray[0], Long.valueOf(tempArray[1]), tempArray[2], tempArray[3], tempArray[4]));
            fileModelList.add(fileViewModel);
        }
        resultHashMap.put("folder", fileModelList);
        return resultHashMap;
    }


    public void rename(String pathFrom, String pathTo) throws Exception {
        FsoMimeTypeModel fsoMimeTypeModel = FsoTools.getMimeTypeModel(pathFso + pathFrom);
        if (fsoMimeTypeModel.getType().equals(FsoMimeTypeEnum.IMAGE)) {
            FsoTools.move(pathFso + pathFrom, pathFso + pathTo, true, true);
        } else {
            FsoTools.move(pathFso + pathFrom, pathFso + pathTo, false, true);
        }
    }


    public void delete(List<String> paths) throws Exception {
        FsoMimeTypeModel fsoMimeTypeModel;
        for (String pathFile : paths) {
            FsoPathCheckModel fsoPathCheckModel = this.checkPathExists(pathFso + pathFile);
            if (fsoPathCheckModel.getTypeEnum().equals(FsoPathCheckTypeEnum.FILE)) {
                fsoMimeTypeModel = FsoTools.getMimeTypeModel(pathFso + pathFile);
                if (fsoMimeTypeModel.getType().equals(FsoMimeTypeEnum.IMAGE)) {
                    FsoTools.delete(pathFso + pathFile, true);
                } else {
                    FsoTools.delete(pathFso + pathFile, false);
                }
            } else {
                FsoTools.delete(pathFso + pathFile, false);
            }
        }
    }


    public void deleteUploadedFile(String fileKey) throws Exception {
        String[] fileType = new String[]{};
        String path = pathUploadedFileDirectory + "/" + fileKey;
        FsoTools.delete(path, false);
    }

    public void createDirectory(String path) throws Exception {
        FsoTools.createDirectoryIfNotExist(pathFso + path);
    }


    public void copy(List<String[]> filesNameAndAction, String pathFrom, String pathTo) throws Exception {
        String[] fileType = new String[]{};
        pathTo = pathFso + pathTo;
        pathFrom = pathFso + pathFrom;
        for (String[] fileNameAndAction : filesNameAndAction) {
            ConfigurableMimeFileTypeMap mimetypesFileTypeMap = new ConfigurableMimeFileTypeMap();
            String mimeType = mimetypesFileTypeMap.getContentType(fileNameAndAction[0]);
            if (!"".equals(mimeType)) {
                fileType = mimeType.split("/");
            }
            fso.copy(fileNameAndAction, pathFrom, pathTo, fileType);
        }
    }


    public void copyFile(String fromFilePath, String fromFileName, String toFilePath, String toFileName, Boolean withOverride) throws Exception {
        String fromFilePathWithName = pathFso + fromFilePath + fromFileName;
        String toFilePathWithName = pathFso + toFilePath + toFileName;
        File fromFile = new File(fromFilePathWithName);
        File toFile = new File(toFilePathWithName);
        if ((toFile.exists()) && (!withOverride)) {
            throw new BusinessException(this.getClass(), CommonBusinessExceptionKeyImpl.FILE_OVERRIDE_ERROR);
        }
        if (!fromFile.exists()) {
            throw new BusinessException(this.getClass(), CommonBusinessExceptionKeyImpl.noFileExists);
        }

        FileUtils.copyFile(fromFile, toFile);

    }


    public void move(List<String[]> filesNameAndAction, String pathFrom, String pathTo) throws Exception {
        pathTo = pathFso + pathTo;
        pathFrom = pathFso + pathFrom;
        String[] fileType = new String[]{};
        for (String[] fileNameAndAction : filesNameAndAction) {
            ConfigurableMimeFileTypeMap mimetypesFileTypeMap = new ConfigurableMimeFileTypeMap();
            String mimeType = mimetypesFileTypeMap.getContentType(fileNameAndAction[0]);
            if (!"".equals(mimeType)) {
                fileType = mimeType.split("/");
            }
            fso.move(fileNameAndAction, pathFrom, pathTo, fileType);
        }
    }


    public FileModel download(String mainPath, String hashedPath, String thumbSize) throws Exception {
        String fileFullPath = pathFso + mainPath + FileUtility.base64decode(hashedPath);
        Path path = Paths.get(fileFullPath);
        FileModel fileModel = new FileModel();
        if (thumbSize != null) {
            fileFullPath = fileFullPath + "-" + thumbSize + ".thumb";
        }
        PathType pathType = fso.checkPathExists(fileFullPath);
        if ((pathType == null) || (!"file".equals(pathType.getValue().toLowerCase()))) {
            throw new BusinessException(FSOService.class, CommonBusinessExceptionKeyImpl.noFileExists);
        }

        byte[] data = fso.download(fileFullPath);
        fileModel.setBytes(data);
        fileModel.setSize(data.length);
        fileModel.setMIMEType(Files.probeContentType(path));
        fileModel.setFullName(path.getFileName().toString());

        return fileModel;
    }


    public FileModel downloadSingle(String mainPath, String singleDirectoryPath, String thumbSize) throws Exception {
        String fileFullPath = pathFso + mainPath + singleDirectoryPath;
        HashMap<String, List<String[]>> hashMapList = fso.list(fileFullPath, null, null, new String[]{"Thumbs.db"}, new String[]{"thumb"}, false);
        if (hashMapList.get("file").size() > 0) {
            fileFullPath = fileFullPath + hashMapList.get("file").get(0)[0];
            if (thumbSize != null) {
                fileFullPath = fileFullPath + "-" + thumbSize + ".thumb";
            }
        }
        PathType pathType = fso.checkPathExists(fileFullPath);
        if ((pathType == null) || (!"file".equals(pathType.getValue().toLowerCase()))) {
            throw new BusinessException(FSOService.class, CommonBusinessExceptionKeyImpl.noFileExists);
        }

        Path path = Paths.get(fileFullPath);
        FileModel fileModel = new FileModel();

        byte[] data = fso.download(fileFullPath);
        fileModel.setBytes(data);
        fileModel.setSize(data.length);
        fileModel.setMIMEType(Files.probeContentType(path));
        fileModel.setFullName(path.getFileName().toString());

        return fileModel;
    }

    // mimetypesFileTypeMap.getContentType : image/png , video/mp4 ,...
    public String upload(LogUploadedFileModel logUploadedFileModel) throws Exception {
        logUploadedFileModel.setFileName(logUploadedFileModel.getFileName());

        logUploadedFileModel.setFileFullName(logUploadedFileModel.getFileFullName());

        ConfigurableMimeFileTypeMap mimetypesFileTypeMap = new ConfigurableMimeFileTypeMap();
        String mimeType = mimetypesFileTypeMap.getContentType(pathFso + logUploadedFileModel.getDirectoryRealPath() + logUploadedFileModel.getFileFullName());
        String[] fileType = mimeType.split("/");
        // mimetypesFileTypeMap.getContentType --> image/png , video/mp4 ,...
        switch (fileType[1]) {
            case "x-png":
                fileType[1] = "png";
                break;
            case "x-ms-bmp":
                fileType[1] = "bmp";
                break;
            case "x-xwindowdump":
                fileType[1] = "xwd";
                break;
            case "x-xbitmap":
                fileType[1] = "xbm";
                break;
            case "x-xpixmap":
                fileType[1] = "xpm";
                break;
            case "g3fax":
                fileType[1] = "g3f";
                break;
            case "x-pict":
                fileType[1] = "pict";
                break;
            case "x-portable-pixmap":
                fileType[1] = "ppm";
                break;
            case "x-portable-graymap":
                fileType[1] = "pgm";
                break;
            case "x-portable-bitmap":
                fileType[1] = "pbm";
                break;
            case "x-portable-anymap":
                fileType[1] = "pnm";
                break;
            case "x-cmu-raster":
                fileType[1] = "ras";
                break;
            case "x-photo-c":
                fileType[1] = "pcd";
                break;
            case "x-cals":
                fileType[1] = "mil cal";
                break;
            case "x-mgx-dsf":
                fileType[1] = "dsf";
                break;
            case "x-cmx":
                fileType[1] = "cmx";
                break;
            case "wavelet":
                fileType[1] = "wi";
                break;
            case "vnd.dwg":
                fileType[1] = "dwg";
                break;
            case "vnd.dxf":
                fileType[1] = "dxf";
                break;
            case "vnd.svf":
                fileType[1] = "svf";
                break;
        }
        //String newFileName = this.checkFileByName(logUploadedFileModel.getDirectoryRealPath(), logUploadedFileModel.getFileName(), logUploadedFileModel.getFileExtension(), 0);

        //String fullName = logUploadedFileModel.getFileFullName().replace(logUploadedFileModel.getFileName(), newFileName);
        //logUploadedFileModel.setFileFullName(fullName);
        return fso.upload(pathFso + logUploadedFileModel.getDirectoryRealPath(), logUploadedFileModel.getFileFullName(), logUploadedFileModel.getFileByteArray(), fileType);
    }


    public String getBasePath() {
        return pathFso;
    }


    public void unzipFromByteArray(byte[] sourceByteArray, String destinationFolderPathForUnzip, String password) throws Exception {
        fso.unzipFromByteArray(sourceByteArray, pathFso + destinationFolderPathForUnzip, password);
    }


    public void unzip(String sourceZipFilePath, String destinationFolderPathForUnzip, String password) throws Exception {
        fso.unzip(pathFso + sourceZipFilePath, pathFso + destinationFolderPathForUnzip, password);
    }


    public FsoPathCheckModel checkPathExists(String path) throws Exception {
        return FsoTools.pathExistCheck(pathFso + path);
    }


    public byte[] readFile(String realPath) throws Exception {
        File file = new File(pathFso + realPath);
        return readFromFile(file);
    }


    public byte[] readFromFile(File file) throws Exception {
        FileInputStream fileInputStream = null;
        byte[] bytes = new byte[(int) file.length()];
        try {
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bytes);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bytes;
    }

    public HashMap<String, List<String>> findFile(Integer id, String directoryPath, String folderName, Boolean singleFile) throws Exception {
        HashMap<String, List<String>> fileHashMap = new HashMap<>();
        String mainPath = directoryPath + id + folderName;
        String path = "/" + id + folderName;
        PathType checkPathExists = this.checkPathExists(mainPath);
        if ((checkPathExists != null) && ("directory".equals(checkPathExists.getValue().toLowerCase()))) {
            HashMap<String, List<FileViewModel>> hashMapList = this.list(mainPath, path);
            if ((hashMapList != null) && (!hashMapList.isEmpty())) {
                if ((hashMapList.get("file") != null) && (!hashMapList.get("file").isEmpty())) {
                    List<String> fileHashPath = new ArrayList<>();
                    if (singleFile) {
                        fileHashPath.add(hashMapList.get("file").get(0).getHashedPath());
                    } else {
                        for (FileViewModel fileViewModel : hashMapList.get("file")) {
                            fileHashPath.add(fileViewModel.getHashedPath());
                        }
                    }
                    fileHashMap.put(folderName, fileHashPath);
                }
            }

        }
        return fileHashMap;
    }

    ////////////////////////////////////////////////////////////////
    public byte[] imageResize(byte[] originalImageBytes, String originalExt,
                              Integer destWidth, Integer destHeight,
                              Boolean withScale) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(originalImageBytes);
        BufferedImage originalImage = ImageIO.read(inputStream);
        if (withScale) {
            Double scaleValue = new Double(1);
            Double tempDouble = new Double(1);
            if (originalImage.getHeight() > originalImage.getWidth()) {
                scaleValue = (Double.valueOf(destHeight) / Double.valueOf(originalImage.getHeight()));
            } else {
                scaleValue = (Double.valueOf(destWidth) / Double.valueOf(originalImage.getWidth()));
            }
            tempDouble = originalImage.getHeight() * scaleValue;
            destHeight = tempDouble.intValue();
            tempDouble = originalImage.getWidth() * scaleValue;
            destWidth = tempDouble.intValue();
        }
        BufferedImage resizedImage = new BufferedImage(destWidth, destHeight, originalImage.getType());
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, destWidth, destHeight, null);
        g.dispose();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        ImageIO.write(resizedImage, originalExt, baos);
        baos.flush();
        byte[] imageInByte = baos.toByteArray();
        baos.close();

        return imageInByte;

    }

    public void copyFileOfPathFromInPathTo(String idFrom, LogUploadedFsoEnum basePathEnumFrom
            , String idTo, LogUploadedFsoEnum basePathEnumTo) throws Exception {
        //کپی کردن عکس های ذاتی درخواست برای ذاتی محصول
        String basePathFrom, basePathTo;
        PathType checkPathExists;

        //example: "/eshop/product/"
        basePathFrom = basePathEnumFrom.getEntityDirectoryPath();
        //example: "/eshop/productRequest/"
        basePathTo = basePathEnumTo.getEntityDirectoryPath();

        checkPathExists = this.checkPathExists(basePathFrom + idFrom);
        if ((checkPathExists != null)) {
            List<String[]> fileNameAndActionList = new ArrayList<>();
            String[] fileNameAndAction = new String[]{"", idFrom};
            fileNameAndActionList.add(fileNameAndAction);
            this.copy(fileNameAndActionList, basePathFrom + idFrom, basePathTo + idTo);
        }
    }
}


/*private String checkFileByName(String directoryPath, String name, String extension, Integer index) throws Exception {
        if (this.checkPathExists(directoryPath) != null) {

            if (!directoryPath.endsWith("/")) {//اگر آخرش اسلش نداشت اضافه کند
                directoryPath = directoryPath + "/";
            }

            String[] parts = directoryPath.split("/");

            //sample --- > coverSmall/1/
            String folderName = parts[parts.length - 2] + "/" + parts[parts.length - 1] + "/";
            HashMap<String, List<FileListModel>> hashMapList = this.list(directoryPath, folderName);
            if ((hashMapList != null) && (!hashMapList.isEmpty())) {
                if ((hashMapList.get("file") != null) && (!hashMapList.get("file").isEmpty()) && (hashMapList.get("file").size() > 0)) {
                    //----- چک کردن نام فایل های همنوع موجود در پوشه مربوطه با نام فایل آپلود شده جدید
                    Boolean nameExist = false;
                    for (FileListModel fileListModel : hashMapList.get("file")) {
                        //----- اگر فایل هم نام رو پیدا کرد از حلقه خارج شود
                        if (nameExist) {
                            break;
                        }
                        if ((fileListModel.getName()).equals(name + "." + extension)) {
                            index++;
                            name = name + " -Copy" + "(" + index + ")";
                            this.checkFileByName(directoryPath, name, extension, index);
                            nameExist = true;
                        }
                    }
                }
            }

        }
        return name;
    }*/
