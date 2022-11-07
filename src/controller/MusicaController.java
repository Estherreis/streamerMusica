package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Musica;

public class MusicaController {
	public List<Musica> musicas = new ArrayList<>();
	
	public boolean inserir(Musica musica) {
		if (musicas.add(musica))
			return true;
		return false;
	}

	public boolean alterar(Musica musicaAntiga, Musica musicaNova) {
		int indice = musicas.indexOf(musicaAntiga);
		if (musicas.contains(musicaAntiga)) {
			musicas.remove(indice);
			musicas.add(musicaNova);
			return true;
		}
		return false;
	}

	public boolean delete(Musica musica) {
		if (musicas.remove(musica))
			return true;
		return false;
	}

	public void read() {
		ordenar();
		musicas.forEach((musica) -> musica.imprimir());
	}

	public void encontrarNome(String nome){
		musicas.stream().filter( musica -> musica.getNome().equals(nome)).forEach(musica -> musica.imprimir());
	}

	public void ordenar() {
		musicas.sort((o1, o2) -> o1.getNome().compareToIgnoreCase(o2.getNome()));
	}

	public List<Musica> getMusicas() {
		return musicas;
	}
}
