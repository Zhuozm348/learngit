package com.zhuozm.bookshop.dao;



import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

@Mapper
public interface studentMapper {
    @Select("select name from student where id = #{id}")
    String getStudentName(@Param("id")Long id);





}
