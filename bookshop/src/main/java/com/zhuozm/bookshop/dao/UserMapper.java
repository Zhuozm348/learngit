package com.zhuozm.bookshop.dao;
import com.zhuozm.bookshop.bean.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    Integer deleteUserById(Integer id);
    User getUserName(Integer id);
}
