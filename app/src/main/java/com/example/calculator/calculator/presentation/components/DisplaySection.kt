package com.example.calculator.calculator.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.calculator.calculator.presentation.CalculatorState


@Composable
fun DisplaySection(state: CalculatorState,
                   modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.End
    ){
        Text(
            text = state.expression,
            color = Color.Gray,
            fontSize = 18.sp
        )
        Text(
            text = state.result,
            color = Color.White,
            fontSize = 42.sp,
            fontWeight = FontWeight.Bold

        )
    }
}