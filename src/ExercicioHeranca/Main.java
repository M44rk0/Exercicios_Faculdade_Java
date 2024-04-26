package ExercicioHeranca;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList <ProgramaTV> programas = new ArrayList<ProgramaTV>();

		ProgramaTV p = new ProgramaTV("O outro lado do paraíso","Novela");
		p.diretor = new Pessoa("Diretor 1", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
		programas.add(p);

		p = new ProgramaTV("Orgulho e Paixão","Novela");
		p.diretor = new Pessoa("Diretor 2", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 3", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 4", "Brasileiro"));
		programas.add(p);

		p = new ProgramaTV("Marley e eu","Filme");
		p.diretor = new Pessoa("Diretor 3", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 5", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 6", "Brasileiro"));
		programas.add(p);

		p = new ProgramaTV("Show Ivete Sangalo","Show");
		p.diretor = new Pessoa("Diretor 4", "Brasileiro");
		p.setArtistas(new Pessoa("Artista 7", "Brasileiro"));
		p.setArtistas(new Pessoa("Artista 8", "Brasileiro"));
		programas.add(p);

		Serie s = new Serie("Arrow", "Ação", 8, 170);
		s.diretor = new Pessoa("Diretor 1", "Americano");
		s.setArtistas(new Pessoa("Artista 1", "Americano"));
		s.setArtistas(new Pessoa("Artista 2", "Americano"));
		s.setArtistas(new Pessoa("Artista 3", "Americano"));
		s.setArtistas(new Pessoa("Artista 4", "Americano"));

		programas.add(s);

		s = new Serie("Game Of Thrones", "Ação", 8, 74);
		s.diretor = new Pessoa("Diretor 1", "Americano");
		s.setArtistas(new Pessoa("Artista 1", "Americano"));
		s.setArtistas(new Pessoa("Artista 2", "Americano"));
		s.setArtistas(new Pessoa("Artista 3", "Americano"));
		s.setArtistas(new Pessoa("Artista 4", "Americano"));
		s.setArtistas(new Pessoa("Artista 5", "Americano"));
		s.setArtistas(new Pessoa("Artista 6", "Americano"));
		s.setArtistas(new Pessoa("Artista 7", "Americano"));

		programas.add(s);

        for (ProgramaTV programa : programas) {
            System.out.println(programa);
        }

	}

}
