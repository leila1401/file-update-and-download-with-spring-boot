package com.saraya.DailyCodeBuffer.fileUploadAndDownload_with_Daily_Code_Buufer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saraya.DailyCodeBuffer.fileUploadAndDownload_with_Daily_Code_Buufer.entity.Attachment;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment , String> {

}
