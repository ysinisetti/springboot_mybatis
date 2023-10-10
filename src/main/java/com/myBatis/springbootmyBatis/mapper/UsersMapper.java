package com.myBatis.springbootmyBatis.mapper;


import com.myBatis.springbootmyBatis.model.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("select * from employeeTables")
    List<Users> findAll();


    @Insert("insert into employeeTables(id,name,salary) values(#{id},#{name},#{salary})")
//    @SelectKey(statement = "SELECT LAST_INSERT_ID()",keyProperty="id",before = false,resultType = Integer.class)
    void insert(Users users);


    @Update("update employeeTables set salary=#{salary} where name=#{name}")
    void update(Users users);

    @Delete("delete from employeeTables where name=#{name}")
    void delete(Users users);


}
