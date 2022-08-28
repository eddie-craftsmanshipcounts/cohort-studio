package com.craftsmanshipcounts.cohortstudio.usecases;

import java.util.List;

public class ViewCohortsResponse
{
	public final List<Cohort> cohorts;

	public ViewCohortsResponse(List<Cohort> cohorts)
	{
		this.cohorts = cohorts;
	}
}
