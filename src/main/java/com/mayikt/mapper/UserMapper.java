package com.mayikt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.mayikt.entity.UserEntity;

public interface UserMapper {
	@Select("SELECT * FROM  user ")
	public List<UserEntity> findUser();

	@Select("insert into user values (#{userName}); ")
	public List<UserEntity> insertUser(@Param("userName") String userName);
}
