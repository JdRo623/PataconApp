package com.example.apppatacon1.pataconCounter.presenter.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.apppatacon1.EggButton
import com.example.apppatacon1.ui.theme.AppPatacon1Theme

@Composable
fun PataconCounterScreen(modifier: Modifier = Modifier) {
    var eggCount by remember {
        mutableIntStateOf(0)
    }
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = eggCount.toString())
            EggButton(modifier, onClick = {eggCount++})
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PataconCounterScreenPreview() {
    AppPatacon1Theme {
        PataconCounterScreen()
    }
}