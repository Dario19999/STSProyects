package wsclient;

import generated.OwnerInformation;
import generated.OwnerInformationSoap;
import generated.SearchOwner;
import generated.SearchOwnerRQ;
import generated.SearchOwnerResponse;

public class OwnerInfoClient{
	
	public void setSearchParams() {
		
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
		
		OwnerInformationSoap servicio = new OwnerInformation().getOwnerInformationSoap();
		servicio.searchOwner(setInfo);
		
		SearchOwnerResponse response = new SearchOwnerResponse();
		System.out.println(response.getSearchOwnerResult());
	}
	

}
