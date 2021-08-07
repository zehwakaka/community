package zehwakaka.com.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import zehwakaka.com.community.mapper.UserMapper;
import zehwakaka.com.community.model.User;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public  String index(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        System.out.println(cookies);
        for (Cookie cookie: cookies){
            if (cookie.getName().equals("token")){
                String token = cookie.getValue();
                User user = userMapper.findByToken(token);
                if (user != null){
                    request.getSession().setAttribute("user",user);
                }
                break;
            }
        }


        return "index";
    }

}
//@Controller
//public class IndexController {
//    @GetMapping("/")
//    public  String index(){
//        return "index";
//    }
//
//}