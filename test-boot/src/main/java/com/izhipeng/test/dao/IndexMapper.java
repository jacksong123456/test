package com.izhipeng.test.dao;

import org.apache.ibatis.annotations.Mapper;

import com.izhipeng.test.po.Test;


@Mapper
public interface IndexMapper {
	
	public Test select();
	
}
