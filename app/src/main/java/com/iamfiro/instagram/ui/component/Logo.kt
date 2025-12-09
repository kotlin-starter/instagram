package com.iamfiro.instagram.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import com.iamfiro.instagram.R

@Composable
fun InstagramLogo(height: Dp) {
    Icon(
        painterResource(R.drawable.instagram),
        "Instagram logo",
        modifier = Modifier
            .height(height),
        tint = if(isSystemInDarkTheme())
            Color(0xFFFFFFFF) else Color(0xFF000000)
    )
}