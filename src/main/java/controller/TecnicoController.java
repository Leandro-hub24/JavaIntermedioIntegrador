package controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.criteria.CriteriaQuery;
import models.Tecnico;

public class TecnicoController {

public String CrearTecnico(String nombre, String apellido, int incidentesResueltos) {
		
		SessionFactory sessionFactory = new
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tecnico.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		try {
			
			Tecnico tecnico = new Tecnico(nombre, apellido, incidentesResueltos);
			session.beginTransaction();
			session.persist(tecnico);
			session.getTransaction().commit();
			sessionFactory.close();
			
			return "Tecnico creado satisfactoriamente\n--------\n" + tecnico.toString();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return "Error al intentar registrar tecnico";
	}
	
	public String EliminarTecnico(int id) {
		
		SessionFactory sessionFactory = new
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tecnico.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		try {
			
			session.beginTransaction();
			Tecnico tecnico = session.get(Tecnico.class, id);
			session.remove(tecnico);
			session.getTransaction().commit();
			sessionFactory.close();
			
			return "Tecnico ID: "+id+" eliminado del sistema\n--------\n";
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return "Error al intentar eliminar el tecnico";
	}
	
	public String ActualizarTecnico(int id, String nombre, String apellido, int incidentesResueltos) {
		
		SessionFactory sessionFactory = new
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tecnico.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		try {
			
			session.beginTransaction();
			Tecnico tecnico = session.get(Tecnico.class, id);
			tecnico.setNombre(nombre);
			tecnico.setApellido(apellido);
			tecnico.setIncidentesResueltos(incidentesResueltos);
			session.getTransaction().commit();
			sessionFactory.close();
			
			return "Tecnico ID: "+id+" actualizado en el sistema\n--------\n"+tecnico.toString();
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return "Error al intentar actualizar el tecnico";
	}
	
	public String LeerTecnico(int id) {
		
		SessionFactory sessionFactory = new
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tecnico.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		try {
			
			session.beginTransaction();
			Tecnico tecnico = session.get(Tecnico.class, id);
			session.getTransaction().commit();
			sessionFactory.close();
			
			return "Tecnico ID: "+id+": "+tecnico.toString();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return "Error al intentar leer el tecnico";
	}
	
	public String ListadoTecnico() {
		
		SessionFactory sessionFactory = new
				Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Tecnico.class).buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		try {
			
			session.beginTransaction();
			
			CriteriaQuery<Tecnico> cq = session.getCriteriaBuilder().createQuery(Tecnico.class);
			
			cq.from(Tecnico.class);
			
			List<Tecnico> tecnico = session.createQuery(cq).getResultList();
			
			System.out.println("");
			System.out.println("L I S T A   D E   T E C N I C O S\n----------------------------------------");
			for (Tecnico u : tecnico) {
				System.out.println("TECNICO: "+u+"\n");
				System.out.println("ID: "+u.getId()+"\n");
				System.out.println("NOMBRE: "+u.getNombre()+"\n");
				System.out.println("APELLIDO: "+u.getApellido()+"\n");
				System.out.println("INCIDENTES RESUELTOS: "+u.getIncidentesResueltos()+"\n----------------------------------------");
			}
			
			sessionFactory.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return "Error al intentar leer la lista de tecnicos";
		}
		
		return "Fin de listado de Tecnicos";
		
	}
}
