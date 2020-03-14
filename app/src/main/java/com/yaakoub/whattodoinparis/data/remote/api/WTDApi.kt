package com.yaakoub.whattodoinparis.data.remote.api

import WTDResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface WTDApi {

    @GET("search/?dataset=que-faire-a-paris-&facet=category&facet=tags&facet=address_zipcode&facet=address_city&facet=pmr&facet=blind&facet=deaf&facet=access_type&facet=price_type")
    fun getAll():Deferred<WTDResponse>

}