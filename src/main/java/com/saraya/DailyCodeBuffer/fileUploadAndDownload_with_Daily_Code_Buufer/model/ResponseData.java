package com.saraya.DailyCodeBuffer.fileUploadAndDownload_with_Daily_Code_Buufer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData {
	
	private String fileName;
	private String downloadURL;
	private String fileType;
	private long fileSize;
	
	public ResponseData(String fileName, String downloadURL, String fileType, long fileSize) {
		super();
		this.fileName = fileName;
		this.downloadURL = downloadURL;
		this.fileType = fileType;
		this.fileSize = fileSize;
	}
	
	
	
	
	

}
