package com.intercorp.retail.model;

import java.math.BigDecimal;

public class Kpi {

	private BigDecimal average;
	private BigDecimal standardDeviation;

	public Kpi() {
		super();
	}
	public Kpi(BigDecimal average, BigDecimal standardDeviation) {
		super();
		this.average = average;
		this.standardDeviation = standardDeviation;
	}
	public BigDecimal getAverage() {
		return average;
	}
	public void setAverage(BigDecimal average) {
		this.average = average;
	}
	public BigDecimal getStandardDeviation() {
		return standardDeviation;
	}
	public void setStandardDeviation(BigDecimal standardDeviation) {
		this.standardDeviation = standardDeviation;
	}
	
	
}
