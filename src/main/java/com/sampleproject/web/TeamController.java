package com.sampleproject.web;


import com.sampleproject.dto.TeamDto;
import com.sampleproject.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/team")
public class TeamController {
        @Autowired
        private TeamService teamService;
        @PostMapping
        public ResponseEntity<TeamDto> addTeam(@RequestBody TeamDto teamDto){
                return ResponseEntity.ok(teamService.addTeam(teamDto));
        }

        @GetMapping("/{teamLabel}")
        public ResponseEntity<TeamDto> addTeam(@PathVariable String teamLabel){
                return ResponseEntity.ok(teamService.getTeam(teamLabel));
        }

}
