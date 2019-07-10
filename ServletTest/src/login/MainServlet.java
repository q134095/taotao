package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public MainServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException,IOException {
		request.setCharacterEncoding("GBK");
		response.setContentType("text/html;charaset = GBK");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		String logtime = (String) session.getAttribute("logtime");
		out.println("登录名:"+username+"&nbsp;&nbsp;&nbsp;&nbsp;登陆时间:"+logtime);
        out.println("欢迎"+username);
	}
}
