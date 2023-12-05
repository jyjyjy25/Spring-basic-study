package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override // HTTP 요청을 통해 URL이 호출되면 서블릿 컨테이너는 다음 메서드(service)를 실행한다.
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        // 쿼리 파라미터 조회
        String username = request.getParameter("username"); // username 이라는 쿼리파라미터에 해당하는 값을 가져온다.
        System.out.println("username = " + username);

        // 응답 메시지 보내기
        response.setContentType("text/plain"); // http 헤더 정보 - content type
        response.setCharacterEncoding("utf-8"); // 문자 인코딩은 요즘에는 utf-8을 사용한다.
        response.getWriter().write("hello " + username); // http 메시지 바디에 들어가는 데이터
    }
}
