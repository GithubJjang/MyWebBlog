package com.example.blog.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blog.Model.board;
import com.example.blog.Repository.boardRepository;

@Service
public class boardService {

	@Autowired
	private boardRepository boardRepository;
	
	public void saveBoard(board board) {
		boardRepository.save(board);
		
	}
}
