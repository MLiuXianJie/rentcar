package com.qf.mapper;

import com.qf.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    User getUserByNameAndPWD(User user);
    Integer register(User user);
    Integer updateTcl(String tel,Integer id);
    Integer updateEmail(String email,Integer id);
    Integer updatePWD(String password,Integer id);
    User getUserByTel(String tel);
    User getUserByEmail(String email);
    User getUserByPWD(String password);
}
