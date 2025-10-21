package Lab2.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test")
public class TestmethodController {

    @GetMapping("/testmethod")
    public String showForm() {
        return "test/testmethod"; // file html trong templates/test/testmethod.html
    }

    // Ok1: POST /test/ok
    @PostMapping("/ok")
    public String m1(HttpServletRequest req) {
        req.setAttribute("msg", "m1()");
        return "test/testmethod";
    }

    // Ok2: GET /test/ok
    @GetMapping("/ok")
    public String m2(HttpServletRequest req) {
        req.setAttribute("msg", "m2()");
        return "test/testmethod";
    }

    // Ok3: POST /test/ok?x=...
    @PostMapping(value = "/ok", params = "x")
    public String m3(HttpServletRequest req) {
        req.setAttribute("msg", "m3()");
        return "test/testmethod";
    }
}


