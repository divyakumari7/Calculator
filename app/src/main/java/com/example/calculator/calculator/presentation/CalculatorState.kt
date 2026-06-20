package com.example.calculator.calculator.presentation

import androidx.compose.runtime.Composable

data class CalculatorState(
    val expression : String = "",
    val result : String = ""
)
