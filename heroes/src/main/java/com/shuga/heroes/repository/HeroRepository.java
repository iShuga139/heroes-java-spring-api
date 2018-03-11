package com.shuga.heroes.repository;

import org.springframework.data.repository.CrudRepository;

import com.shuga.heroes.entity.Hero;

public interface HeroRepository extends CrudRepository<Hero, Long> {

}