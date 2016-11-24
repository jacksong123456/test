package com.izhipeng.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izhipeng.test.dao.IndexMapper;
import com.izhipeng.test.po.Test;
import com.izhipeng.test.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private IndexMapper indexMapper;

	@Override
	public Test select() {
		return indexMapper.select();
	}
}
