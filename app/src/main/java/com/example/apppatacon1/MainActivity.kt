package com.example.apppatacon1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.apppatacon1.pataconCounter.presenter.ui.PataconCounterScreen
import com.example.apppatacon1.ui.theme.AppPatacon1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppPatacon1Theme {
                PataconCounterScreen(Modifier)
            }
        }
    }
}

@Composable
fun EggButton(modifier: Modifier = Modifier, onClick: () -> Unit){
    Button(onClick = onClick, modifier = modifier) {
        Text(text = "Nuevo Patacon")
    }
}

