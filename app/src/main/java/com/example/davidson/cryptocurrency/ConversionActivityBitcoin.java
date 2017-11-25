package com.example.davidson.cryptocurrency;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ConversionActivityBitcoin extends AppCompatActivity {
    public static final String EXTRA_POSITION = "position";
    TextView rateTextView;
    TextView resultsTextView;
    EditText currencyInput;
    double rate;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_bitcoin);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Set Collapsing Toolbar layout to the screen
        CollapsingToolbarLayout collapsingToolbar = findViewById(R.id.collapsing_toolbar);
        Intent myIntent = getIntent();
        rateTextView = findViewById(R.id.rate);
        resultsTextView = findViewById(R.id.converted);
        currencyInput = findViewById(R.id.currencyInput);

        rate = myIntent.getDoubleExtra("currency_rate", 0);
        rateTextView.setText(String.valueOf("Rate : " + rate));
        int postion = getIntent().getIntExtra(EXTRA_POSITION, 0);

        Resources resources = getResources();

        String[] currencyNames = resources.getStringArray(R.array.currencyNames);


        collapsingToolbar.setTitle(currencyNames[postion % currencyNames.length]);
        collapsingToolbar.setExpandedTitleTextAppearance(R.style.collapsingToolbarLayoutTitleColor);
        TypedArray countryPictures = resources.obtainTypedArray(R.array.country_flags);



        ImageView placePicutre = findViewById(R.id.image);
        ImageView secondImage = findViewById(R.id.flag_image);
        TextView currencyName = findViewById(R.id.currency_name);
        placePicutre.setImageDrawable(countryPictures.getDrawable(postion % countryPictures.length()));
        secondImage.setImageDrawable(countryPictures.getDrawable(postion % countryPictures.length()));
        currencyName.setText(currencyNames[postion % currencyNames.length]);
        countryPictures.recycle();


        currencyInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (currencyInput.getText().toString().length() == 0 || currencyInput.getText().toString().isEmpty()) {
                    resultsTextView.setText("0");
                } else

                    calculate();
            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });
    }


    private  void calculate(){
        if(currencyInput.getText().toString().length() == 0){
            return;
        }

        double input;
        input = Double.parseDouble(currencyInput.getText().toString());

        double output;
        output = input * rate;

        DecimalFormat decimalFormat = new DecimalFormat("#,###,###");
        resultsTextView.setText(decimalFormat.format(output));
    }

}
