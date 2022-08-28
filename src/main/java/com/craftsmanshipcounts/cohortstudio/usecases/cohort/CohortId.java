package com.craftsmanshipcounts.cohortstudio.usecases.cohort;

public class CohortId
{
	private final Long value;

	public CohortId(Long value)
	{
		this.value = value;
	}
	
	public Long value() {
		return value;
	}
}
