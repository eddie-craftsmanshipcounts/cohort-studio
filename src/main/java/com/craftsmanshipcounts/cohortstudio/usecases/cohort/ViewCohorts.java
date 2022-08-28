package com.craftsmanshipcounts.cohortstudio.usecases.cohort;

import java.util.List;
import java.util.stream.Collectors;

public class ViewCohorts
{
	private final CohortRepository cohortRepository;

	public ViewCohorts(CohortRepository cohortRepository)
	{
		this.cohortRepository = cohortRepository;
	}

	public void perform(ViewCohortsRequest request, Presenter<ViewCohortsResponse> presenter)
	{
		present(presenter, toCohortDTOs(allCohorts()));
	}

	private List<Cohort> allCohorts()
	{
		return cohortRepository.listCohorts();
	}

	private List<CohortDTO> toCohortDTOs(List<Cohort> cohorts)
	{
		return cohorts.stream()
			.map(this::toCohortDTO)
			.collect(Collectors.toList());
	}

	private CohortDTO toCohortDTO(Cohort cohort)
	{
		return new CohortDTO(cohort.id().value(), cohort.teamName().value());
	}

	private static void present(Presenter<ViewCohortsResponse> presenter, List<CohortDTO> allCohortDTOs)
	{
		presenter.present(new ViewCohortsResponse(allCohortDTOs));
	}
}
