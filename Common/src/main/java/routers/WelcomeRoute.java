package routers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xinszhou on 16/8/28.
 */
@RestController
public class WelcomeRoute {

    @RequestMapping(path = "/common")
    public String welcome() {
        return "common welcome";
    }

}
