package com.example.uploadftp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UploadFtpApplication {

    @Autowired
    UpDownUtil upDownUtil;

    @GetMapping("/upload")
    public String upload() {
        return upDownUtil.upload();
    }

    @GetMapping("/download")
    public String download(){
        return upDownUtil.download();
    }

    @GetMapping("/delete")
    public String delete(){
        return upDownUtil.delete();
    }

    public static void main(String[] args) {
        SpringApplication.run(UploadFtpApplication.class, args);
    }

}
