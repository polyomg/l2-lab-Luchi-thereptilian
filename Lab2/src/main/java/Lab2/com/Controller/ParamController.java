package Lab2.com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ParamController {

    // Hiển thị form
    @RequestMapping("/Param/form")
    public String form() {
        return "/Param/form";
    }

    // Nhận dữ liệu từ form
    @RequestMapping("/Param/save/{x}")
    public String save(
            @PathVariable("x") String x,        // lấy từ URL: /param/save/2021
            @RequestParam("y") String y,        // lấy từ input: name="y"
            Model model) {

        // đưa dữ liệu ra View
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        return "/Param/form";  // trả về lại form.html
    }
}
