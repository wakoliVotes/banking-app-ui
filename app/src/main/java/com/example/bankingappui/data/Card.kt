package com.example.bankingappui.data

import androidx.compose.ui.graphics.Brush

data class Card(
    val cartType: String,
    val cardNumber: String,
    val cardName: String,
    val balance: Int,
    val color: Brush
)
