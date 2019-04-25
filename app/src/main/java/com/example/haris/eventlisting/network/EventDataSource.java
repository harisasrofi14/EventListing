package com.example.haris.eventlisting.network;

import com.example.haris.eventlisting.BuildConfig;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class EventDataSource {
    private static EventService service;

    public static EventService getService(final String header) {

        final Retrofit.Builder builder = new Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create());

        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            okHttpClientBuilder.addInterceptor(loggingInterceptor);
        }
        OkHttpClient okHttpClient = okHttpClientBuilder
                .readTimeout(25, TimeUnit.SECONDS)
                .addInterceptor(new Interceptor() {
                    @NotNull
                    @Override
                    public Response intercept(@NotNull Chain chain) throws IOException {
                        return chain.proceed(chain.request()
                                .newBuilder()
                                //.header("Authorization", "HMAC-SHA256 ClientId=androidtestapi, Timestamp=1555988995, Signature=crufSE9XgfC+hRHq50ykY1Z2Xpb6mh86OsPnBgZjusw=")
                                .header("Authorization", header)
                                .build());
                    }
                })
                .build();
        Retrofit retrofit = builder.baseUrl(EventURL.BASE_URL).client(okHttpClient).build();
        service = retrofit.create(EventService.class);
        return service;
    }
}
