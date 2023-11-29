package com.example.blog.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class fileinfo {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String origNm;
	private String savedNm;
	private String savedPath;
	
	// 빌더 패턴
	public fileinfo() {
		
	}
	
	//
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getOrigNm() {
		return origNm;
	}
	public fileinfo setOrigNm(String origNm) {
		this.origNm = origNm;
		return this;
	}
	
	public String getSavedNm() {
		return savedNm;
	}
	public fileinfo setSavedNm(String savedNm) {
		this.savedNm = savedNm;
		return this;
	}
	
	public String getSavedPath() {
		return savedPath;
	}
	public fileinfo setSavedPath(String savedPath) {
		this.savedPath = savedPath;
		return this;
	}
	
}
