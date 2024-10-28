package com.wora.repositories;

import com.wora.models.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RiderRepo extends JpaRepository<Rider, Long> {
//    List<Rider> findByLastName(String lastName);
//    List<Rider> findByTeam_TeamName(String teamName);
//    List<Rider> findByNationality(String nationality);
}

