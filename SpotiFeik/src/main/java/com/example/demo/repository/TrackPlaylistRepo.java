package com.example.demo.repository;

import com.example.demo.model.TrackPlaylist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackPlaylistRepo extends JpaRepository<TrackPlaylist, Long> {

    @Modifying
    @Query(value = "DELETE FROM TrackPlaylist WHERE idTrack = :idTrack AND idPlaylist = :idPlaylist")
    void deleteTrackFromPlaylists(@Param("idTrack") Long idTrack,@Param("idPlaylist") Long idPlaylist);

    @Modifying
    @Query(value = "DELETE FROM TrackPlaylist WHERE idPlaylist = :idPlaylist")
    void deletePlaylist(@Param("idPlaylist") Long idPlaylist);
}
