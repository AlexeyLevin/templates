package li.barlog.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public final class IndexController {
	@Value("${app.name}")
	private String name;

	@Value("${app.version}")
	private String version;

	@RequestMapping({"/", "index"})
	public String index(Model model) {
		model.addAttribute("name", name);
		model.addAttribute("version", version);
		return "index";
	}
}
