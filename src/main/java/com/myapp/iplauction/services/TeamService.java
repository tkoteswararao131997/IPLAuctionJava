package com.myapp.iplauction.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myapp.iplauction.ServiceInf.ITeamService;
import com.myapp.iplauction.model.Team;
import com.myapp.iplauction.repository.ITeamRepository;

import jakarta.transaction.Transactional;

@Service
public class TeamService implements ITeamService {
	
	@Autowired
	ITeamRepository iTeamRepository;
	
	@Override
	public String addTeam(Team team) {
		try {
		iTeamRepository.save(team);
		}
		catch(Exception e){
			return "unable to add the team";
		}
		return "Team added";
	}
	
	@Transactional
	@Override
	public String updateTeam(Long id, Team team) {
		Team existingTeam = iTeamRepository.getTeamById(id);
		if(existingTeam==null)
			return "unable to find a team with id:"+id;
		team.setId(existingTeam.getId());
		BeanUtils.copyProperties(team, existingTeam);
		iTeamRepository.save(existingTeam);
		return "Team Updated";
	}

	@Override
	public List<Team> getTeams() {
		return iTeamRepository.findAll();
	}

	@Override
	public String deleteTeam(long id) {
		Team existingTeam = iTeamRepository.getTeamById(id);
		if(existingTeam==null)
			return "unable to find a team with id:"+id;
		iTeamRepository.deleteById(id);
		return "Team Deleted";
	}
	
	
	
}
