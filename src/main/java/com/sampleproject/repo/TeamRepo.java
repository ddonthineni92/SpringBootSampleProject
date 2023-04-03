package com.sampleproject.repo;


import com.sampleproject.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepo extends JpaRepository<Team,String> {
}
