package com.devgustavo.ftvideos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devgustavo.ftvideos.entities.Score;
import com.devgustavo.ftvideos.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
