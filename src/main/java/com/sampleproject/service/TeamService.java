package com.sampleproject.service;


import com.sampleproject.dto.TeamDto;

public interface TeamService {

        public TeamDto addTeam(TeamDto teamDto);
        public TeamDto getTeam(String teamLabel);
}
