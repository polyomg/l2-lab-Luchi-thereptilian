package Lab2.com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    // Hiển thị form
    @GetMapping("/View/form")
    public String form() {
        return "/View/form";
    }

    // Nhận dữ liệu từ form
    @PostMapping("/product/save")
    public String save(
    		@RequestParam("name") String name,        // lấy từ URL: /param/save/2021
            @RequestParam("price") String price,        // lấy từ input: name="y"
            Model model) {

        // đưa dữ liệu ra View
        model.addAttribute("name", name);
        model.addAttribute("price", price);

        return "/View/form";  // trả về lại form.html
    }
}
