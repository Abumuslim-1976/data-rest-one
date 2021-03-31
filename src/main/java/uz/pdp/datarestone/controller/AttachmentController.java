package uz.pdp.datarestone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.datarestone.payload.ApiResponse;
import uz.pdp.datarestone.service.AttachmentService;

import javax.servlet.http.HttpServletResponse;

@RestController
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;

    @PostMapping("/upload")
    public HttpEntity<?> uploadFile(MultipartHttpServletRequest request) {
        ApiResponse upload = attachmentService.upload(request);
        return ResponseEntity.status(upload.isSuccess() ? HttpStatus.CREATED : HttpStatus.CONFLICT).body(upload);
    }

    @GetMapping("/download/{id}")
    public HttpEntity<?> getFile(@PathVariable Integer id, HttpServletResponse response) {
        ApiResponse download = attachmentService.download(id, response);
        return ResponseEntity.status(download.isSuccess() ? HttpStatus.ACCEPTED : HttpStatus.CONFLICT).body(download);
    }

}
