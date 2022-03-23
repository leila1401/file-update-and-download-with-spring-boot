package com.saraya.DailyCodeBuffer.fileUploadAndDownload_with_Daily_Code_Buufer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.saraya.DailyCodeBuffer.fileUploadAndDownload_with_Daily_Code_Buufer.entity.Attachment;
import com.saraya.DailyCodeBuffer.fileUploadAndDownload_with_Daily_Code_Buufer.repository.AttachmentRepository;

@Service
public class AttachmentServiceImpl implements AttachmentService {
	
	@Autowired
	private AttachmentRepository repo;

	@Override
	public Attachment saveAttachment(MultipartFile file) throws Exception {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		try {
			if(fileName.contains("..")) {
				throw new Exception("FileName contains invalid path sequence " + fileName);
			}
			Attachment att = new Attachment(fileName,
					file.getContentType(),
					file.getBytes());
			return repo.save(att);
			
		} catch (Exception e){
			throw new Exception("Could not save file: " + fileName);
		}
	}
	
	
	
	

	@Override
	public Attachment getAttachment(String fileId) throws Exception {
		return repo.findById(fileId).orElseThrow(() -> new Exception("File not found with Id " + fileId));
	}

}
