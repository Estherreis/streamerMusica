package br.com.streamer.versao2.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import br.com.streamer.versao2.orm.Album;
import br.com.streamer.versao2.repository.AlbumRepository;
import br.com.streamer.versao2.specification.SpecificationAlbum;

@Service
public class RelatorioAlbumService {
	private Boolean system = true;
	private final AlbumRepository albumRepository;
	
	public RelatorioAlbumService(AlbumRepository albumRepository) {
		this.albumRepository = albumRepository;
	}
	
	public void inicial(Scanner scan) {
		while(system) {
			System.out.println("0 - Sair");
			System.out.println("1 - Buscar álbum por nome");
			System.out.println("2 - Buscar álbum por artista");
			
			int option = scan.nextInt();
			
			switch (option) {
			case 1: {
				buscaNome(scan);
				break;
			}
			case 2: {
//				buscaAlbumPorArtista(scan);
				break;
			}
			default:
				system = false;
				break;
			}
		}
	}
	
	public void buscaNome(Scanner scan) {
		System.out.print("Digite o nome do álbum: ");
		String nome = scan.next();
		
		List<Album> albuns = albumRepository.findAll(Specification.where(SpecificationAlbum.nome(nome)));
		albuns.forEach(System.out::println);
	}	
	
//	private void buscaAlbumPorArtista(Scanner scan) {
//		System.out.print("Nome do artista: ");
//		String nomeArtista = scan.next();
//		
//		List<Album> albuns = albumRepository.findAlbumPorArtista(nomeArtista);
//		albuns.forEach(System.out::println);
//	}
}
