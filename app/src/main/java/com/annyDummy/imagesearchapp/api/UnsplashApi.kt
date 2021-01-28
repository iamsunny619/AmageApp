package com.annyDummy.imagesearchapp.api

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    companion object {
        const val BASE_URL = "https://api.unsplash.com/"
        const val CLIENT_ID = "NV-qYaYVjNeR9HAq8ACuh6zQsV1-lSz9LgbbH9rm0lo"  //there's, an un predicted error is occurred that's why i use a normal string fro api key, in future i will change.
    }

   @Headers("Accept-Version: v1", "Authorization: Client-ID $CLIENT_ID")
    @GET("search/photos")
    suspend fun searchPhotos(
        @Query("query") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): UnsplashResponse
}