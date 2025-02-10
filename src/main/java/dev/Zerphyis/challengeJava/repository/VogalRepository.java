package dev.Zerphyis.challengeJava.repository;

import dev.Zerphyis.challengeJava.vogal.Vogal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VogalRepository extends JpaRepository<Vogal,Long> {
}
