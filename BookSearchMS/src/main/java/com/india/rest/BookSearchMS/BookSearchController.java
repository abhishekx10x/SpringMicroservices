package com.india.rest.BookSearchMS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BookSearchController 
{
    private static Logger log = LoggerFactory.getLogger(BookSearchController.class);
    
    @GetMapping("/bookdetails/{bookId}")
    public BookInfo getBookInfo(@PathVariable Integer bookId)
    {
    	log.info("BookSearchController  getBookInfo");
    	BookInfo bookInfo = new BookInfo(bookId, "Master Spring Boot 2", "Srinivas", "JLC", "Java");
    	
    	String baseUrl = "http://localhost:9101";
    	System.out.println("BASE URL : " + baseUrl);
    	String endPoint = baseUrl+"/bookPrice/"+bookId;
    	RestTemplate rtm = new RestTemplate();
    	ResponseEntity<BookPriceInfo> rs = rtm.getForEntity(endPoint, BookPriceInfo.class);
    	BookPriceInfo bpf = rs.getBody();
    	bookInfo.setServerPort(bpf.getServerPort());
    	bookInfo.setOffer(bpf.getOffer());
    	bookInfo.setPrice(bpf.getPrice());
    	
       return bookInfo;
    }
	
	
	
}
