package com.sampleproject.service;


import com.sampleproject.domain.Team;
import com.sampleproject.dto.TeamDto;
import com.sampleproject.repo.TeamRepo;
import com.sampleproject.util.IplCricketUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TeamServiceImpl implements  TeamService {

  private final TeamRepo teamRepo;

  @Override
  public TeamDto addTeam(TeamDto teamDto) {
    Team team = IplCricketUtil.toDomain(teamDto,Team.class);
    team = teamRepo.save(team);
    teamDto = IplCricketUtil.toDto(team,TeamDto.class);
    log.info("Team saved with label :{}",team.getTeamLabel());
    return teamDto;
  }

  @Override
  public TeamDto getTeam(String teamLabel) {
    Optional<Team> optTeam = teamRepo.findById(teamLabel);
    if(optTeam.isPresent()){
          Team team = optTeam.get();
          TeamDto teamDto = IplCricketUtil.toDto(team,TeamDto.class);
          return teamDto;
    }
    throw new IllegalArgumentException("Invalid team label is provided");
  }
}
