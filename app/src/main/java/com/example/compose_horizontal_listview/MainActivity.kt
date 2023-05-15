package com.example.compose_horizontal_listview

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_horizontal_listview.ui.theme.ComposeHorizontalListviewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeHorizontalListviewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    val context = LocalContext.current

    val list = listOf(
        "A",
        "B",
        "C",
        "D",
        "E",
        "F",
        "G",
        "H",
        "I",
        "J",
        "K",
        "L",
        "M",
        "N",
        "O",
        "P",
        "Q",
        "R",
        "S",
        "T",
        "U",
        "V",
        "W",
        "X",
        "Y",
        "Z"
    )

    LazyRow(content = {
        items(count = list.size) { index ->
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
                    .padding(all = 32.dp)
                    .background(color = Color.Yellow)
                    .clickable {
                        Toast
                            .makeText(context, list[index], Toast.LENGTH_SHORT)
                            .show()
                    }
            ) {
                Text(list[index], fontSize = 32.sp, color = Color.Black)
            }
        }
    }, contentPadding = PaddingValues(all = 32.dp), userScrollEnabled = true)
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposeHorizontalListviewTheme {
        Greeting()
    }
}