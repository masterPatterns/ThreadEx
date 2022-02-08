package com.learn.threadex.fileUpload;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FileUploadController {
	@Autowired private FileUploadService fileUploadService;
	
	@GetMapping(value = "/")
	public ModelAndView home(Model model) throws Exception {
//		model.addAttribute("name", "jeffrey");
		
		return new ModelAndView("index");
	}
	
	@PostMapping(value = "/fileUpload")
	@ResponseBody
	public Map<String, Object> fileUpload(@RequestParam("itemName") String itemName, @RequestParam(value="file",required=false) List<MultipartFile> files) {
		return fileUploadService.fileUpload(itemName, files);
	}
}
