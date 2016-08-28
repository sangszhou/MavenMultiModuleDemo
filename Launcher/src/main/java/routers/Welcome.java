package routers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xinszhou on 16/8/28.
 */
@RestController
public class Welcome {

    @RequestMapping("launcher")
    public String welcome() {
        return "launcher welcome";
    }
}
