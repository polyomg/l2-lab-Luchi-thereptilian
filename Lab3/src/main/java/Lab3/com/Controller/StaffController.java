package Lab3.com.Controller;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Lab3.com.model.Staff;

@Controller
public class StaffController {
	@RequestMapping("/Staff/form")
	public String detail(Model model) {
	Staff staff = Staff.builder()
    .photo("banner2.jpg")
	.id("user@gmail.com")
	.fullname("nguyễn văn user")
	.gender(true)
	.birthday(new GregorianCalendar(2024, Calendar.DECEMBER, 23).getTime())
	.level(2)
	.salary(12345.6789)
	.build();

	model.addAttribute("staff", staff);
	return "/Staff/form";
	}
}
