package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
        @ResponseBody
	public Object hello() {
		return new Object() { public final String hello = "hello"; };
	}
}
