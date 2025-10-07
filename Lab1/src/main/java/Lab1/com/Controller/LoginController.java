package Lab1.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
  @Autowired
  HttpServletRequest request;
  @GetMapping("/Login/Login")// cái mapping này là để nó lấy cái form
  public String Login() { // đây cũng là phần quan trọng vì cái Getmapping nó phải đi chung cái này mới có thể truy cập đúng chỗ.
	  return "/Login/Login";
  }
  @PostMapping("/Login/check")
  public String Login(
          Model model,
          @RequestParam("username") String username,
          @RequestParam("password") String password) {
      
      if ("poly".equals(username) && "123".equals(password)) {
          model.addAttribute("message", "Đăng nhập thành công ");
          model.addAttribute("username",username);
          model.addAttribute("password",password);
      } else {
          model.addAttribute("message", "Đăng nhập thất bại");
      }
      return "/Login/Login";
  }

}
