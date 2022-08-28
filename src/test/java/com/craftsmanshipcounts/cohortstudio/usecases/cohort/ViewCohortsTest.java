package com.craftsmanshipcounts.cohortstudio.usecases;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;

@ExtendWith(MockitoExtension.class)
public class ViewCohortsTest
{
	@Test
	void shouldHaveNoCohorts_whenNoCohortsExist() throws Exception {
		var testee = new ViewCohorts(new StubCohortRepository());
		var request = new ViewCohortsRequest();
		var presenter = new SpyPresenter<ViewCohortsResponse>();

		testee.perform(request, presenter);

		var response = presenter.response;
		assertThat("presenter was not called",
			presenter.wasCalled(), is(true));
		assertThat("cohorts was not empty",
			response.cohorts, is(empty()));
	}
}
