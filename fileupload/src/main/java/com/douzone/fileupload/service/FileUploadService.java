package com.douzone.fileupload.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {
	private static final String SAVE_PATH = "/mysite-uploads"; // 리눅스 환경에서 돌기때문에 리눅스 방식으로 지정
	private static final String URL = "/images";
	
	public String restore(MultipartFile multipartFile) {
		String url = "";
		
		try {
			if(multipartFile.isEmpty()) {
				return url;
			}
			
			String originFilename = multipartFile.getOriginalFilename();
			
			String extName = originFilename.substring(originFilename.lastIndexOf(".") + 1);
			
			String saveFilenmae = generateSaveFilename(extName);
			long fileSize = multipartFile.getSize();
			
			System.out.println("##### file " + originFilename);
			System.out.println("##### file " + saveFilenmae);
			System.out.println("##### size " + fileSize);
			
			byte[] fileData = multipartFile.getBytes();
			OutputStream os = new FileOutputStream(SAVE_PATH + "/" + saveFilenmae);
			os.write(fileData);
			os.close();
			
			url = URL + "/" + saveFilenmae; 
			
			
		} catch(IOException ex) {
			throw new RuntimeException("file upload error:" + ex);
		}
		
		return url;
		
	}

	private String generateSaveFilename(String extName) {
		String filename = "";
		Calendar calendar = Calendar.getInstance();
		filename += calendar.get(Calendar.YEAR);
		filename += calendar.get(Calendar.MONTH);
		filename += calendar.get(Calendar.DATE);
		filename += calendar.get(Calendar.HOUR);
		filename += calendar.get(Calendar.MINUTE);
		filename += calendar.get(Calendar.SECOND);
		filename += calendar.get(Calendar.MILLISECOND);
		filename += ("." + extName); // 기존 확장자
		
		return filename;
	}
	
}
