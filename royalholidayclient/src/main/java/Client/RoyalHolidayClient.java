package Client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import generated.OwnerInformation;
import generated.OwnerInformationSoap;
import generated.SearchOwnerRQ;
import generated.SearchOwnerRS;

public class RoyalHolidayClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(RoyalHolidayClient.class);
	
	public SearchOwnerRS getOwnerInfo(SearchOwnerRQ objetoParametro) {
		
		OwnerInformationSoap request = new OwnerInformation().getOwnerInformationSoap();
		request.searchOwner(objetoParametro);
		
		log.info("buscando a " + objetoParametro.getCadenaBusqueda());
		
		SearchOwnerRS response = (SearchOwnerRS) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8081/ws/ownerInfo", request,
						new SoapActionCallback("http://tempuri.org/searchOwner"));
		
		return response;
	}
}

