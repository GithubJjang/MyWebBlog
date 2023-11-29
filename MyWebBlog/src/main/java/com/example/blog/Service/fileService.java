package com.example.blog.Service;


import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.tomcat.jni.FileInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.blog.Model.fileinfo;
import com.example.blog.Repository.fileRepository;

@Service
public class fileService {
	@Autowired
	private fileRepository fileRepository;
	
	public void saveFile(MultipartFile files) throws IOException{
		
		// 원래 이름
		String origNm = files.getOriginalFilename();
		
		// 식별하기 위한 이름
		String uuid = UUID.randomUUID().toString();
		String extension = origNm.substring(origNm.lastIndexOf("."));
		String savedNm = uuid + extension;
		
		// 파일 저장 경로
		String savedPath = "C:/upload/" + savedNm;
		
		// 1. file DB에 저장하기
		fileinfo info = new fileinfo()
				.setOrigNm(origNm)
				.setSavedNm(savedNm)
				.setSavedPath(savedPath)
				;
		fileRepository.save(info);
		
		// 2. 서버 디렉토리에 저장
		files.transferTo(new File(savedPath));
		System.out.println("파일 업로드 성공");
	}
}
