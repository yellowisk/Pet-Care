package main;

import java.sql.Date;
import java.sql.Time;

import bean.Cliente;
import bean.Pet;
import bean.Veterinario;
import bean.Consulta;
import dao.PetDAO;
import dao.ClienteDAO;
import dao.ConsultaDAO;
import dao.VeterinarioDAO;

public class Principal {
	public static void main(String[] args) {

		Date d = new Date(1990,04,21);
		Date d2 = new Date(2021,05,12);
		Cliente c = new Cliente("45678912275", "Josué", d, d2, "josué@gmail.com");
		ClienteDAO cdao = new ClienteDAO();
		cdao.inserir(c);
		System.out.println(c);
		
		Pet p = new Pet("45678912275", 9,"Au",9,9);
		PetDAO pdao = new PetDAO();
		pdao.inserir(p);
		System.out.println(p);
		
		Veterinario v = new Veterinario("1254548273", "Marco Polo", 
				70, "marco@vet", "Rua Pequim", "Veneza", "1324963255", 
				159, "USP", "Cães", "S");
		VeterinarioDAO vdao = new VeterinarioDAO();
		vdao.inserir(v);
		System.out.println(v);
		
		Date d3 = new Date(2022,05,28);
		Time t = new Time(11,00,00);
		Consulta cn = new Consulta("1254548273", "45678912275", 9, d3, t);
		ConsultaDAO cndao = new ConsultaDAO();
		cndao.marcar(cn);
		System.out.println(cn);
		
	}
}
