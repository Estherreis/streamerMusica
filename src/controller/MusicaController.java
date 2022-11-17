package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Musica;

public class MusicaController {
	public List<Musica> musicas = new ArrayList<>();
	public List<Musica> lixeira;
	
	public boolean inserir(Musica musica) {
		if (musicas.add(musica))
			return true;
		return false;
	}

	public boolean alterar(Musica musicaAntiga, Musica musicaNova) {
		if (musicas.contains(musicaAntiga)) {
			musicas.remove(musicas.indexOf(musicaAntiga));
			musicas.add(musicaNova);
			return true;
		}
		return false;
	}

	public boolean remover(Musica musica) {
        if (this.musicas.contains(musica)) {
            this.lixeira.add(musica);
            this.musicas.remove(musica);
            return true;
        } else
            return false;
    }

	public void read() {
		ordenar();
		musicas.forEach((musica) -> musica.imprimir());
	}

	public void encontrarNome(String nome){
		musicas.stream().filter( musica -> musica.getNome().equals(nome)).forEach(musica -> musica.imprimir());
	}
	
	public void encontrarPorArtista(String nomeArtista){
//		musicas.stream().filter( musica -> (musica.getArtistas().stream().filter(artista -> artista.getNome().equalsIgnoreCase(nomeArtista)))).forEach(artista -> artista.imprimir());
	}

	public void ordenar() {
		musicas.sort((o1, o2) -> o1.getNome().compareToIgnoreCase(o2.getNome()));
	}

	public List<Musica> getMusicas() {
		return musicas;
	}
}
