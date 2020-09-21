package com.lmy.springboot.modules.fileopera.service;

import com.lmy.springboot.modules.fileopera.domain.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.fileopera.service
 * @ClassName: FileOperaService
 * @Description:
 * @Author: linmy
 * @Date: 2020-9-18 15:59:58
 * @Version: 1.0
 */
@Slf4j
@Service
public class FileOperaService {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    public JsonResult uploadFile(MultipartFile multipartFile, String inventoryTaskNum) throws IOException, IOException, ApplicationException, SystemException {
        JsonResult jsonResult = new JsonResult();
        // String path = DatabaseUtil.getDefaultUploadPath() + "//dfccInventory//";
        String path = "//home//weblogic//upload//dfccInventory//";
        String uploadFileName = multipartFile.getOriginalFilename();
        String postfix = uploadFileName.substring(uploadFileName.indexOf("."));
        if (".xls".equals(postfix) || ".xlsx".equals(postfix) || ".doc".equals(postfix) || ".docx".equals(postfix)) {
            String fileName = "dfccInventoryData_" + LocalDateTime.now().format(dtf) + postfix;
            File destFile = new File(path, fileName);
            if (!destFile.exists() && !destFile.isDirectory()) {
                destFile.mkdirs();
            }
            multipartFile.transferTo(destFile);
            // this.updateAssetInventoryById(inventoryTaskNum, fileName);
            jsonResult.setCode(0);
            jsonResult.setMessage("文件上传成功");
        } else {
            jsonResult.setCode(1);
            jsonResult.setMessage("文件格式不正确，请上传word、excel格式的文件！");
            log.info("文件格式不正确，请上传word、excel格式的文件！");
        }
        return jsonResult;
    }
}

