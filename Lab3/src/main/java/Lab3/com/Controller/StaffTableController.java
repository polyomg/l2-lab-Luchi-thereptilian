package Lab3.com.Controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import Lab3.com.model.Staff;

@Controller
public class StaffTableController {
@GetMapping("/StaffTable/form")
public String fill(Model model)
{
	 List<Staff> list= List.of(
	 Staff.builder().id("user1@gmail.com").fullname("nguyễn văn user1").level(1).build(),	 
	 Staff.builder().id("user2@gmail.com").fullname("nguyễn văn user2").level(1).build(),
	 Staff.builder().id("user3@gmail.com").fullname("nguyễn văn user3").level(1).build(),
	 Staff.builder().id("user4@gmail.com").fullname("nguyễn văn user4").level(1).build(),
	 Staff.builder().id("user5@gmail.com").fullname("nguyễn văn user5").level(1).build(),
	 Staff.builder().id("user6@gmail.com").fullname("nguyễn văn user6").level(1).build()
	 );
	model.addAttribute("list",list);		 
	return "StaffTable/form";
	
}
}
