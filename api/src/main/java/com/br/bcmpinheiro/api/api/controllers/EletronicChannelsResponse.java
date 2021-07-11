package com.br.bcmpinheiro.api.api.controllers;

public class EletronicChannelsResponse {
	 private Data data;
	 private Links links;
	 private Meta meta;

	// TODO: check if is necessary to create settter
	  public EletronicChannelsResponse() {
	  }

	  public Data getData() {
	    return data;
	  }

	  public Links getLinks() {
		  return links;
	  }
	  
	  public Meta getMeta() {
		  return meta;
	  }
	  
	  @Override
	  public String toString() {
	    return "EletronicChannelsResponse{" + 
	    	   "data="+data+ '\'' + 
	    	   ", links=" + links + '\'' +
	    	   ", meta=" + meta + '\'' +
	    	   '}';
	  }
	  
}
