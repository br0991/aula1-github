package model.entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	private Integer numeroDoQuarto;
	private Date checkin;
	private Date checkout;

	public Reserva() {

	}

	public Reserva(Integer numeroDoQuarto, Date checkin, Date checkout) {

		this.numeroDoQuarto = numeroDoQuarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getNumeroDoQuarto() {
		return numeroDoQuarto;
	}

	public void setNumeroDoQuarto(Integer numeroDoQuarto) {
		this.numeroDoQuarto = numeroDoQuarto;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public long duracao() {

		long diff = checkout.getTime() - checkin.getTime();
		System.out.println(diff);
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public void atualziarDatas(Date checkin, Date checkout) {

		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString(){
		StringBuilder build = new StringBuilder();
		build.append("Quarto.: " + numeroDoQuarto);
		build.append(" , Check-in.: " + checkin);
		build.append(" , Check-out.: " + checkout);
		build.append(" ," + duracao() + " noites");
		return build.toString();
	}
}
