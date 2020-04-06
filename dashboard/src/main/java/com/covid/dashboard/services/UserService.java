package com.covid.dashboard.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.covid.dashboard.domain.User;
import com.covid.dashboard.mapper.UserMapper;


public class UserService {
	
	public void insertUser(User user) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			userMapper.insertUser(user);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	
	public List<User> getAllUsers() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			return userMapper.getAllUsers();
		} finally {
			sqlSession.close();
		}
	}

}
