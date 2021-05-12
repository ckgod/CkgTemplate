package com.ckg.ckgtemplate.api

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitCreator {
    companion object {
        var TEST_URL = ""
        var REAL_URL = ""

        private fun defaultRetrofit(): Retrofit {
            var gson = GsonBuilder().setLenient().create()
            return Retrofit.Builder()
                .baseUrl(TEST_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(createOkHttpClient())
                .build()
        }

        fun <T> create(service: Class<T>): T {
            return defaultRetrofit().create(service)
        }

        private fun createOkHttpClient(): OkHttpClient {
            return OkHttpClient.Builder()
                .readTimeout(5000, TimeUnit.MILLISECONDS)
                .connectTimeout(5000, TimeUnit.MILLISECONDS)
                .addNetworkInterceptor(TokenInterceptor())
                .build()
        }
    }
}