package com.br.bcmpinheiro.api.api.controllers;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/open-banking")
public class OpenBankingController {
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	@GetMapping("/brands")
	public EletronicChannelsResponse getBrands() {
		
		String url = "https://api.itau/open-banking/channels/v1/electronic-channels";
		// ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		EletronicChannelsResponse response = restTemplate().getForObject(url, EletronicChannelsResponse.class);
		return response;
	}
}
