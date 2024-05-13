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
fun RootPataconCounterScreen(
    eggCount: String,
    onIncrease: () -> Unit,
    onDecrease: () -> Unit
){
    PataconCounterScreen(
        eggCount = eggCount,
        onAction = { action ->
        when(action){
            PataconCounterAction.IncreasePataconCounter -> onIncrease()
            PataconCounterAction.DecreasePataconCounter -> onDecrease()
        }
    })
}
@Composable
private fun PataconCounterScreen(onAction: (PataconCounterAction)-> Unit,
                                 eggCount: String,
                         modifier: Modifier = Modifier) {

    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = eggCount)
            EggButton(modifier, textButton = "Agregar Patacon", onClick = {
                onAction(PataconCounterAction.IncreasePataconCounter)
                })
            EggButton (
                modifier, textButton = "Remover Patacon", onClick ={
                    onAction(PataconCounterAction.DecreasePataconCounter)
            })

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PataconCounterScreenPreview() {
    AppPatacon1Theme {
        PataconCounterScreen(
            eggCount = "69",
            onAction = {})
    }
}