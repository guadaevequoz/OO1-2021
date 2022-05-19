package ar.edu.unlp.info.oo1.ejercicio14_intervaloDeTiempo;

import java.time.LocalDate;

public interface Date {
	public int sizeInDays();
	public boolean includesDate(LocalDate other);
	public LocalDate getFrom();
}
