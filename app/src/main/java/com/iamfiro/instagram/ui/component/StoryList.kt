package com.iamfiro.instagram.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iamfiro.instagram.R
import com.iamfiro.instagram.model.Story
import com.iamfiro.instagram.model.User
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow

@Composable
fun StoryList() {
    val storyList = listOf<Story>(
        Story(
            user = User(username = "iroiro_0000", profileImage = R.drawable.ig_profile_iroiro),
            false,
            false
        ),
        Story(
            user = User(username = "choda._.n", profileImage = R.drawable.ig_profile_chodan),
            false,
            true
        ),
        Story(
            user = User(
                username = "charles_leclerc",
                profileImage = R.drawable.ig_profile_charles
            ), true, false
        ),
        Story(
            user = User(
                username = "hiphopplayameme",
                profileImage = R.drawable.ig_profile_hiphop
            ), true, true
        ),
    )

    Row(
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier
            .padding(start = 8.dp)
            .clipToBounds()
            .horizontalScroll(rememberScrollState()),
    ) {
        storyList.forEach { story ->
            StoryButton(story = story)
        }
    }
}

@Composable
fun StoryButton(story: Story) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Box(
            modifier = Modifier
                .border(
                    width = 3.dp,
                    color = if (story.viewed)
                        MaterialTheme.colorScheme.outline
                    else
                        if (story.closedFriendStory) MaterialTheme.colorScheme.secondary
                        else MaterialTheme.colorScheme.primary,
                    shape = CircleShape
                )
                .padding(7.5.dp)
        ) {
            Image(
                painter = painterResource(story.user.profileImage),
                contentDescription = "${story.user.username} profile",
                modifier = Modifier
                    .size(78.dp)
                    .clip(RoundedCornerShape(9999.dp))
            )
        }
        Text(
            text = story.user.username,
            style = MaterialTheme.typography.bodyMedium.copy(
                color = if (story.viewed)
                    MaterialTheme.colorScheme.onSurfaceVariant
                else
                    MaterialTheme.colorScheme.onSurface
            ),
            modifier = Modifier.width(76.dp),
            overflow = TextOverflow.Ellipsis,
            maxLines = 1,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StoryListPreview() {
    StoryList()
}