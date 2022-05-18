package com.erhanikinci.erhanikincicryptomarket.service;



import com.erhanikinci.erhanikincicryptomarket.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {

    //GET, POST, UPDATE, DELETE

    //URL BASE -> www.website.com

    // GET -> price?key=xxx

    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json
    //https://api.nomics.com/v1/currencies/ticker?key=f404f862483812178366682e6c47ac3f4ce807e5


    @GET("ticker?key=f404f862483812178366682e6c47ac3f4ce807e5")
    Observable<List<CryptoModel>> getData();




    //Call<List<CryptoModel>> getData();


}
