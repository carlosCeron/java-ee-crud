package com.carlosceron.logic;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.carlosceron.model.Usuario;
import com.carlosceron.support.HibernateUtil;

import antlr.collections.List;

public class UsuarioLogic {
	
	
	
	public List listaUsuarios() {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        String query = "FROM usuario";
        
        ArrayList<Usuario> listadoUsuarios = (ArrayList<Usuario>) session.createQuery(query).list();
        
        
        session.getTransaction().commit();
        
        return listaUsuarios();
        
	}
	
	public void crearUsuario(Usuario usuario) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(usuario);
		
		session.getTransaction().commit();
	}
	
	public void actualizarUsuario(Long id, Usuario usuario) {
		 	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	        Session session = sessionFactory.openSession();
	        session.beginTransaction();
	        
	        Usuario usuarioUpdate = (Usuario) session.get(Usuario.class, id);
	        
	        usuarioUpdate.setNombre(usuario.getNombre());
	        usuarioUpdate.setCorreo(usuario.getCorreo());
	        usuarioUpdate.setMovil(usuario.getMovil());
	        
	        session.update(usuarioUpdate);
	        
	        session.getTransaction().commit();
	        System.out.println("Usuario Updated!!!");
    }
	
	
	public void borrarUsuario(Long id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        Usuario usuario = (Usuario) session.get(Usuario.class, id);
        
        session.delete(usuario);
        session.getTransaction().commit();
        System.out.println("Usuario Deleted!!!");
	}
	
}
