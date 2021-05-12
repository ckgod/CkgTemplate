package com.ckg.ckgtemplate.api

import android.util.Log
import com.ckg.ckgtemplate.ApplicationClass.Companion.X_ACCESS_TOKEN
import com.ckg.ckgtemplate.ApplicationClass.Companion.spToken
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class TokenInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val builder: Request.Builder = chain.request().newBuilder()
        if (spToken == null) {
//            Log.e("[Log.e] ", "sp is null in Interceptor")
        }
        val jwtToken: String? = spToken?.getString(X_ACCESS_TOKEN, null)
//        Log.e("[Log.e] tag : ", "$jwtToken ")
        if (jwtToken != null) {
            builder.addHeader("X-ACCESS-TOKEN", jwtToken)
//            Log.e("[Log.e] tag : ", "add header")
        }
        return chain.proceed(builder.build())
    }
}