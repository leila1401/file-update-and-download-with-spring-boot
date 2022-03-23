package com.saraya.DailyCodeBuffer.fileUploadAndDownload_with_Daily_Code_Buufer.service;

import org.springframework.web.multipart.MultipartFile;

import com.saraya.DailyCodeBuffer.fileUploadAndDownload_with_Daily_Code_Buufer.entity.Attachment;

public interface AttachmentService {

	Attachment saveAttachment(MultipartFile file) throws Exception;

	Attachment getAttachment(String fileId)  throws Exception;

}
