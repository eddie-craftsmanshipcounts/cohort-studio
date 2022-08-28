package com.craftsmanshipcounts.cohortstudio.usecases.cohort;

import java.util.List;

public class StubCohortRepository implements CohortRepository
{

	private List<Cohort> listOfCohorts;

	public StubCohortRepository(List<Cohort> listOfCohorts)
	{
		this.listOfCohorts = listOfCohorts;
	}

	@Override
	public List<Cohort> listCohorts()
	{
		return listOfCohorts;
	}
}