package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;

@RestController
@RequestMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
public class UploadController {

    @PostMapping
    Boolean uploadFile(
            @RequestParam("file") MultipartFile file
    ) {
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\kalandew28\\Desktop\\upload\\fichier.pdf")) {
            fos.write(file.getBytes());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
}
