/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetropoliaAMKgroup02.Backend.controller;

import MetropoliaAMKgroup02.Backend.model.*;
import MetropoliaAMKgroup02.Backend.model.Merkinta.Prior;

import java.util.Calendar;
import java.net.URI;

/**
 *
 * @author heikki
 */
public class TestMerkintaController extends AbstractController {
	
	/**
	 *
	 * @param body
	 * @return
	 */
	@Override
	protected Object sendResponse(URI uri, String body) {

		Merkinta merkinta = new Merkinta("Uusi merkinta");
		
		merkinta.setPaikka("Viipuri");
		merkinta.setSisalto("matka Venäjälle");
		Calendar date = Calendar.getInstance();
		date.set(2019, 8, 21, 7, 21);
		merkinta.setDate(date);
		merkinta.setPrior(Prior.HIGH);
		
		
		return merkinta;
	}
}
