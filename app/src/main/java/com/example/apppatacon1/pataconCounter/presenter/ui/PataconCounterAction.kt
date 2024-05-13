package com.example.apppatacon1.pataconCounter.presenter.ui

sealed interface PataconCounterAction {
    data object IncreasePataconCounter: PataconCounterAction
    data object DecreasePataconCounter: PataconCounterAction
}