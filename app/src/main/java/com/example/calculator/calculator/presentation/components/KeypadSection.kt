package com.example.calculator.calculator.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.calculator.calculator.presentation.CalculatorAction
import com.example.calculator.ui.theme.Pink40

@Composable
fun KeypadSection(
    modifier: Modifier = Modifier,
    onAction: (CalculatorAction) -> Unit
) {

    val buttonModifier = Modifier.size(70.dp)

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        // Row 1
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            CalculatorButton(
                text = "AC",
                modifier = buttonModifier,
                backgroundColor = Color.Red,
                textColor = Color.Black,
                onClick = {
                    onAction(CalculatorAction.Clear)
                }
            )

            CalculatorButton(
                text = "DEL",
                modifier = buttonModifier,
                backgroundColor = Pink40,
                textColor = Color.Black,
                onClick = {
                    onAction(CalculatorAction.Delete)
                }
            )

            CalculatorButton(
                text = "%",
                modifier = buttonModifier,
                backgroundColor = Pink40,
                textColor = Color.Black,
                onClick = {
                    onAction(CalculatorAction.Operation("%"))
                }
            )

            CalculatorButton(
                text = "÷",
                modifier = buttonModifier,
                backgroundColor = Pink40,
                textColor = Color.Black,
                onClick = {
                    onAction(CalculatorAction.Operation("÷"))
                }
            )
        }

        // Row 2
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            CalculatorButton(
                text = "7",
                modifier = buttonModifier,
                onClick = {
                    onAction(CalculatorAction.Number(7))
                }
            )

            CalculatorButton(
                text = "8",
                modifier = buttonModifier,
                onClick = {
                    onAction(CalculatorAction.Number(8))
                }
            )

            CalculatorButton(
                text = "9",
                modifier = buttonModifier,
                onClick = {
                    onAction(CalculatorAction.Number(9))
                }
            )

            CalculatorButton(
                text = "×",
                modifier = buttonModifier,
                backgroundColor = Pink40,
                textColor = Color.Black,
                onClick = {
                    onAction(CalculatorAction.Operation("×"))
                }
            )
        }

        // Row 3
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            CalculatorButton(
                text = "4",
                modifier = buttonModifier,
                onClick = {
                    onAction(CalculatorAction.Number(4))
                }
            )

            CalculatorButton(
                text = "5",
                modifier = buttonModifier,
                onClick = {
                    onAction(CalculatorAction.Number(5))
                }
            )

            CalculatorButton(
                text = "6",
                modifier = buttonModifier,
                onClick = {
                    onAction(CalculatorAction.Number(6))
                }
            )

            CalculatorButton(
                text = "-",
                modifier = buttonModifier,
                backgroundColor = Pink40,
                textColor = Color.Black,
                onClick = {
                    onAction(CalculatorAction.Operation("-"))
                }
            )
        }

        // Row 4
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            CalculatorButton(
                text = "1",
                modifier = buttonModifier,
                onClick = {
                    onAction(CalculatorAction.Number(1))
                }
            )

            CalculatorButton(
                text = "2",
                modifier = buttonModifier,
                onClick = {
                    onAction(CalculatorAction.Number(2))
                }
            )

            CalculatorButton(
                text = "3",
                modifier = buttonModifier,
                onClick = {
                    onAction(CalculatorAction.Number(3))
                }
            )

            CalculatorButton(
                text = "+",
                modifier = buttonModifier,
                backgroundColor = Pink40,
                textColor = Color.Black,
                onClick = {
                    onAction(CalculatorAction.Operation("+"))
                }
            )
        }

        // Row 5
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            CalculatorButton(
                text = ".",
                modifier = buttonModifier,
                onClick = {
                    onAction(CalculatorAction.Decimal)
                }
            )

            CalculatorButton(
                text = "0",
                modifier = buttonModifier,
                onClick = {
                    onAction(CalculatorAction.Number(0))
                }
            )

            CalculatorButton(
                text = "=",
                modifier = Modifier
                    .width(170.dp)
                    .height(70.dp),
                backgroundColor = Pink40,
                textColor = Color.Black,
                shape = RoundedCornerShape(40.dp),
                onClick = {
                    onAction(CalculatorAction.Calculate)
                }
            )
        }
    }
}