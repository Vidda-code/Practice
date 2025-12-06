package com.example.practice.data.api

import com.example.practice.data.model.Comments
import retrofit2.http.GET

interface ApiService {
    @GET("comments")
    suspend fun getComments(): List<Comments>
}