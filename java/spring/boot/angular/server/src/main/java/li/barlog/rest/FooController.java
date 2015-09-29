package li.barlog.rest;

import li.barlog.dto.Foo;
import li.barlog.dto.ImmutableFoo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public final class FooController {
	@RequestMapping("/foo")
	public ResponseEntity<List<Foo>> foo() {
		List<Foo> list = new ArrayList<>(3);
		list.add(ImmutableFoo.builder().message("foo").build());
		list.add(ImmutableFoo.builder().message("bar").build());
		list.add(ImmutableFoo.builder().message("buz").build());
		return new ResponseEntity<List<Foo>>(list, HttpStatus.OK) ;
	}
}
