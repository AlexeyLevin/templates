package li.barlog.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BarService {
	val fooService: FooService

	@Autowired
	constructor(fooService: FooService) {
		this.fooService = fooService
	}

	fun b(): String {
		return fooService.a()
	}
}
