package li.barlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class FooService {
	private static final Logger log = LoggerFactory.getLogger(FooService.class);

	public void foo() {
		log.debug("foo");
	}
}
