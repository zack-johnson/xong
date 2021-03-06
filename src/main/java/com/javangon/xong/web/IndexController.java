package com.javangon.xong.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class IndexController {

    @RequestMapping(value = {"/", "index"})
    public RedirectView getLoginPageViewName() {
        return new RedirectView("login");
    }


}
