package com.myapp.iplauction.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.myapp.iplauction.model.Team;

@Repository
public interface ITeamRepository extends JpaRepository<Team, Long> {
	
	@Query(value="select * from teams where id=?1",nativeQuery = true)
	Team getTeamById(long id);
	
}
