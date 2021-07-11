package com.br.bcmpinheiro.api.api.controllers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Links {

	private String self;
	private String first;
	private String next;
	private String last;
	
  public Links() {
  }

  public Object getLinks() {
    Links links = new Links();
    links.self = this.self;
    links.first = this.first;
    links.next = this.next;
    links.last = this.last;
    
    return links;
  }


//  @Override
//  public String toString() {
//    return "Links{" +
//        "self='" + self +
//        "', first='" + first + "', next='" + next + "', last='" + last + '\'' + '}';
//  }
}