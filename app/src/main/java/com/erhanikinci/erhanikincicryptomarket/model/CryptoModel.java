package com.erhanikinci.erhanikincicryptomarket.model;

import com.google.gson.annotations.SerializedName;


public class CryptoModel {

    @SerializedName("id")
    public String id;

    @SerializedName("currency")
    public String currency;

    @SerializedName("symbol")
    public String symbol;

    @SerializedName("name")
    public String name;

    @SerializedName("logo_url")
    public String logo_url;

    @SerializedName("status")
    public String status;

    @SerializedName("price")
    public String price;

    @SerializedName("price_date")
    public String price_date;


    @SerializedName("price_timestamp")
    public String price_timestamp;

    @SerializedName("circulating_supply")
    public String circulating_supply;

    @SerializedName("max_supply")
    public String max_supply;

    @SerializedName("market_cap")
    public String market_cap;


    @SerializedName("market_cap_dominance")
    public String market_cap_dominance;

    @SerializedName("num_exchanges")
    public String num_exchanges;

    @SerializedName("num_pairs")
    public String num_pairs;

    @SerializedName("num_pairs_unmapped")
    public String num_pairs_unmapped;

    @SerializedName("first_candle")
    public String first_candle;


    @SerializedName("first_trade")
    public String first_trade;

    @SerializedName("first_order_book")
    public String first_order_book;

    @SerializedName("rank")
    public String rank;

    @SerializedName("rank_delta")
    public String rank_delta;

    @SerializedName("high")
    public String high;

    @SerializedName("high_timestamp")
    public String high_timestamp;






}
