package com.allstate.gerardhackettquotes.quotes.repo;

import com.allstate.gerardhackettquotes.quotes.entities.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;


public interface QuoteRepository  extends JpaRepository<Quote, Integer> {

    Collection<Quote> findQuotationByLastName(String lastName);

}
