package li.barlog.rest;

import li.barlog.domain.Foo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public final class FooController {
	@RequestMapping("/foo")
	@ResponseBody
	public List<Foo> version() {
		List<Foo> list = new ArrayList<>(3);
		list.add(new Foo("foo"));
		list.add(new Foo("bar"));
		list.add(new Foo("buz"));
		return list;
	}
}
