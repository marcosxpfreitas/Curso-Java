package br.com.javaweb.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javaweb.gerenciador.Empresa;
import br.com.javaweb.gerenciador.dao.EmpresaDAO;


/**
 * Servlet implementation class AdicionaEmpresa
 */
@WebServlet("/adicionaempresa")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	/*
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		Empresa empresa = new Empresa(nome);
		new EmpresaDAO().adiciona(empresa);
		PrintWriter writer = resp.getWriter();
		writer.println("<html><body>Empresa : " + nome + " inserida com sucesso!</body></html>");
		
	}
	*/

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		int statusCode = HttpServletResponse.SC_OK;
		Empresa empresa = new Empresa(nome);
		new EmpresaDAO().adiciona(empresa);
		PrintWriter writer = response.getWriter();
		writer.println("<html><body>Empresa : " + nome + 
				" inserida com sucesso! " +
				" Com Status : " + statusCode + 
				"</body></html>"
				);
		
	}
	
}
