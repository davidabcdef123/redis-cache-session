package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sc on 2018/12/19.
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index(HttpServletRequest request){
        request.getSession().setAttribute("test","1111");
        return "success";
    }


    @GetMapping("/getValue")
    public String getValue(HttpServletRequest request){
        String str=(String)request.getSession().getAttribute("test");
        return str;
    }
}
