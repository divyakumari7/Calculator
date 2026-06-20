package com.example.calculator.calculator.presentation



sealed class CalculatorAction {

    data class Number(val number : Int) : CalculatorAction()

    data class Operation(val operation: String) : CalculatorAction()

    object Clear : CalculatorAction()

    object Delete : CalculatorAction()

    object Calculate : CalculatorAction()

    object Decimal : CalculatorAction()


}