package com.royalholiday.ws.royalholidayclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import generated.SearchOwnerRQ;
import wsclient.OwnerInfoClient;

@SpringBootApplication
public class RoyalholidayclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoyalholidayclientApplication.class, args);
		
		String cadenaBusqueda = "12345";
		String tipoContacto = "12345";
		String ejecutivo = "";
		String token = "0";
		int log = 1;
		int almacenar = 1;
		boolean live = false;
		
		SearchOwnerRQ setInfo = new SearchOwnerRQ();
		setInfo.setCadenaBusqueda(cadenaBusqueda);
		setInfo.setTipoContacto(tipoContacto);
		setInfo.setLogPeticionID(log);
		setInfo.setAlmacenar(almacenar);
		setInfo.setEjecutivo(ejecutivo);
		setInfo.setToken(token);
		setInfo.setLive(live);
		
		OwnerInfoClient test = new OwnerInfoClient();
		test.setSearchParams(setInfo);
	}

}
