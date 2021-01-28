package com.annyDummy.imagesearchapp.api

import com.annyDummy.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)