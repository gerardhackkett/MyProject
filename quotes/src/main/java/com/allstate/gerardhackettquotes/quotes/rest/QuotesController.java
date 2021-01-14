package com.allstate.gerardhackettquotes.quotes.rest;


import com.allstate.gerardhackettquotes.quotes.entities.Quote;
import com.allstate.gerardhackettquotes.quotes.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/quotes")
public class QuotesController {

    @Autowired
    private QuoteService quoteService;


    @GetMapping("/{lastName}")
    public Collection<Quote> getQuotesByLastName(@PathVariable String lastName) {
        return quoteService.getQuotesByLastName(lastName);
    }




    @GetMapping
    public Collection<Quote> getAllQuotes() {
        return quoteService.getAllQuotes();
    }


    @PostMapping
    public Quote getQuote(@RequestBody Quote quotation) {
        Quote newQuote = quoteService.getQuote(quotation);
        return newQuote;
        /*try {
            Quote newQuote = quoteService.getQuotation(quotation);
            return new ResponseEntity<Quote>(newQuote, HttpStatus.CREATED);
        }
        catch (Exception ex) {
            return new ResponseEntity<Quote>(HttpStatus.INTERNAL_SERVER_ERROR);
        }*/
    }
}