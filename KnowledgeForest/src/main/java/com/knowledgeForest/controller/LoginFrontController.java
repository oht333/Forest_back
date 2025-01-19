package com.knowledgeForest.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginFrontController
 */
//@WebServlet("/LoginFrontController")
public class LoginFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginFrontController 들어옴");
		
		String target = request.getRequestURI().substring(request.getContextPath().length());
		
//		경로 분기처리
		switch (target) {
		case "/login/login.me" :
			request.getRequestDispatcher("/html/login/login.jsp").forward(request, response);
			break;
		}
		
	}

}
