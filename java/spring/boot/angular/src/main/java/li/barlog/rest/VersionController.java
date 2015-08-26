package li.barlog.rest;

import li.barlog.dto.Version;
import li.barlog.service.VersionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public final class VersionController {
	@Autowired
	private VersionService versionService;

	@RequestMapping("/version")
	@ResponseBody
	public Version version() {
		return versionService.getVersion();
	}
}
