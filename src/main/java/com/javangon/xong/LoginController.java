package com.javangon.xong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping(value = {"/", "index"})
    public String getLoginPageViewName() {
        return "index";
    }


}
