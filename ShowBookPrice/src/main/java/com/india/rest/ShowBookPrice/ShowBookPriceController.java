package com.india.rest.ShowBookPrice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowBookPriceController
{
	private static Logger log = LoggerFactory.getLogger(ShowBookPriceController.class);
	@Value(value="${server.port}")
	String serverport;
    @GetMapping("/bookPrice/{bookId}")
    public BookPriceInfo getBookPriceeInfo(@PathVariable int bookId)
     {
    	log.info("called ShowBookPriceController getBookPriceeInfo method");
    	BookPriceInfo  priceInfo = new BookPriceInfo(bookId,12346,10.2,serverport);
    	
  	
    	return priceInfo;
     }
}
