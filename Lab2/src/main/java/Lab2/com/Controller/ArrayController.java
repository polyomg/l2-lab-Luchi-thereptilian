package Lab2.com.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Lab2.com.Model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Array")
public class ArrayController {

    
    private List<Product> items = new ArrayList<>();

    
    public ArrayController() {
        items.add(new Product("A", 1.0));
        items.add(new Product("B", 12.0));
        items.add(new Product("C", 99.9));
    }

    @GetMapping("/form")
    public String form(Model model) {
        
        Product p1 = new Product("iPhone 30", 5000.0);

        model.addAttribute("p1", p1);               
        model.addAttribute("p2", new Product());   
        model.addAttribute("items", items);        

        return "Array/form";
    }

    @PostMapping("/save")
    public String save(
            @RequestParam("name") String name,
            @RequestParam("price") Double price,
            Model model) {

        
        Product p2 = new Product(name, price);

        
        items.add(p2);

        
        model.addAttribute("p1", new Product("iPhone 30", 5000.0)); 
        model.addAttribute("p2", p2); 
        model.addAttribute("items", items); 
        model.addAttribute("message", "Lưu thành công: " + name + " - " + price);

        return "Array/form";
    }
}

