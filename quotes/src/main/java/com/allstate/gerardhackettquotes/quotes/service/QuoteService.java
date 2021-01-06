    package com.allstate.gerardhackettquotes.quotes.service;

    import com.allstate.gerardhackettquotes.quotes.entities.Quote;

    import java.util.Collection;

    public interface QuoteService {

    Quote getQuote(Quote quote);
    //returns quote with a value in it

    Collection<Quote> getAllQuotes();

    Collection<Quote> getQuotesByLastName(String lastName);
}
