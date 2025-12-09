package com.iamfiro.instagram.ui.component

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.iamfiro.instagram.R
import com.iamfiro.instagram.model.Article
import com.iamfiro.instagram.model.User
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.iamfiro.instagram.util.formatNumberCommas

@Composable
fun ArticleList() {
    val articleList = listOf<Article>(
        Article(
            user = User(username = "iroiro_0000", profileImage = R.drawable.ig_profile_iroiro),
            image = R.drawable.ig_article_image,
            like = 3242,
            comment = 412,
            content = "주디홉스입니다🐰"
        ),
        Article(
            user = User(username = "ekke.now", profileImage = R.drawable.ig_profile_ekke),
            image = R.drawable.ig_article_image2,
            like = 291,
            comment = 39,
            content = "\uD83C\uDF53 한국 딸기 맛있는 거 어케 알앗지"
        )
    )

    Column(Modifier.padding(top = 12.dp)) {
        articleList.forEach { article ->
            Article(article = article)
        }
    }
}

@Composable
fun Article(article: Article) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 14.dp, vertical = 10.dp)
                .fillMaxWidth()
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(article.user.profileImage),
                    contentDescription = "${article.user.username}'s Article",
                    modifier = Modifier
                        .size(36.dp)
                        .clip(RoundedCornerShape(9999.dp))
                )
                Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                    Text(
                        article.user.username,
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Medium
                    )
                    Text("회원님을 위한 추천", style = MaterialTheme.typography.bodySmall)
                }
            }
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }
        Image(
            painter = painterResource(article.image),
            contentDescription = null,
            modifier = Modifier
                .height(450.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Column(Modifier.padding(14.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp), verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = null, Modifier.size(28.dp))
                Text(formatNumberCommas(article.like), style = MaterialTheme.typography.titleSmall)
            }
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp), verticalAlignment = Alignment.CenterVertically) {
                Text(article.user.username, style = MaterialTheme.typography.titleSmall)
                Text(article.content, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Normal)
            }
            Text("2일 전", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}