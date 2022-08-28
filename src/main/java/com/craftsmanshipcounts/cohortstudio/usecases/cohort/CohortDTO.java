package com.craftsmanshipcounts.cohortstudio.usecases.cohort;

public class CohortDTO
{
	private final Long id;
	private final String teamName;

	public CohortDTO(Long id, String teamName)
	{
		this.id = id;
		this.teamName = teamName;
	}

	public Long getId()
	{
		return id;
	}

	public String getTeamName()
	{
		return teamName;
	}
}
