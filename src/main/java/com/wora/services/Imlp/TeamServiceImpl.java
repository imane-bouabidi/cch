package com.wora.services.Imlp;

import com.wora.models.dto.TeamDTO;
import com.wora.models.entities.Team;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wora.repositories.TeamRepo;
import com.wora.services.TeamService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepo teamRepo;
    @Autowired
    private ModelMapper modelMapper;

    public TeamDTO createTeam(TeamDTO teamDTO){
        Team team = modelMapper.map(teamDTO, Team.class);
        team = teamRepo.save(team);
        return modelMapper.map(team, TeamDTO.class);
    }
    public TeamDTO updateTeam(Long id, TeamDTO teamDTO){
        Team team = teamRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("Team not found"));
        modelMapper.map(teamDTO, team);
        Team savedTeam = teamRepo.save(team);
        return modelMapper.map(savedTeam, TeamDTO.class);
    }
    public void deleteTeam(Long id){
        Team team = teamRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Team not found"));
        teamRepo.delete(team);
    }
    public List<TeamDTO> getTeams(){
        List<Team> teams = teamRepo.findAll();
        return teams.stream()
                .map(team -> modelMapper.map(team,TeamDTO.class)).collect(Collectors.toList());

    }

}
