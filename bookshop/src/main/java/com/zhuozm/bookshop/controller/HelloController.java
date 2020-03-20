package com.zhuozm.bookshop.controller;

import com.zhuozm.bookshop.bean.Person;
import com.zhuozm.bookshop.bean.User;
import com.zhuozm.bookshop.dao.UserMapper;
import com.zhuozm.bookshop.dao.studentMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Api(tags = "HEllO控制器")
@Controller
public class HelloController {
    @Autowired
    private studentMapper studentMapper;
    @Autowired
    private UserMapper userMapper;


    @ApiOperation("添加用户控制器")
    @ApiImplicitParams ({
            @ApiImplicitParam(name = "id",value = "用户id"),
    })
    @RequestMapping(value = "/hello/{id}",method = RequestMethod.GET)
    protected String hello( @PathVariable int id){
        System.out.println("A");
        Map<String,Integer> map = new HashMap();
        map.put("dode",22);

            return "redirect:/hel";
    }

    @ApiOperation("添加器")
    @ApiImplicitParams ({
            @ApiImplicitParam(name = "idsss",value = "用户id"),
    })
    @ResponseBody
    @RequestMapping(value = "/hel",method = RequestMethod.POST)
    public Person hel(@RequestBody Person user,HttpServletRequest er,HttpServletResponse s ){

        System.out.println();

        return user ;
    }

    @ApiOperation("添加器")
    @ApiImplicitParams ({
            @ApiImplicitParam(name = "id",value = "用户id"),
    })
    @ResponseBody
    @RequestMapping(value = "/helddd",method = RequestMethod.POST)
    public User hessssl(@RequestParam Integer id){
//       String s = studentMapper.getStudentName(id);
        String a = 44+"";
//       Integer b = userMapper.deleteUserById(id);
       User user = userMapper.getUserName(id);
        a = 44+"";
        return user ;
    }
}