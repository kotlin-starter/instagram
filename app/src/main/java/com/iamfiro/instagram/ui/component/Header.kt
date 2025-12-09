package com.iamfiro.instagram.ui.component
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Header() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 16.dp)

    ) {
        InstagramLogo(30.dp)
        Row(horizontalArrangement = Arrangement.spacedBy(22.dp)) {
            Icon(
                imageVector = Icons.Filled.FavoriteBorder,
                contentDescription = "하트 로고",
                modifier = Modifier.size(28.dp)
            )

            Icon(
                imageVector = Icons.AutoMirrored.Filled.Send,
                contentDescription = "하트 로고",
                modifier = Modifier.size(28.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HeaderDarkPreview() {
    Header()
}