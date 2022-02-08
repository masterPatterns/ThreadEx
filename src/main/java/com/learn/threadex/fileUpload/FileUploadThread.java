package com.learn.threadex.fileUpload;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadThread extends Thread {
	
	private MultipartFile file = null;
	private String originName = "";

	public FileUploadThread(MultipartFile file, String originName) {
		this.file = file;
		this.originName = originName;
	}
	
	public void run() 
    {
        
        try 
        {
            executFunction();
            Thread.sleep(1000);    // 60초 딜레이
        } catch (InterruptedException e) {}
        
    }
    
    public void executFunction() 
    {
//    	String path = "C:/Program Files";
    	Path currentPath = Paths.get(""); 
    	String path = currentPath.toAbsolutePath().toString(); 
    	System.out.println("현재 작업 경로: " + path);

        try {
			byte[] data = file.getBytes(); 	//실제 파일 bytes로 받음
			System.out.println("data : " + data.length);
			File originImg = new File(path + "/" + originName);
			FileOutputStream fileOutputStream = new FileOutputStream(originImg); // 빈파일 불러다 outputStream 생성
            fileOutputStream.write(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    }
}
