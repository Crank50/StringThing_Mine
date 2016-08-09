package springBootApp.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Justin on 8/8/16.
 */
@RestController
public class JsonRestController {

    @RequestMapping("/rest/")
    public String index() {
        return "<h1>Greetings from Spring Boot!</h1>";
    }

    @RequestMapping("/rest/test")
    public String test() { return "<h1>This is a test...</h1>";
    }

    @RequestMapping("/rest/form")
    public String form() {
        return "<h1>This is also a test...</h1>";   }

        @RequestMapping("/blur/")
    public String blur() {
        return "<h1>This is also a test...</h1>";
    }
}
