package Lab2.com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/Bruh")
public class BruhController {
@RequestMapping("/form")
public String m1() {
return "/Bruh/form";
}
@RequestMapping("/b")
public String m2(Model model) {
model.addAttribute("message", "I come from b");
return "/Bruh/form";
}
@RequestMapping("/c")
public String m3(RedirectAttributes params) {
params.addAttribute("message", "I come from c");
return "redirect:/Bruh/form";
}

@RequestMapping("/d")
@ResponseBody
public String m4() {
    return "I come from d";
}
}