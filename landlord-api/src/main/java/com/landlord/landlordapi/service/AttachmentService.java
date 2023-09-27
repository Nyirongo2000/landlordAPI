package com.landlord.landlordapi.service;

import com.landlord.landlordapi.entity.Attachment;
import org.springframework.web.multipart.MultipartFile;

public interface AttachmentService {
    Attachment saveAtachment(MultipartFile file) throws Exception;

    Attachment getAttachment(String fileId) throws Exception;
}
