package com.motaharinia.msutility.fso;


import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.customexception.UtilityExceptionKeyEnum;
import com.motaharinia.msutility.customfield.CustomDate;
import com.motaharinia.msutility.encoding.EncodingTools;
import com.motaharinia.msutility.fso.check.FsoPathCheckModel;
import com.motaharinia.msutility.fso.check.FsoPathCheckTypeEnum;
import com.motaharinia.msutility.fso.content.FsoPathContentModel;
import com.motaharinia.msutility.fso.download.FileDownloadModel;
import com.motaharinia.msutility.fso.mimetype.FsoMimeTypeEnum;
import com.motaharinia.msutility.fso.mimetype.FsoMimeTypeModel;
import com.motaharinia.msutility.fso.upload.FileUploadedModel;
import com.motaharinia.msutility.fso.view.FileViewModel;
import com.motaharinia.msutility.zip.ZipTools;
import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ObjectUtils;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-11<br>
 * Time: 02:33:39<br>
 * Description:<br>
 * سرویس فایل سیستم
 */
public class FsoService {

    /**
     * پسوند فایلهای بندانگشتی تصاویر
     */
    @Value("${fso.image.thumb.extension}")
     private String FSO_IMAGE_THUMB_EXTENSION = "thumb";
    /**
     * ابعاد فایلهای بندانگشتی کوچک تصاویر
     */
    @Value("${fso.image.thumb.size.small}")
    Integer FSO_THUMB_SIZE_SMALL = 60;
    /**
     * ابعاد فایلهای بندانگشتی بزرگ تصاویر
     */
    @Value("${fso.image.thumb.size.large}")
    Integer FSO_THUMB_SIZE_LARGE = 120;
    /**
     * حداکثر تعداد مجاز فایل در یک دایرکتوری
     */
    @Value("${fso.directory.file.limit}")
    Integer FSO_DIRECTORY_FILE_LIMIT = 100;
    /**
     * مسیر فایلهای ماژولهای پروزه
     */
    @Value("${fso.path.module}")
    private String FSO_PATH_MODULE ="/mbazardata/fso";
    /**
     * مسیر موقت جهت آپلود فایلهای پروزه
     */
    @Value("${fso.path.upload.directory}")
    private String FSO_PATH_UPLOAD_DIRECTORY =  "/mbazardata/uploadedfile";


    FsoConfigModel FSO_CONFIG_MODEL = new FsoConfigModel(new Integer[]{FSO_THUMB_SIZE_SMALL, FSO_THUMB_SIZE_LARGE}, FSO_IMAGE_THUMB_EXTENSION, FSO_DIRECTORY_FILE_LIMIT);

    @NotNull
    public List<FileViewModel> fileViewModelList(@NotNull String mainPath,@NotNull String path) throws Exception {
        List<FileViewModel> fileViewModelList = new ArrayList<>();
        FileViewModel fileViewModel = null;
        String fullPath = FSO_PATH_MODULE + mainPath;
        FsoPathContentModel fsoPathContentModel = FsoTools.pathContent(fullPath, new String[]{}, new String[]{}, new String[]{"Thumbs.db"}, new String[]{"thumb"}, false);
        for (int i = 0; i < fsoPathContentModel.getFileModelList().size(); i++) {
            fileViewModel = new FileViewModel();
            fileViewModel.setLastModifiedDate(new CustomDate(   fsoPathContentModel.getFileModelList().get(i).getLastModifiedDate() ));
            fileViewModel.setFullPath( path + fsoPathContentModel.getFileModelList().get(i).getFullName() );
            fileViewModel.setHashedPath( EncodingTools.base64Encode(fileViewModel.getFullPath()));
            fileViewModel.setFullName( fsoPathContentModel.getFileModelList().get(i).getFullName() );
            fileViewModel.setName( fsoPathContentModel.getFileModelList().get(i).getName() );
            fileViewModel.setExtension( fsoPathContentModel.getFileModelList().get(i).getExtension() );
            fileViewModel.setMimeType( fsoPathContentModel.getFileModelList().get(i).getMimeType() );
            fileViewModel.setSize( fsoPathContentModel.getFileModelList().get(i).getSize() );
            fileViewModelList.add(fileViewModel);
        }
        return fileViewModelList;
    }


    public void rename(String pathFrom, String pathTo) throws Exception {
        FsoMimeTypeModel fsoMimeTypeModel = FsoTools.getMimeTypeModel(FSO_PATH_MODULE + pathFrom);
        if (fsoMimeTypeModel.getType().equals(FsoMimeTypeEnum.IMAGE)) {
            FsoTools.move(FSO_PATH_MODULE + pathFrom, FSO_PATH_MODULE + pathTo, true,FSO_CONFIG_MODEL, true);
        } else {
            FsoTools.move(FSO_PATH_MODULE + pathFrom, FSO_PATH_MODULE + pathTo, false,FSO_CONFIG_MODEL, true);
        }
    }


