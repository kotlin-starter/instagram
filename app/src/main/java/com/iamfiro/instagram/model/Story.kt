package com.iamfiro.instagram.model

data class Story(
    val user: User,
    val viewed: Boolean,
    val closedFriendStory: Boolean,
)