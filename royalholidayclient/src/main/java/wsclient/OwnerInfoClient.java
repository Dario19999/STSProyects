package wsclient;

import generated.ArrayOfInfoCuenta;
import generated.SearchOwnerRQ;
import generated.SearchOwnerRS;

public class OwnerInfoClient{
	
	public ArrayOfInfoCuenta setSearchParams(SearchOwnerRQ info) {
		
		SearchOwnerRS response = new SearchOwnerRS();
		response.setParametroBuscar(info);
		return response.getInfoCuenta();
		
	}
}
