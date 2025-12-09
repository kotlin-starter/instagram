package com.iamfiro.instagram.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import com.iamfiro.instagram.R

@Composable
fun InstagramLogo(height: Dp) {
    if(isSystemInDarkTheme()) {
        Image(painter = painterResource(R.drawable.instagram_white), "인스타그램 로고", modifier = Modifier.height(height))
    } else {
        Image(painter = painterResource(R.drawable.instagram_black), "인스타그램 로고", modifier = Modifier.height(height))
    }
}