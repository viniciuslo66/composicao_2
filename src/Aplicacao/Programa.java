package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entidades.Comentarios;
import Entidades.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		 Comentarios c1 = new Comentarios("Have a nice trip!");
		 Comentarios c2 = new Comentarios("Wow that's awesome");
		 
		 Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para Nova Zelandia", "Vou conhecer esse pais maravilhoso", 12);
		 
		 p1.adicionarComentario(c1);
		 p1.adicionarComentario(c2);
	}
}
