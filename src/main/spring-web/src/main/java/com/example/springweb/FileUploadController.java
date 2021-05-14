package com.example.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 上传文件controller
 * @author Theon
 */
@RestController
public class FileUploadController {

    @PostMapping("/file")
    public void upload(@RequestParam("file") MultipartFile file) {

    }
}
