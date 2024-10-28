package com.wora.services;


import com.wora.models.dto.TeamDTO;

import java.util.List;

public interface TeamService {
    TeamDTO createTeam(TeamDTO TeamDTO);
    TeamDTO updateTeam(Long id, TeamDTO TeamDTO);
    void deleteTeam(Long id);
    List<TeamDTO> getTeams();
}
