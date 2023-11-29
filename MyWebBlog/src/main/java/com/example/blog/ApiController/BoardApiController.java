package com.example.blog.ApiController;

import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.blog.Model.board;
import com.example.blog.Model.fileinfo;
import com.example.blog.Repository.boardRepository;
import com.example.blog.Service.boardService;
import com.example.blog.Service.fileService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
@Tag(name="BoardApiCon", description = "Api test")
@RestController
public class BoardApiController {
	
	@Autowired
	private boardService boardService;
	
	@Autowired
	private fileService fileService;
	

	@PostMapping("/api/board/writeProc")
	@Operation(summary = "Board의 title,content를 처리하는 내부 api")
	@Parameter(name = "title", description = "param Title")
	@Parameter(name = "content", description = "param Content")
	public String writeProc(@RequestParam("file") MultipartFile file,
			@RequestParam("title") String title,
			@RequestParam("content") String content) throws IOException {

		// 1. DB에 게시글 저장하기
		board b = new board();
		b.setTitle(title);
		b.setContent(content);
		boardService.saveBoard(b);
		
		// 2. pc의 디렉토리에 File 저장하기
		fileService.saveFile(file);
		return "OK";
	}
}
