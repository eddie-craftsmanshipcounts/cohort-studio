package com.craftsmanshipcounts.cohortstudio.usecases;

import java.util.List;

public class StubCohortRepository implements CohortRepository
{
	public StubCohortRepository()
	{
	}

	@Override
	public List<Cohort> listCohorts()
	{
		return List.of();
	}
}