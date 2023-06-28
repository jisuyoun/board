package com.todo.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InterBoardMapper {

	void registerMethod(Map<String, String> paraMap);

}
