package com.example.blog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	@GetMapping("/board/write")
	public String boardWrite() {
		return "/board/write";
	}
}
