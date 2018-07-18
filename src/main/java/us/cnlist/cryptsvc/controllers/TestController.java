package us.cnlist.cryptsvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import us.cnlist.cryptsvc.domain.SystemUser;
import us.cnlist.cryptsvc.repository.UserRepository;
import us.cnlist.cryptsvc.util.HashPassword;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "init", method = RequestMethod.GET)
    public String init() {

        SystemUser user = new SystemUser();
        user.setLogin("root");
        user.setPassword(HashPassword.hash("r23WdS/9(,KK"));
        userRepository.save(user);

        return "ok";
    }


}
