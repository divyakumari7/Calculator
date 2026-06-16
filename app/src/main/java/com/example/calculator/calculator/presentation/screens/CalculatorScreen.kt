package com.example.calculator.calculator.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.calculator.calculator.presentation.components.CalculatorTopBar
import com.example.calculator.calculator.presentation.components.DisplaySection
import com.example.calculator.calculator.presentation.components.KeypadSection

@Composable
fun CalculatorScreen() {
    Scaffold { innerpadding ->
        Column (modifier = Modifier.padding(innerpadding)) {
            CalculatorTopBar()
            DisplaySection(modifier = Modifier.weight(1f))
            KeypadSection()
        }
    }
}