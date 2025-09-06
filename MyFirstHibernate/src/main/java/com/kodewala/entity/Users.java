package com.kodewala.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Users
{

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;

	@Column
	private String email;

	public long getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

}
