package com.example.bankingappui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyYen
import androidx.compose.material.icons.rounded.Euro
import com.example.bankingappui.data.Currency


val currencies = listOf(
    Currency(
        name = "USD",
        buy = 28.89f,
        sell = 29.67F,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "EUR",
        buy = 15.67F,
        sell = 16.12F,
        icon = Icons.Rounded.Euro
    ),
    Currency(
        name = "YEN",
        buy = 28.77F,
        sell = 29.14F,
        icon = Icons.Rounded.CurrencyYen
    ),
    Currency(
        name = "USD",
        buy = 25.684F,
        sell = 24.26F,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "EUR",
        buy = 64.88F,
        sell = 74.33F,
        icon = Icons.Rounded.Euro
    ),
    Currency(
        name = "YEN",
        buy = 17.53F,
        sell = 17.53F,
        icon = Icons.Rounded.CurrencyYen
    )
)