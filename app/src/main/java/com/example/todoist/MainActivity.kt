package com.example.todoist

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todoist.ui.theme.TodoistTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessagingCard(msg = Message("Android","Jetpack Compose"))
        }
    }
}
data class Message(val author: String, val body: String)

@Composable
fun MessagingCard(msg: Message) {

    Row(modifier =  Modifier.padding(all = 8.dp)) {
        Image(
           painterResource(R.drawable.otp),
            contentDescription = "Contact Profile picture",
            modifier = Modifier
                .size(40.dp)  // Set image size to 40 dp
                .clip(CircleShape)



        )
        Spacer(modifier = Modifier.width(8.dp))

    }
    Column {
        Text(text = msg.author)
        Text(text = msg.body)
    }
}




