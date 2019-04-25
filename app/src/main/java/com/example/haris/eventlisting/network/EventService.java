package com.example.haris.eventlisting.network;

import com.example.haris.eventlisting.model.EventResult;
import com.example.haris.eventlisting.model.Header;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EventService {
    @GET("event")
    Observable<EventResult> getEvent();
   // @GET("authentication/generate?client_id=androidtestapi&client_secret=9f36ed23e4a9249dece874a22e6dfd37")
    @GET("authentication/generate")
    Observable<Header> getHeader(
            @Query("client_id") String client_id,
            @Query("client_secret")String client_secret );
}
