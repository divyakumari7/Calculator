package com.example.calculator.calculator.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape

@Composable
fun CalculatorButton(
    text : String,
    modifier: Modifier = Modifier,
    backgroundColor : Color = Color(0xFF2A2A2A),
    textColor : Color = Color.White,
    shape : Shape = CircleShape,
    onClick : () -> Unit = {}

){
    Box(
        modifier = modifier
            .clip(shape)
            .clickable {
                onClick()
            }
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = textColor
        )
    }
}
