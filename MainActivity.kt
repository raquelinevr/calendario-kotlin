package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.model.Calendario
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Raqueline")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val calendarioraqueline = Calendario()
    Surface(color = Color.Yellow) {
       Column {
           Text(
               text = calendarioraqueline.diaDaSemana(2),
               modifier = modifier.padding(12.dp),
               color=Color.Blue
           )
           Spacer(modifier = Modifier.width(10.dp))
           Text(
               text = calendarioraqueline.diaDaSemana(1),
               modifier = modifier.padding(12.dp),
               color = Color.Blue
           )
           Spacer(modifier = Modifier.width(10.dp))
           Text(
               text = "Raqueline Gomes",
               modifier = modifier.padding(12.dp),
               color = Color.Blue
           )
       }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Raqueline")
    }
}
