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
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public void atualziarDatas(Date checkin, Date checkout) {

		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public String atualizarDatas(Date checkin, Date checkout){
		
		Date dataAtual = new Date();
		if(!checkout.before(dataAtual) || checkout.before(dataAtual)){
			
			return "As datas de reserva devem ser atualizadas para datas futuras";
		}
		
		this.checkout = checkout;
		return null; //Se retornar null não deu nenhum erro !
	}
	
	@Override
	public String toString(){
		StringBuilder build = new StringBuilder();
		System.out.println("RESERVA: ");
		build.append("Quarto.: " + numeroDoQuarto);
		build.append(" , Check-in.: " + checkin);
		build.append(" , Check-out.: " + checkout);
		build.append(" ," + duracao() + " noites");
		return build.toString();
	}
}