    public void delete(List<String> paths) throws Exception {
        FsoMimeTypeModel fsoMimeTypeModel;
        for (String pathFile : paths) {
            FsoPathCheckModel fsoPathCheckModel = checkPathExists(FSO_PATH_MODULE + pathFile);
            if (fsoPathCheckModel.getTypeEnum().equals(FsoPathCheckTypeEnum.FILE)) {
                fsoMimeTypeModel = FsoTools.getMimeTypeModel(FSO_PATH_MODULE + pathFile);
                if (fsoMimeTypeModel.getType().equals(FsoMimeTypeEnum.IMAGE)) {
                    FsoTools.delete(FSO_PATH_MODULE + pathFile, true,FSO_CONFIG_MODEL);
                } else {
                    FsoTools.delete(FSO_PATH_MODULE + pathFile, false,FSO_CONFIG_MODEL);
                }
            } else {
                FsoTools.delete(FSO_PATH_MODULE + pathFile, false,FSO_CONFIG_MODEL);
            }
        }
    }


    public void deleteUploadedFile(String fileKey) throws Exception {
        String[] fileType = new String[]{};
        String path = FSO_PATH_UPLOAD_DIRECTORY + "/" + fileKey;
        FsoTools.delete(path, false,FSO_CONFIG_MODEL);
    }

    public void createDirectory(String path) throws Exception {
        FsoTools.createDirectoryIfNotExist(FSO_PATH_MODULE + path);
    }


    public void copy(@NotNull String pathFrom, @NotNull String pathTo, @NotNull Boolean withThumbnail, @NotNull Boolean withDirectoryCreation, @NotNull Boolean withRenameOnExist) throws Exception {
        String[] fileType = new String[]{};
        pathTo = FSO_PATH_MODULE + pathTo;
        pathFrom = FSO_PATH_MODULE + pathFrom;
        FsoTools.copy(pathFrom, pathTo, withThumbnail,FSO_CONFIG_MODEL, withDirectoryCreation, withRenameOnExist);
    }


    public void copyFile(@NotNull String pathFrom, @NotNull String fileNameFrom, @NotNull String pathTo, @NotNull String fileNameTo, @NotNull Boolean withOverride) throws Exception {
        pathFrom = FSO_PATH_MODULE + pathFrom + fileNameFrom;
        pathTo = FSO_PATH_MODULE + pathTo + fileNameTo;
        File fileFrom = new File(pathFrom);
        File fileTo = new File(pathTo);
        if ((fileTo.exists()) && (!withOverride)) {
            throw new UtilityException(FsoTools.class, UtilityExceptionKeyEnum.FSO_FILE_OVERRIDE_ERROR, "pathTo:" + pathTo);
        }
        if (!fileFrom.exists()) {
            throw new UtilityException(FsoTools.class, UtilityExceptionKeyEnum.FSO_PATH_IS_NOT_EXISTED, "pathFrom:" + pathFrom);
        }
        FileUtils.copyFile(fileFrom, fileTo);
    }


    public void move(@NotNull String pathFrom, @NotNull String pathTo, @NotNull Boolean withThumbnail, @NotNull Boolean withDirectoryCreation) throws Exception {
        pathTo = FSO_PATH_MODULE + pathTo;
        pathFrom = FSO_PATH_MODULE + pathFrom;
        FsoTools.move(pathFrom, pathTo, withThumbnail,FSO_CONFIG_MODEL, withDirectoryCreation);
    }


    public FileDownloadModel download(String mainPath, String hashedPath, String thumbSize) throws Exception {
        String fileFullPath = FSO_PATH_MODULE + mainPath + EncodingTools.base64decode(hashedPath);

        //اگر درخواست تصویر بندانگشتی شده بود آن را به جای فایل اصلی در مسیر قرار میدهیم
        if (!ObjectUtils.isEmpty(thumbSize)) {
            fileFullPath = fileFullPath + "-" + thumbSize + "." + FSO_IMAGE_THUMB_EXTENSION;
        }
        FsoPathCheckModel fsoPathCheckModel = FsoTools.pathExistCheck(fileFullPath);
        if (!fsoPathCheckModel.getTypeEnum().equals(FsoPathCheckTypeEnum.FILE)) {
            throw new UtilityException(FsoTools.class, UtilityExceptionKeyEnum.FSO_PATH_IS_NOT_FILE, "fileFullPath:" + fileFullPath);
        }

        //تکمیل اطلاعات مدل دانلود
        FileDownloadModel fileDownloadModel = new FileDownloadModel();
        Path path = Paths.get(fileFullPath);
        byte[] dataByteArray = FsoTools.downloadPathAndRead(fileFullPath);
        fileDownloadModel.setDataByteArray(dataByteArray);
        fileDownloadModel.setSize(dataByteArray.length);
        fileDownloadModel.setMimeType(Files.probeContentType(path));
        fileDownloadModel.setFullName(path.getFileName().toString());
        fileDownloadModel.setName(FsoTools.getFileNameWithoutExtension(fileDownloadModel.getFullName()));
        fileDownloadModel.setExtension(FsoTools.getFileExtension(fileDownloadModel.getFullName()));
        return fileDownloadModel;
    }


