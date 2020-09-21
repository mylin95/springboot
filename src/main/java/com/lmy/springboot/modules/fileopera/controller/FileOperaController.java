package com.lmy.springboot.modules.fileopera.controller;

import com.lmy.springboot.modules.fileopera.domain.JsonResult;
import com.lmy.springboot.modules.fileopera.service.FileOperaService;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * @ProjectName: springboot
 * @Package: com.lmy.springboot.modules.fileopera.controller
 * @ClassName: FileOperaController
 * @Description:
 * @Author: linmy
 * @Date: 2020/3/19
 * @Version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("/file")
public class FileOperaController {

    @Autowired
    FileOperaService fileOperaService;


    /**
     * 文件下载
     * @param filename
     * @param request
     * @param httpServletResponse
     */
    @GetMapping("/downLoad")
    public void downLoad(String filename, HttpServletRequest request, HttpServletResponse httpServletResponse) {
        try {
            // String filePath = DatabaseUtil.getDefaultUploadPath();
            // String fileName = assetInventoryService.getFileName(inventoryTaskNum);
            // String path = filePath + "//dfccInventory//" + fileName;
            String filePath = "C:/home/weblogic/upload";
            String fileName = filename;
            String path = filePath + "//file//" + fileName;
            if (path.indexOf("../") > 0 || path.indexOf("..\\") > 0) {
                return;
            }
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("文件不存在！");
            }
            // InputStream ins = new BufferedInputStream(new FileInputStream(path));
            httpServletResponse.setHeader("content-disposition",
                    "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
            //读取要下载的文件，保存到文件输入流
            FileInputStream in = new FileInputStream(path);
            //创建输出流
            OutputStream out = httpServletResponse.getOutputStream();
            //创建缓冲区
            byte buffer[] = new byte[1024];
            int len = 0;
            //循环将输入流中的内容读取到缓冲区当中
            while ((len = in.read(buffer)) > 0) {
                //输出缓冲区的内容到浏览器，实现文件下载
                out.write(buffer, 0, len);
            }
            //关闭文件输入流
            // in.close();
            //关闭输出流
            // out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 附件上传
     *
     * @param multipartFile
     * @param inventoryTaskNum
     * @throws IOException
     * @throws ApplicationException
     */
    @PostMapping("/fileUpLoad")
    public JsonResult uploadFile(@RequestParam("uploadFile") MultipartFile multipartFile, String inventoryTaskNum)
            throws IOException, ApplicationException {
        return fileOperaService.uploadFile(multipartFile, inventoryTaskNum);
    }

    @GetMapping("/getMsg")
    public void getMsg(String fileUrl, String fileName) throws IOException {
        DataInputStream in = null;
        DataOutputStream out = null;
        try {
            URL url = new URL(fileUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // InputStream inputStream = connection.getInputStream();
            // in = new DataInputStream(connection.getInputStream());
            // out = new DataOutputStream(new FileOutputStream(fileName));
            out = new DataOutputStream(new FileOutputStream(fileName));
            OutputStream outputStream = connection.getOutputStream();
            // outputStream

            byte[] buffer = new byte[4096];
            int count = 0;
            while ((count = in.read(buffer)) > 0) {
                out.write(buffer, 0, count);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("远程下载附件失败");
        } finally {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }
        }
    }

    @GetMapping("/downLoad/test")
    public InputStream downLoadTest(String filename) {
        try {
            // String filePath = DatabaseUtil.getDefaultUploadPath();
            // String fileName = assetInventoryService.getFileName(inventoryTaskNum);
            // String path = filePath + "//dfccInventory//" + fileName;
            String filePath = "C:/home/weblogic/upload";
            String fileName = filename;
            String path = filePath + "//file//" + fileName;
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("文件不存在！");
            }
            InputStream in = new BufferedInputStream(new FileInputStream(path));
            return in;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }



}
