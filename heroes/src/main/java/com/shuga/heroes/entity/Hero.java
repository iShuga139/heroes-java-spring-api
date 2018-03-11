package com.shuga.heroes.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Hero {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private Boolean status;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER, optional = false, targetEntity = Sidekick.class)
	@PrimaryKeyJoinColumn
	private Sidekick sidekick;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Sidekick getSidekick() {
		return sidekick;
	}

	public void setSidekick(Sidekick sidekick) {
		this.sidekick = sidekick;
	}

}
