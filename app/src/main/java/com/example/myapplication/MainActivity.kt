package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.layout.safeDrawingPadding // <-- Добавьте этот импорт


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                // Добавляем safeDrawingPadding()
                modifier = Modifier.fillMaxSize().safeDrawingPadding(),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Hello(name = "Кирилл", modifier = Modifier.padding(horizontal = 16.dp))
                Hello(name = null, modifier = Modifier.padding(horizontal = 16.dp))
            }
        }
    }
}

@Composable
fun Hello(name: String?, modifier: Modifier = Modifier) {
    // Если name == null, выведется "Имя не задано", иначе "Привет, [имя]!"
    Text(
        text = if (name == null) "Имя не задано" else "Привет, $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun HelloPreview() {
    Hello("Балбес-лимбусёнок_xD")
}