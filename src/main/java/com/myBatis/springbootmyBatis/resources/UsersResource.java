package com.myBatis.springbootmyBatis.resources;


import com.myBatis.springbootmyBatis.mapper.UsersMapper;
import com.myBatis.springbootmyBatis.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/users")
public class UsersResource {

    private UsersMapper usersMapper;

    private UsersResource(UsersMapper usersMapper){
        this.usersMapper = usersMapper;
    }


    @GetMapping("/all")
    public List<Users> getAll(){
        return usersMapper.findAll();
    }

    @GetMapping("/update")
    private List<Users> update(@RequestBody Users users){
        usersMapper.insert(users);
        return usersMapper.findAll();
    }

    @GetMapping("/updateUsers")
    private List<Users> updateUsers(@RequestBody Users users){
        usersMapper.update(users);
        return usersMapper.findAll();
    }

    @GetMapping("/delete")
    private List<Users> delete(@RequestBody Users users){
        usersMapper.delete(users);
        return usersMapper.findAll();
    }


}
