package com.iamfiro.instagram.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NavigationBar() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxWidth()
            .height(70.dp)
            .padding(bottom = 16.dp)
    ) {
        Icon(imageVector = Icons.Filled.Home, contentDescription = "Home", Modifier.size(32.dp))
        Icon(imageVector = Icons.Filled.Search, contentDescription = "Search", Modifier.size(32.dp))
        Icon(imageVector = Icons.Filled.Add, contentDescription = "Add", Modifier.size(32.dp))
        Icon(imageVector = Icons.Default.PlayArrow, contentDescription = "Play", Modifier.size(32.dp))
        Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "Account", Modifier.size(32.dp))
    }
}