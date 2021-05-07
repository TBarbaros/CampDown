package eTicaretSimulation.business.concretes;

import eTicaretSimulation.business.abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void send(String message, String to) {
		System.out.println("E-posta Manager : " + message + " mesajý " + to + " adresine gönderildi");
	}

}
