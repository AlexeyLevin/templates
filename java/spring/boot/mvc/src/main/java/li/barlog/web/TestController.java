package li.barlog.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class TestController {
	@RequestMapping("/test")
	@ResponseBody
	public String hello() {
		return "test";
	}
}
