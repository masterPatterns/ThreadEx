package com.learn.threadex.fileUpload;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "fileUpload")
@Entity
public class FileUploadVo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int seq;
	
	@Column(name = "itemName")
	private String itemName;
	
	@Column(name = "fileName")
	private String fileName;
	
	@Column(name = "size")
	private int size;
}
