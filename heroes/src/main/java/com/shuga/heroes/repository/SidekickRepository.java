package com.shuga.heroes.repository;

import org.springframework.data.repository.CrudRepository;

import com.shuga.heroes.entity.Sidekick;

public interface SidekickRepository extends CrudRepository<Sidekick, Long> {

}