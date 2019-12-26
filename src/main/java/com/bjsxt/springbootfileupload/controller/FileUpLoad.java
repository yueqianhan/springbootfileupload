package com.bjsxt.springbootfileupload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author hanyueqian
 * @date 2019/12/21 0021-下午 21:04
 */
@RestController
public class FileUpLoad
{
    @PostMapping("/fileUpload")
    public String fileUpload(MultipartFile file) throws Exception
    {
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("e:/"+file.getOriginalFilename()));
        return "ok";
    }
}
