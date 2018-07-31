package com.carlosceron.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carlosceron.logic.UsuarioLogic;
import com.carlosceron.model.Usuario;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/new")
public class New extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public New() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		getServletContext().getRequestDispatcher("/views/new.jsp").forward(request, response);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("nombre");
		String correo = request.getParameter("correo");
		String movil = request.getParameter("movil");
		
		
		Usuario usuario = new Usuario(name, correo, movil);
		UsuarioLogic usuarioLogic = new UsuarioLogic();
		
		usuarioLogic.crearUsuario(usuario);
		
		response.sendRedirect("List");
		
	}

}
