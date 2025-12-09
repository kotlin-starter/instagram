package com.iamfiro.instagram.model

data class Article(
    val user: User,
    val image: Int,
    val like: Int,
    val comment: Int,
    val content: String,
)