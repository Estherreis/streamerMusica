package br.com.streamer.versao2.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.streamer.versao2.orm.Musica;

public interface MusicaRepository extends PagingAndSortingRepository<Musica, Integer>, JpaSpecificationExecutor<Musica>{

//	List<Musica> findMusicaByArtistas(String nomeArtista);
	
//	@Query("SELECT m FROM Musica m WHERE Musica.id = :id")
//	Musica visualizarMusica(Integer id);
}
