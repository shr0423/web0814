/*
이 클래스는 오직 서버에서만 해석 및 실행되어지는 클래스이다.
이러한 클래스를 가리켜 서블릿(Servlet)이라한다.
*/
package test;

//서블릿 클래스를 상속받으면 이때부터 MyServlet 은
//서블릿이 된다..is a 관계
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

//이 서블릿을 이용하여 나의 이름을 웹브라우저에 출력해보자
public class MyServlet extends HttpServlet{
	
	//클라이언트의 요청이 get방식일 경우, doGet() 메서드로 요청을 받아야한다.
	//jsp에서의 request내장객체의 자료형은 사실HttpServletRequest형 이었다.
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			//나의 이름을 응답정보로 구성하여 웹브라우저에 전송하자
			response.setContentType("text/html;charset=utf-8");//jsp에서의 page지시영역의 인코딩
			PrintWriter out=response.getWriter();

			out.print("my name is 송혜령");
	}
}
