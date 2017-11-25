package com.example.davidson.cryptocurrency;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.davidson.cryptocurrency.CurrencyAdapter.EtereumAdapter;
import com.example.davidson.cryptocurrency.interfaces.ExchangeService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class EthereumFragment extends Fragment implements Callback<CurrencyExchange> {


    private RecyclerView recyclerView;
    private ProgressBar progressBar;

    private FloatingActionButton refreshButton;

    String fsym = "ETH";
    String tsyms = "NGN" + "," + "USD" +
            "," + "EUR" + "," + "JPY" + "," +
            "GBP" + "," + "AUD" + "," + "CAD" + "," +
            "CHF" + "," + "SEK" + "," + "NZD" + "," +
            "MXN" + "," + "SGD" + "," + "HKD" + "," +
            "NOK" + "," + "KRW" + "," + "TRY" + "," +
            "RUB" + "," + "INR" + "," + "BRL" + "," + "ZAR";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ethereum, null);
        recyclerView =  view.findViewById(R.id.recyclerview);
        progressBar =  view.findViewById(R.id.progress_bar);

        refreshButton = view.findViewById(R.id.fab);
        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                loadBTCExchangeData();
            }
        });

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        progressBar.setVisibility(View.VISIBLE);
        loadBTCExchangeData();
    }

    private void loadBTCExchangeData(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://min-api.cryptocompare.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ExchangeService service = retrofit.create(ExchangeService.class);
        Call<CurrencyExchange> call = service.loadCurrencyExchange(fsym,tsyms);
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<CurrencyExchange> call, Response<CurrencyExchange> response) {
        progressBar.setVisibility(View.INVISIBLE);
        CurrencyExchange currencyExchange = response.body();
        recyclerView.setAdapter(new EtereumAdapter(getContext(), currencyExchange.getCurrencyList()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
    }
    @Override
    public void onFailure(Call<CurrencyExchange> call, Throwable t) {
        progressBar.setVisibility(View.INVISIBLE);
        Toast.makeText(getContext(), "Poor or no internet connection", Toast.LENGTH_SHORT).show();
    }

}
