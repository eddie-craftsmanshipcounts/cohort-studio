package com.craftsmanshipcounts.cohortstudio.usecases.cohort;

import com.craftsmanshipcounts.util.SpyPresenter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static com.craftsmanshipcounts.cohortstudio.usecases.cohort.StubCohortRepository.EMPTY_COHORT_REPOSITORY_STUB;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;

@ExtendWith(MockitoExtension.class)
public class ViewCohortsTest
{
	@Test
	void shouldHaveNoCohorts_whenNoCohortsExist() throws Exception {
		var testee = new ViewCohorts(EMPTY_COHORT_REPOSITORY_STUB);
		var request = new ViewCohortsRequest();
		var presenter = new SpyPresenter<ViewCohortsResponse>();

		testee.perform(request, presenter);

		var response = presenter.response;
		assertThat("presenter was not called",
			presenter.wasCalled(), is(true));
		assertThat("cohorts was not empty",
			response.cohorts, is(empty()));
	}
	
	@Test
	void shouldHaveSomeCohorts_whenCohortsExist() throws Exception {
		var testee = new ViewCohorts(new StubCohortRepository(
			List.of(new Cohort(
				new CohortId(1L),
				new CohortTeamName("Fighting Tigers"))
		)));
		var request = new ViewCohortsRequest();
		var presenter = new SpyPresenter<ViewCohortsResponse>();

		testee.perform(request, presenter);

		var response = presenter.response;
		assertThat("presenter was not called",
			presenter.wasCalled(), is(true));
		assertThat("cohorts was not empty",
			response.cohorts, is(not(empty())));
		CohortDTO cohortDTO = response.cohorts.get(0);
		assertThat(cohortDTO.getId(), is(1L));
		assertThat(cohortDTO.getTeamName(), is("Fighting Tigers"));
	}
}
