package controller;

import java.io.*;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ws.*;
import ws.DemoStub;
import ws.DemoStub.Hello;
import ws.DemoStub.Sum;
import ws.ProductWebsStub.*;

/**
 * Servlet implementation class DemoController
 */
public class DemoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try {
			DemoStub ds = new DemoStub();
			ProductWebsStub ps = new ProductWebsStub();
			out.print(ds.hello(new Hello()).get_return());
			
			Sum s = new Sum();
			s.setA(2);
			s.setB(3);
			out.print("<br> Sum: " + ds.sum(s).get_return());
			
			Product p = ps.getProduct(new GetProduct()).get_return();
			out.print("<h3>Product Information</h3>");
			out.print("<br> Id: " + p.getId());
			out.print("<br> Name: " + p.getName());
			out.print("<br> Price: " + p.getPrice());
			
			out.print("<h3>List of Product Information</h3>");
			for(Product pr: ps.getAllProducts(new GetAllProducts()).get_return()) {
				out.print("<br> Id: " + pr.getId());
				out.print("<br> Name: " + pr.getName());
				out.print("<br> Price: " + pr.getPrice());
				out.print("<br>-----------------------------------");
			}
		}
		catch(Exception e) {
			out.println(e.getMessage());
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