    public FileDownloadModel downloadSingle(String mainPath, String singleDirectoryPath, String thumbSize) throws Exception {
        String fileFullPath = FSO_PATH_MODULE + mainPath + singleDirectoryPath;

        //به دست آوردن اولین فایل موجود در مسیر داده شده
        FsoPathContentModel fsoPathContentModel = FsoTools.pathContent(fileFullPath, new String[]{}, new String[]{}, new String[]{"Thumbs.db"}, new String[]{"thumb"}, false);
        if (!ObjectUtils.isEmpty(fsoPathContentModel.getFileModelList())) {
            fileFullPath = fileFullPath + fsoPathContentModel.getFileModelList().get(0).getFullName();
            //اگر درخواست تصویر بندانگشتی شده بود آن را به جای فایل اصلی در مسیر قرار میدهیم
            if (!ObjectUtils.isEmpty(thumbSize)) {
                fileFullPath = fileFullPath + "-" + thumbSize + "." + FSO_IMAGE_THUMB_EXTENSION;
            }
        }

        //بررسی وجود فایل
        FsoTools.pathExistCheck(fileFullPath);

        //تکمیل اطلاعات مدل دانلود
        FileDownloadModel fileDownloadModel = new FileDownloadModel();
        Path path = Paths.get(fileFullPath);
        byte[] dataByteArray = FsoTools.downloadPathAndRead(fileFullPath);
        fileDownloadModel.setDataByteArray(dataByteArray);
        fileDownloadModel.setSize(dataByteArray.length);
        fileDownloadModel.setMimeType(Files.probeContentType(path));
        fileDownloadModel.setFullName(path.getFileName().toString());
        fileDownloadModel.setName(FsoTools.getFileNameWithoutExtension(fileDownloadModel.getFullName()));
        fileDownloadModel.setExtension(FsoTools.getFileExtension(fileDownloadModel.getFullName()));
        return fileDownloadModel;
    }

    public String upload(FileUploadedModel fileUploadedModel) throws Exception {
        FsoMimeTypeModel fsoMimeTypeModel = FsoTools.getMimeTypeModel(FSO_PATH_MODULE + fileUploadedModel.getDirectoryRealPath() + fileUploadedModel.getFullName());
        if (fsoMimeTypeModel.getType().equals(FsoMimeTypeEnum.IMAGE)) {
            return FsoTools.uploadWriteToPath(FSO_PATH_MODULE + fileUploadedModel.getDirectoryRealPath(), fileUploadedModel.getFullName(), fileUploadedModel.getDataByteArray(), true,FSO_CONFIG_MODEL);
        } else {
            return FsoTools.uploadWriteToPath(FSO_PATH_MODULE + fileUploadedModel.getDirectoryRealPath(), fileUploadedModel.getFullName(), fileUploadedModel.getDataByteArray(), false,FSO_CONFIG_MODEL);
        }
    }

    public void unzipFromByteArray(byte[] sourceByteArray, String destinationFolderPathForUnzip, String password) throws Exception {
        ZipTools.unzipFromByteArray(sourceByteArray, FSO_PATH_MODULE + destinationFolderPathForUnzip, password);
    }


    public void unzip(String sourceZipFilePath, String destinationFolderPathForUnzip, String password) throws Exception {
        ZipTools.unzip(FSO_PATH_MODULE + sourceZipFilePath, FSO_PATH_MODULE + destinationFolderPathForUnzip, password);
    }


    public FsoPathCheckModel checkPathExists(String path) throws Exception {
        return FsoTools.pathExistCheck(FSO_PATH_MODULE + path);
    }


    public byte[] readFile(String realPath) throws Exception {
        File file = new File(FSO_PATH_MODULE + realPath);
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
        FsoPathCheckModel fsoPathCheckModel = checkPathExists(mainPath);
        if ( fsoPathCheckModel.getTypeEnum().equals(FsoPathCheckTypeEnum.DIRECTORY)) {
           List<FileViewModel> fileViewModelList = fileViewModelList(mainPath, path);

                if ( !ObjectUtils.isEmpty(fileViewModelList)) {
                    List<String> fileHashPathList = new ArrayList<>();
                    if (singleFile) {
                        fileHashPathList.add(fileViewModelList.get(0).getHashedPath());
                    } else {
                        for (FileViewModel fileViewModel : fileViewModelList) {
                            fileHashPathList.add(fileViewModel.getHashedPath());
                        }
                    }
                    fileHashMap.put(folderName, fileHashPathList);
                }
        }
        return fileHashMap;
    }
}