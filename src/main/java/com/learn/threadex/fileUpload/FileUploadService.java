package com.learn.threadex.fileUpload;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {
	@Autowired private FileUploadRepository fileUploadRepository;
	
	public Map<String, Object> fileUpload(String itemName, List<MultipartFile> files) {
		Map<String, Object> resultMap = new HashMap<>();
		FileUploadVo fileUploadVo = new FileUploadVo();
		System.out.println("itemName : " + itemName);
		fileUploadVo.setItemName(itemName);
//		JSONParser jsonparser = new JSONParser();
//        JSONObject jsonObj = new JSONObject();
//        try {
//            jsonObj = (JSONObject) jsonparser.parse(itemName);
//        } catch (ParseException e3) {
//            e3.printStackTrace();
//        }
//        
//        Map<String, Object> paramMap = new HashMap<String,Object>();
//        for (Iterator ite1 = jsonObj.keySet().iterator(); ite1.hasNext();) {
//            String key = (String) ite1.next();
//            paramMap.put(key, jsonObj.get(key).toString());
//        }
//        System.out.println("jsonObj : " + jsonObj.toString());
        
        try
        {
	        for(int i=0; i<files.size(); i++) {
	            String originName = files.get(i).getOriginalFilename();
	            int fileSize = (int) files.get(i).getSize();
	            System.out.println("originName : " + originName + ", fileSize : " + fileSize);
	            
	            fileUploadVo.setFileName(originName);
	            fileUploadVo.setSize(fileSize);
	            fileUploadRepository.save(fileUploadVo);
	            
	            if(resultMap.get("errorMessage") == null) {
	            	// 파일 업로드 로직
	            	FileUploadThread fileUploadThread = new FileUploadThread(files.get(i), originName);
	            	fileUploadThread.start();
	            }
	        }
        } catch (Exception e)
        {
            e.printStackTrace();
            resultMap.put("errorMessage", "파일 업로드 실패, 관리자에게 문의하세요");
        }
		
		return resultMap;
	}
}
