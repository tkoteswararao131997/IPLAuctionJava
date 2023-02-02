package com.myapp.iplauction.ServiceInf;

import java.util.List;
import com.myapp.iplauction.model.Team;

public interface ITeamService {
	
	public String addTeam(Team team);

	public String updateTeam(Long id, Team team);

	public List<Team> getTeams();

	public String deleteTeam(long id);

}
