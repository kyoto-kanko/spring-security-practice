package com.example.its.domain.auth;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface UserRepository {
    @Select("SELECT * FROM users WHERE username = #{username}")
    Optional<User> findByUsername(String username);

}
