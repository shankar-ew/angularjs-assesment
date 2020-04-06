package com.covid.dashboard.domain;

public class User {
	private String Country;
	private String TotalCases;
	private String NewCases;
	private String TotalDeaths;
	private String NewDeaths;
	private String TotalRecovered;
	private String ActiveCases;
	private String Serious;
	private String TotCasespop;
	private String Deathspop;
	private String ReportedCase;
	
	@Override
	public String toString() {
		return "App [Country=" + Country+ ", TotalCases=" + TotalCases+ ", NewCases=" + NewCases+ 
				", TotalDeaths=" + TotalDeaths+ ", NewDeaths=" + NewDeaths+ ", TotalRecovered=" + TotalRecovered+ 
				", ActiveCases=" + ActiveCases+ ", Serious=" + Serious+ ", TotCasespop=" + TotCasespop+ 
				", Deathspop=" + Deathspop+ ", ReportedCase=" + ReportedCase+ "]";
	}

	public String getCountry() {
		return Country;
	}

	
	
	  public void setCountry(String Country) {
		  this.Country= Country; 
		  }
	  
	 
	public String getTotalCases() {
		return TotalCases;
	}

	public void setUserName(String TotalCases) {
		this.TotalCases= TotalCases;
	}

	public String getNewCases() {
		return NewCases;
	}

	public void setNewCases(String NewCases) {
		this.NewCases= NewCases;
	}

	public String getTotalDeaths() {
		return TotalDeaths;
	}

	public void setTotalDeaths(String TotalDeaths) {
		this.TotalDeaths= TotalDeaths;
	}

	public String getNewDeaths() {
		return NewDeaths;
	}

	public void setNewDeaths(String NewDeaths) {
		this.NewDeaths= NewDeaths;
	}

	public String getTotalRecovered() {
		return TotalRecovered;
	}

	public void setTotalRecovered(String TotalRecovered) {
		this.TotalRecovered= TotalRecovered;
	}

	public String getActiveCases() {
		return ActiveCases;
	}

	public void setActiveCases(String ActiveCases) {
		this.ActiveCases= ActiveCases;
	}

	public String getSerious() {
		return Serious;
	}

	public void setSerious(String Serious) {
		this.Serious= Serious;
	}

	public String getTotCasespop() {
		return TotCasespop;
	}

	public void setTotCasespop(String phoneNumber) {
		this.TotCasespop= TotCasespop;
	}

	public String getDeathspop() {
		return Deathspop;
	}

	public void setDeathspop(String Deathspop) {
		this.Deathspop= Deathspop;
	}
	
	public String getReportedCase() {
		return ReportedCase;
	}

	public void setReportedCase(String ReportedCase) {
		this.ReportedCase= ReportedCase;
	}

}
