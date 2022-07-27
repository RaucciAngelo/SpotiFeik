package com.example.demo.repository;

import com.example.demo.model.TrackArtist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackArtistRepo extends JpaRepository<TrackArtist, Long> {

    @Modifying
    @Query(value = "DELETE FROM TrackArtist WHERE idTrack = :idTrack AND idArtist = :idArtist", nativeQuery = true)
    void deleteTrackFromArtists(@Param("idTrack") Long idTrack, @Param("idArtist") Long idArtist);

    @Query(value = "DELETE FROM TrackArtist WHERE idArtist = :idArtist", nativeQuery = true)
    void deleteArtistAndTracks(@Param("idArtist") Long idArtist);
}
