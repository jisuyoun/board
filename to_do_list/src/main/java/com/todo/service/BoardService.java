package com.todo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.dao.InterBoardDAO;

@Service
public class BoardService implements InterBoardService {

	@Autowired
	private InterBoardDAO dao;

	@Override
	public void registerMethod(Map<String, String> paraMap) {
		
		dao.registerMethod(paraMap);
		
	}
	
}
