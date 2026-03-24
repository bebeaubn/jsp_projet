package org.babakaud.jspproject;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    private static final String LOGIN_USER_KEY = "loginUser";
    private static final String DEMO_USERNAME = "admin";
    private static final String DEMO_PASSWORD = "1234";

    @GetMapping("/")
    public String root() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session,
                        Model model) {
        if (DEMO_USERNAME.equals(username) && DEMO_PASSWORD.equals(password)) {
            session.setAttribute(LOGIN_USER_KEY, username);
            return "redirect:/main";
        }

        model.addAttribute("error", "아이디 또는 비밀번호가 올바르지 않습니다.");
        return "login";
    }

    @GetMapping("/main")
    public String mainPage(HttpSession session) {
        if (session.getAttribute(LOGIN_USER_KEY) == null) {
            return "redirect:/login";
        }
        return "main";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
