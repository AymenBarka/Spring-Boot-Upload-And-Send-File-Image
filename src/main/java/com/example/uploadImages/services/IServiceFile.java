package com.example.uploadImages.services;

import org.springframework.web.multipart.MultipartFile;

public interface IServiceFile {
	public void uploadFile(MultipartFile file);
    public String getFileName(int id);
	
}
