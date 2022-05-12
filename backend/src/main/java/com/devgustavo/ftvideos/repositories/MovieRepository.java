package com.devgustavo.ftvideos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devgustavo.ftvideos.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
