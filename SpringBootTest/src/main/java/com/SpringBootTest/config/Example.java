package com.SpringBootTest.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

/**
 * Created by lich on 11/7/16.
 */
@Controller
@SessionAttributes("visitor")
public class Example extends HttpServlet {
    @RequestMapping(value = "/test")
    @ResponseBody
    public String getSessionIncontroller
            (@RequestBody String jsonReqString , HttpSession session)
    {

        session.setAttribute("success" , "successfully accessed");
        return "sss";
    }
}