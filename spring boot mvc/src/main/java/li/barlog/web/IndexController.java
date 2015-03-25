package li.barlog.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public final class IndexController {
	@RequestMapping({"/", "index"})
	public String index(final Model model) {
		model.addAttribute("date", LocalDate.now());
		return "index";
	}

}
