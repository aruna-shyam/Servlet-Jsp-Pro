package com.techpalle.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.model.Student;

@WebServlet("/")
public class MyServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	  String path=request.getServletPath();
	  switch(path)
	  {
	  case "/reg":
		  validateStudent(response,request);
		  break;
	  default:
		  getStartUpPage(response,request);
		  break;
	  }
	}

	
	private void validateStudent(HttpServletResponse response, HttpServletRequest request) 
	{
		String sno1=request.getParameter("tbSno");
		int sno=Integer.parseInt(sno1);
		String name=request.getParameter("tbSname");
		String sub=request.getParameter("tbSsub");
		
		Student s1=new Student(sno,name,sub);
		
        try 
		{
			RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
			request.setAttribute("obj", s1);
			rd.forward(request, response);
		} 
		catch (ServletException e) 
		{
			
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
	}


	private void getStartUpPage(HttpServletResponse response, HttpServletRequest request) 
	{
		
		try 
		{
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		catch (ServletException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
