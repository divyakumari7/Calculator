package com.example.calculator.calculator.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DisplaySection(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text("1,234 + 567")
        Text("1,801")
    }
}