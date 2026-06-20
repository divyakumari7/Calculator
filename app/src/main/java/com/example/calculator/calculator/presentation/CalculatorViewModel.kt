package com.example.calculator.calculator.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.calculator.calculator.domain.Calculator

class CalculatorViewModel : ViewModel() {

    private val calculator = Calculator()

    private var _state by mutableStateOf(CalculatorState())
    val state: CalculatorState
        get() = _state

    fun onAction(action: CalculatorAction) {

        when (action) {

            is CalculatorAction.Number -> {
                enterNumber(action.number)
            }

            is CalculatorAction.Operation -> {
                enterOperation(action.operation)
            }

            CalculatorAction.Decimal -> {
                enterDecimal()
            }

            CalculatorAction.Delete -> {
                performDeletion()
            }

            CalculatorAction.Clear -> {
                clear()
            }

            CalculatorAction.Calculate -> {
                calculate()
            }
        }
    }

    private fun enterNumber(number: Int) {
        _state = _state.copy(
            expression = _state.expression + number
        )
    }

    private fun enterOperation(operation: String) {

        if (_state.expression.isEmpty()) return

        val lastChar = _state.expression.last()

        if (lastChar in "+-×÷%") return

        _state = _state.copy(
            expression = _state.expression + operation
        )
    }

    private fun enterDecimal() {

        val lastNumber = _state.expression
            .takeLastWhile { it.isDigit() || it == '.' }

        if (!lastNumber.contains(".")) {
            _state = _state.copy(
                expression = _state.expression + "."
            )
        }
    }

    private fun performDeletion() {

        if (_state.expression.isNotEmpty()) {
            _state = _state.copy(
                expression = _state.expression.dropLast(1)
            )
        }
    }

    private fun clear() {
        _state = CalculatorState()
    }

    private fun calculate() {

        if (_state.expression.isBlank()) return

        val result = calculator.calculate(_state.expression)

        _state = _state.copy(
            result = result
        )
    }
}