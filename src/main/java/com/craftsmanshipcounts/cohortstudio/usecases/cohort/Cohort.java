package com.craftsmanshipcounts.cohortstudio.usecases.cohort;

public class Cohort
{
	private final CohortId id;
	private final CohortTeamName teamName;

	public Cohort(CohortId id, CohortTeamName teamName)
	{
		this.id = id;
		this.teamName = teamName;
	}
	
	public CohortId id() {
		return id;
	}
	
	public CohortTeamName teamName() {
		return teamName;
	}
}
