package controllers.member;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.member.LoginService;
import models.member.ServiceManager;

import java.io.IOException;

import static commons.ScriptUtil.go;

@WebServlet("/member/login")
public class LoginController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/templates/member/login.join");
                rd.forward(req, resp);

    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {

        try {
            LoginService service = ServiceManager.getInstance().loginService();
            service.login(req);

            /*아이디 저장 처리 S */
            String userId = req.getParameter("userId");
            String saveId = req.getParameter("saveId");
            Cookie cookie = new Cookie("saveId",userId);
            if(saveId == null) { //미체크 - 쿠키 제거
                cookie.setMaxAge(0);
            }else { // 체크상태 - 쿠키저장
                cookie.setMaxAge(60 * 60 * 24 * 365);

            }
            resp.addCookie(cookie);
            /*아이디 저장 처리  E */
            go(resp,req.getContextPath() + "/", "parent");
        }catch (RuntimeException e) {
            alerError(resp, e);
        }


    }

    private void alerError(HttpServletResponse resp, RuntimeException e) {
    }
}
