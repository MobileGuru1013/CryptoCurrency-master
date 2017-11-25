package com.example.davidson.cryptocurrency.CurrencyAdapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.davidson.cryptocurrency.ConversionActivityBitcoin;
import com.example.davidson.cryptocurrency.ConversionActivityEthereum;
import com.example.davidson.cryptocurrency.CurrencyExchange;
import com.example.davidson.cryptocurrency.R;
import com.example.davidson.cryptocurrency.Utils;
import com.example.davidson.cryptocurrency.model.Currency;

import java.util.ArrayList;

/**
 * Created by davidson on 10/31/17.
 */

public class EtereumAdapter extends RecyclerView.Adapter<EtereumAdapter.ViewHolder> {
    private Context mContext;

    private ArrayList<Currency> mList;


    public EtereumAdapter(Context mContext, ArrayList<Currency> mList) {
        this.mContext = mContext;
        this.mList = mList;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_ethereum, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Currency currency = mList.get(position);
        holder.currencyName.setText(currency.getName());
        holder.currencyAmount.setText(String.valueOf(currency.getRate()));
        Glide.with(mContext).load(new Utils().getImageId(currency.getName())).into(holder.currencyImage);
    }

    @Override
    public int getItemCount() {

        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView currencyName,currencyAmount;
        ImageView currencyImage;


        public ViewHolder(View itemView) {
            super(itemView);
            currencyImage = itemView.findViewById(R.id.flag_image_view);
            currencyName = itemView.findViewById(R.id.currency_name);
            currencyAmount = itemView.findViewById(R.id.currency_amount);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Currency currency= mList.get(getAdapterPosition());
                    Context context = view.getContext();
                    Intent intent = new Intent(context, ConversionActivityEthereum.class);
                    intent.putExtra(ConversionActivityBitcoin.EXTRA_POSITION, getAdapterPosition());
                    intent.putExtra("currency_rate", currency.getRate());
                    context.startActivity(intent);
                }
            });
        }
    }
}
