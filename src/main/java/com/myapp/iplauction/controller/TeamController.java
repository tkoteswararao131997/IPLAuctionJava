package com.myapp.iplauction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.iplauction.ServiceInf.ITeamService;
import com.myapp.iplauction.model.Team;

@RestController
@RequestMapping("/api/team")
public class TeamController {
	
	@Autowired
	ITeamService iTeamService;
	
	public TeamController(ITeamService _iTeamService) {
		iTeamService = _iTeamService;
	}
	
	@PostMapping("/addteam")
	public ResponseEntity<String> addTeam(@RequestBody Team team) {
		String result = iTeamService.addTeam(team);
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	@PutMapping("/updateteam/{id}")
	public ResponseEntity<String> updateTeam(@PathVariable Long id, @RequestBody Team team) {
		String result = iTeamService.updateTeam(id, team);
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	@GetMapping("/getteams")
	public ResponseEntity<List<Team>> getTeams() {
		List<Team> teams = iTeamService.getTeams();
		return new ResponseEntity<>(teams,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteteam/{id}")
	public ResponseEntity<String> deleteTeam(@PathVariable long id) {
		String result = iTeamService.deleteTeam(id);
		return new ResponseEntity<>(result,HttpStatus.OK);
	}
	
	

}
