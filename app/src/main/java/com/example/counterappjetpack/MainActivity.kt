package com.example.counterappjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.counterappjetpack.ui.theme.CounterAppJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterAppJetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                   // Counter()//orientation changes - solve -use viewmodel
                    Counter()
                }
            }
        }
    }
}
//https://developer.android.com/jetpack/androidx/releases/lifecycle
@Composable
fun Counter(model:MyViewModel= viewModel()){//viewmodel fun used to create obj of viewmode and pass to composable

       Column {
        Button(onClick = { model.increaseCount() }) {
              Text(text = "Click me")
        }
           Text(text = "Your counter is ${model.count}")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CounterAppJetpackTheme {
        Greeting("Android")
    }
}