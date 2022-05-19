package ar.edu.unlp.info.oo1.ejercicio14_intervaloDeTiempo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements Date{
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate aDateFrom, LocalDate aDateTo) {
		fromTo(aDateFrom,aDateTo);
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	private void fromTo(LocalDate aDateFrom, LocalDate aDateTo) {
		this.from = aDateFrom;
		this.to = aDateTo;
	}
	
	
	public int sizeInDays() {
		return (int) this.getFrom().until(getTo(),ChronoUnit.DAYS);
	}
	
	public boolean includesDate(LocalDate other) {
		if(other.isAfter(getFrom()) && other.isBefore(getTo()))
			return true;
		else
			return false;
	}
}
