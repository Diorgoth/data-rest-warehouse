package com.example.demo.controller;

import com.example.demo.Dtos.Result;
import com.example.demo.entity.Attachment;

import com.example.demo.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;


    @PostMapping
    public  Result upload(MultipartHttpServletRequest request){

        Result result = attachmentService.uploadFile(request);
        return result;


    }

    @PutMapping("/{id}")
    public  Result editphoto(@PathVariable Integer id, MultipartHttpServletRequest request){

       Result result = attachmentService.editFile(id, request);
        return result;


    }

    @GetMapping
    public List<Attachment> getFiles(){

        return attachmentService.getFiles();

    }

    @GetMapping("/{id}")
    public Attachment getAttachment(@PathVariable Integer id){

        return attachmentService.getFile(id);

    }

    @DeleteMapping("/{id}")
    public Result deleteAttachment(@PathVariable Integer id){

          Result result = attachmentService.deleteFile(id);

        return result;

    }

}
