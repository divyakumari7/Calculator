package com.example.calculator.calculator.domain

class Calculator {

    fun calculate(expression: String): String {

        if (expression.isBlank()) {
            return ""
        }

        return try {

            val result = evaluate(expression)

            if (result % 1 == 0.0) {
                result.toInt().toString()
            } else {
                result.toString()
            }

        } catch (e: Exception) {
            "Error"
        }

    }

    private fun evaluate(expression: String): Double {

        val tokens = expression
            .replace("×", "*")
            .replace("÷", "/")

        return object {

            var pos = -1
            var ch = 0

            fun nextChar() {
                ch = if (++pos < tokens.length) tokens[pos].code else -1
            }

            fun eat(charToEat: Int): Boolean {

                while (ch == ' '.code) nextChar()

                if (ch == charToEat) {
                    nextChar()
                    return true
                }

                return false
            }

            fun parse(): Double {

                nextChar()

                val x = parseExpression()

                if (pos < tokens.length) {
                    throw RuntimeException("Unexpected")
                }

                return x
            }

            fun parseExpression(): Double {

                var x = parseTerm()

                while (true) {

                    x = when {

                        eat('+'.code) -> x + parseTerm()

                        eat('-'.code) -> x - parseTerm()

                        else -> return x
                    }
                }

            }

            fun parseTerm(): Double {

                var x = parseFactor()

                while (true) {

                    x = when {

                        eat('*'.code) -> x * parseFactor()

                        eat('/'.code) -> x / parseFactor()

                        else -> return x
                    }

                }

            }

            fun parseFactor(): Double {

                if (eat('+'.code)) return parseFactor()

                if (eat('-'.code)) return -parseFactor()

                val startPos = pos

                while (ch in '0'.code..'9'.code || ch == '.'.code) {
                    nextChar()
                }

                return tokens.substring(startPos, pos).toDouble()

            }

        }.parse()

    }

}