package com.example.calculator.calculator.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculator.calculator.presentation.CalculatorViewModel
import com.example.calculator.calculator.presentation.components.CalculatorTopBar
import com.example.calculator.calculator.presentation.components.DisplaySection
import com.example.calculator.calculator.presentation.components.KeypadSection

@Composable
fun CalculatorScreen() {

    val viewModel: CalculatorViewModel = viewModel()

    Scaffold { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {

            CalculatorTopBar()

            DisplaySection(
                state = viewModel.state,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp, vertical = 16.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            KeypadSection(
                modifier = Modifier.padding(bottom = 16.dp),
                onAction = viewModel::onAction
            )

            Spacer(modifier = Modifier.weight(0.05f))
        }
    }
}