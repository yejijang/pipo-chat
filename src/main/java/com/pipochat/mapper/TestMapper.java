package com.pipochat.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pipochat.dto.Test;

@Mapper
public interface TestMapper {
	List<Test> getTest();
}