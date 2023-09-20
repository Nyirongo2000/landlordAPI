package com.landlord.landlordapi.service;

import com.landlord.landlordapi.entity.Attachment;
import com.landlord.landlordapi.repository.AttachmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AttachmentServiceImplimentation implements AttachmentService{
    private AttachmentRepo attachmentRepo;
    @Autowired
    public AttachmentServiceImplimentation(AttachmentRepo attachmentRepo) {
        this.attachmentRepo = attachmentRepo;
    }

    @Override
    public Attachment saveAtachment(MultipartFile file) throws Exception {
        String filename= StringUtils.cleanPath(file.getOriginalFilename());
        try{
            if (filename.contains("..")){
                throw new Exception("Filename contains invalid path sequence" + filename);
            }
            Attachment attachment
                    =new Attachment(filename,
                    file.getContentType(),
                    file.getBytes());
            return attachmentRepo.save(attachment);
        } catch (Exception e) {
            throw new Exception("could not save file " +filename);
        }
    }

    @Override
    public Attachment getAttachment(String fileId) throws Exception {
        return attachmentRepo
                .findById(fileId)
                .orElseThrow(
                        () -> new Exception("file not found with Id: "+fileId)
                );
    }
}
