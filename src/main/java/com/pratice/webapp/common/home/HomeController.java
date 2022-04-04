package com.pratice.webapp.common.home;

import com.pratice.webapp.constant.Path;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/")
public class HomeController {
    @RequestMapping(value = Path.HOMEPAGE, produces = "text/html", method = RequestMethod.GET)
    public String homepageHTML(){
        ModelAndView mav = new ModelAndView();
        return "/home/homepage";
    }
}
