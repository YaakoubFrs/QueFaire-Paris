package com.yaakoub.whattodoinparis.data.remote.entities

data class Fields(
    val access_link: String,
    val access_type: String,
    val address_city: String,
    val address_name: String,
    val address_street: String,
    val address_zipcode: String,
    val blind: Int,
    val category: String,
    val contact_facebook: String,
    val contact_mail: String,
    val contact_name: String,
    val contact_phone: String,
    val cover: Cover,
    val cover_url: String,
    val date_description: String,
    val date_end: String,
    val date_start: String,
    val deaf: Int,
    val description: String,
    val id: String,
    val lat_lon: List<Double>,
    val lead_text: String,
    val occurrences: String,
    val pmr: Int,
    val price_detail: String,
    val price_type: String,
    val tags: String,
    val title: String,
    val transport: String,
    val updated_at: String,
    val url: String
)