package routers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xinszhou on 16/8/28.
 */
@RestController
public class HelloWelcome {
    @RequestMapping(path = "/box")
    public String welcome() {
        return "box welcome";
    }
}
