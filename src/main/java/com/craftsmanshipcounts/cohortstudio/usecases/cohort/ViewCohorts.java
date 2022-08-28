package com.craftsmanshipcounts.cohortstudio.usecases;

import java.util.List;

public class ViewCohorts
{
	private final CohortRepository cohortRepository;

	public ViewCohorts(CohortRepository cohortRepository)
	{
		this.cohortRepository = cohortRepository;
	}

	public void perform(ViewCohortsRequest request, Presenter<ViewCohortsResponse> presenter)
	{
		final List<Cohort> cohorts = cohortRepository.listCohorts();
		presenter.present(new ViewCohortsResponse(cohorts));
	}
}
