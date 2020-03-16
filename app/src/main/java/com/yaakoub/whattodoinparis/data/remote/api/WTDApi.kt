package com.yaakoub.whattodoinparis.data.remote.api

import com.yaakoub.whattodoinparis.data.remote.entities.WTDResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface WTDApi {

    @GET("search/?dataset=que-faire-a-paris-")
    fun getAll():Deferred<WTDResponse>

}