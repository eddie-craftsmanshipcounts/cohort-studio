package com.craftsmanshipcounts.cohortstudio.usecases.cohort;

import java.util.List;

public class ViewCohortsResponse
{
	public final List<CohortDTO> cohorts;

	public ViewCohortsResponse(List<CohortDTO> cohorts)
	{
		this.cohorts = cohorts;
	}
}
