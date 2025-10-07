package Lab3.com.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import Lab3.com.model.Staff;

@Controller
public class StaffListController {

    @RequestMapping("/staffList/list")
    public String list(Model model) {
        List<Staff> list = List.of(
            Staff.builder().photo("banner2.jpg").id("user1@gmail.com").fullname("nguyễn văn user1").level(0).salary(5000.0).build(),
            Staff.builder().photo("banner2.jpg").id("user2@gmail.com").fullname("nguyễn văn user2").level(1).salary(6500.0).build(),
            Staff.builder().photo("banner2.jpg").id("user3@gmail.com").fullname("nguyễn văn user3").level(2).salary(8000.0).build(),
            Staff.builder().photo("banner2.jpg").id("user4@gmail.com").fullname("nguyễn văn user4").level(2).salary(8200.0).build(),
            Staff.builder().photo("banner2.jpg").id("user5@gmail.com").fullname("nguyễn văn user5").level(1).salary(7000.0).build(),
            Staff.builder().photo("banner2.jpg").id("user6@gmail.com").fullname("nguyễn văn user6").level(0).salary(4800.0).build()
        );

        model.addAttribute("list", list);
        return "StaffList/form1"; 
    }
}
