package com.example.calculator.calculator.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun KeypadSection() {
    Column(){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            CalculatorButton("AC")
            CalculatorButton("DEL")
            CalculatorButton("%")
            CalculatorButton("÷")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            CalculatorButton("9")
            CalculatorButton("8")
            CalculatorButton("7")
            CalculatorButton("x")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            CalculatorButton("6")
            CalculatorButton("5")
            CalculatorButton("4")
            CalculatorButton("-")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            CalculatorButton("3")
            CalculatorButton("2")
            CalculatorButton("1")
            CalculatorButton("+")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            CalculatorButton(".")
            CalculatorButton("0")
            CalculatorButton("=")
        }
    }
}