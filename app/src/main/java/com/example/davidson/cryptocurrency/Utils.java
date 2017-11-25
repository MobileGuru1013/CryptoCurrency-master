package com.example.davidson.cryptocurrency;

/**
 * Created by davidson on 10/31/17.
 */

public class Utils {

    public int getImageId(String country){

        int countryId = 0;


        switch (country){
            case "Nigerian Naira":{
                countryId = R.drawable.nigeria;
                break;
            }
            case "US Dollar" :{
                countryId = R.drawable.flag;
                break;
            }
            case "Euro":{
                countryId = R.drawable.flageuro;
                break;
            }
            case "JAPANESE YEN":{
                countryId = R.drawable.japan;
                break;
            }
            case "British Pound":{
                countryId = R.drawable.unitedkingdom;
                break;
            }
            case "Australian Dollar":{
                countryId = R.drawable.australia;
                break;
            }
            case "Canadian Dollar":{
                countryId = R.drawable.canada;
                break;
            }
            case "New Zealand Dollar":{
                countryId = R.drawable.newzealand;
                break;
            }
            case "Singapore Dollar":{
                countryId = R.drawable.singapore;
                break;
            }
            case "Hong Kong Dollar":{
                countryId = R.drawable.hongkong;
                break;
            }
            case "South African Rand":{
                countryId = R.drawable.southafrica;
                break;
            }
            case "Brazilian real":{
                countryId = R.drawable.brazil;
                break;
            }
            case "Indian rupee":{
                countryId = R.drawable.india;
                break;
            }
            case "Russian ruble":{
                countryId = R.drawable.russia;
                break;
            }
            case "Turkish lira":{
                countryId = R.drawable.turkey;
                break;
            }
            case "South Korean":{
                countryId = R.drawable.southkorea;
                break;
            }
            case "Norwegian Krone":{
                countryId = R.drawable.norway;
                break;
            }
            case "Mexican Peso":{
                countryId = R.drawable.mexican;
                break;
            }
            case "Swedish krona":{
                countryId = R.drawable.sweden;
                break;
            }
            case "Swiss Franc":{
                countryId = R.drawable.swissflag;
                break;
            }
        }
        return countryId;
    }
}
