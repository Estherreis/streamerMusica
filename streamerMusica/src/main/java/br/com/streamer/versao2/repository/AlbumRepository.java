package br.com.streamer.versao2.repository;



import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.streamer.versao2.orm.Album;

public interface AlbumRepository extends PagingAndSortingRepository<Album, Integer>, JpaSpecificationExecutor<Album>{
//	@Query(value = "SELECT * FROM album a, album_artistas aa, artista a2 WHERE a.id = aa.album_id AND "
//			+ "aa.artistas_id = a2.id AND a2.nome = :nomeArtista", nativeQuery = true)
//	List<Album> findAlbumPorArtista(String nomeArtista);
}
