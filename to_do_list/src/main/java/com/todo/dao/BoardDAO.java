package com.todo.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.todo.mapper.InterBoardMapper;

@Repository
public class BoardDAO implements InterBoardDAO {

	@Autowired
	private InterBoardMapper mapper;

	@Override
	public void registerMethod(Map<String, String> paraMap) {

		mapper.registerMethod(paraMap);
		
	}
	
}
