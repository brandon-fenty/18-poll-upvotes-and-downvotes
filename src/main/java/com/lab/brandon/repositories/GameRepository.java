package com.lab.brandon.repositories;

import com.lab.brandon.model.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Poll, Long> {
}
