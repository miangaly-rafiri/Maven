package com.boostup.quotapi.repository;

import com.boostup.quotapi.models.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface QuoteRepository extends JpaRepository<Quote, Long> {
}
