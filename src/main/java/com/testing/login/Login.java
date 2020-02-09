package com.testing.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=uft-8");
		String userValue=request.getParameter("User");
		String pwdValue=request.getParameter("pwd");
//		userValue.equals("dw");
//		pwdValue.equals("123456");
		response.getWriter().append("Served at: ").append(request.getContextPath()).append("项目").append(userValue+pwdValue);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("uft-8");
		response.setCharacterEncoding("uft-8");
		response.setContentType("text/html;charset=uft-8");
		String userpost=request.getParameter("user");
		String pwdpost=request.getParameter("pwd");
		String moive=request.getParameter("喜欢看什么电视剧");
		String result="";
		if((new String("dw")).equals(userpost)&&(new String("123456")).equals(pwdpost)) {
			result="恭喜您登录成功";
		}else {
			result="不好，登录失败了";
		}
		
		response.getWriter().append("输入的内容是").append(userpost+pwdpost+moive).append("登录结果是："+result);
	}

}
