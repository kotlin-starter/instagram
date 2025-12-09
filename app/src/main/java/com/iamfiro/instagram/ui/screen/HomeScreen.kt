package com.iamfiro.instagram.ui.screen

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iamfiro.instagram.ui.component.ArticleList
import com.iamfiro.instagram.ui.component.Header
import com.iamfiro.instagram.ui.component.NavigationBar
import com.iamfiro.instagram.ui.component.StoryList

@Composable
fun HomeScreen(innerPadding: PaddingValues) {
    Scaffold(bottomBar = { NavigationBar() }) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.background)
        ) {
            item {
                Header()
                StoryList()
                ArticleList()
                Spacer(Modifier.height(60.dp))
            }
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HomeScreenPreview() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Header()
    }
}