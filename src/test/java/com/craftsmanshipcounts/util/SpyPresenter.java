package com.craftsmanshipcounts.util;

import com.craftsmanshipcounts.cohortstudio.usecases.cohort.Presenter;

public class SpyPresenter<T>
	implements Presenter<T>
{
	private boolean wasCalled = false;
	public T response;

	@Override
	public void present(T response) {
		this.response = response;
		this.wasCalled = true;
	}

	public boolean wasCalled()
	{
		return wasCalled;
	}
}
