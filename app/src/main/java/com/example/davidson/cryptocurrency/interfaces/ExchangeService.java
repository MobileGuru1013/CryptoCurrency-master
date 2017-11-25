package com.example.davidson.cryptocurrency.interfaces;

import com.example.davidson.cryptocurrency.CurrencyExchange;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface ExchangeService {
    @GET("data/price?")
    Call<CurrencyExchange> loadCurrencyExchange(@Query("fsym") String coins, @Query("tsyms") String currency);
}
