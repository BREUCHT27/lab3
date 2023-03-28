package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var operation: TextView
    private lateinit var result: TextView
    private lateinit var zero: Button
    private lateinit var one: Button
    private lateinit var two: Button
    private lateinit var three: Button
    private lateinit var four: Button
    private lateinit var five: Button
    private lateinit var six: Button
    private lateinit var seven: Button
    private lateinit var eight: Button
    private lateinit var nine: Button
    private lateinit var plus: Button
    private lateinit var minus: Button
    private lateinit var multiplication: Button
    private lateinit var comma: Button
    private lateinit var ac: Button
    private lateinit var sign: Button
    private lateinit var percent: Button
    private lateinit var equality: Button
    private lateinit var division: Button

    @SuppressLint("MissingInflatedId", "SetTextI18n" , "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        operation = findViewById(R.id.operation_math)
        result = findViewById(R.id.result_math)
        zero = findViewById(R.id.zero)
        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)
        plus = findViewById(R.id.plus)
        minus = findViewById(R.id.minus)
        multiplication = findViewById(R.id.multiplication)
        comma = findViewById(R.id.comma)
        ac = findViewById(R.id.ac)
        sign = findViewById(R.id.replacement_sign)
        percent = findViewById(R.id.percent)
        equality = findViewById(R.id.equality)
        division = findViewById(R.id.division)

        var str: String

        zero.setOnClickListener {
            if(operation.text.toString().startsWith("0")){
                str = operation.text.toString().replace("0","") + "0"
                resText(str)
            }
            else{
                str = operation.text.toString() + "0"
                resText(str)
            }
        }
        one.setOnClickListener {
            if(operation.text.toString().startsWith("0")){
                str = operation.text.toString().replace("0","") + "1"
                resText(str)
            }
            else{
                str = operation.text.toString() + "1"
                resText(str)
            }
        }
        two.setOnClickListener {
            if(operation.text.toString().startsWith("0")){
                str = operation.text.toString().replace("0","") + "2"
                resText(str)
            }
            else{
                str = operation.text.toString() + "2"
                resText(str)
            }
        }
        three.setOnClickListener {
            if(operation.text.toString().startsWith("0")){
                str = operation.text.toString().replace("0","") + "3"
                resText(str)
            }
            else{
                str = operation.text.toString() + "3"
                resText(str)
            }
        }
        four.setOnClickListener {
            if(operation.text.toString().startsWith("0")){
                str = operation.text.toString().replace("0","") + "4"
                resText(str)
            }
            else{
                str = operation.text.toString() + "4"
                resText(str)
            }
        }
        five.setOnClickListener {
            if(operation.text.toString().startsWith("0")){
                str = operation.text.toString().replace("0","") + "5"
                resText(str)
            }
            else{
                str = operation.text.toString() + "5"
                resText(str)
            }
        }
        six.setOnClickListener {
            if(operation.text.toString().startsWith("0")){
                str = operation.text.toString().replace("0","") + "6"
                resText(str)
            }
            else{
                str = operation.text.toString() + "6"
                resText(str)
            }
        }
        seven.setOnClickListener {
            if(operation.text.toString().startsWith("0")){
                str = operation.text.toString().replace("0","") + "7"
                resText(str)
            }
            else{
                str = operation.text.toString() + "7"
                resText(str)
            }
        }
        eight.setOnClickListener {
            if(operation.text.toString().startsWith("0")){
                str = operation.text.toString().replace("0","") + "8"
                resText(str)
            }
            else{
                str = operation.text.toString() + "8"
                resText(str)
            }
        }
        nine.setOnClickListener {
            if(operation.text.toString().startsWith("0")){
                str = operation.text.toString().replace("0","") + "9"
                resText(str)
            }
            else{
                str = operation.text.toString() + "9"
                resText(str)
            }
        }

        plus.setOnClickListener {
            if(operation.text.toString().endsWith("%")||
                operation.text.toString().endsWith("/")||
                operation.text.toString().endsWith("*")||
                operation.text.toString().endsWith("+")||
                operation.text.toString().endsWith("-")||
                operation.text.toString().endsWith(".")){
                str = operation.text.toString()
                resText(str)
            }
            else{
                str = operation.text.toString() + "+"
                resText(str)
            }
        }
        minus.setOnClickListener {
            if(operation.text.toString().endsWith("%")||
                operation.text.toString().endsWith("/")||
                operation.text.toString().endsWith("*")||
                operation.text.toString().endsWith("+")||
                operation.text.toString().endsWith("-")||
                operation.text.toString().endsWith(".")){
                str = operation.text.toString()
                resText(str)
            }
            else{
                str = operation.text.toString() + "-"
                resText(str)
            }
        }
        multiplication.setOnClickListener {
            if(operation.text.toString().endsWith("%")||
                operation.text.toString().endsWith("/")||
                operation.text.toString().endsWith("*")||
                operation.text.toString().endsWith("+")||
                operation.text.toString().endsWith("-")||
                operation.text.toString().endsWith(".")){
                str = operation.text.toString()
                resText(str)
            }
            else{
                str = operation.text.toString() + "*"
                resText(str)
            }
        }
        division.setOnClickListener {
            if(operation.text.toString().endsWith("%")||
                operation.text.toString().endsWith("/")||
                operation.text.toString().endsWith("*")||
                operation.text.toString().endsWith("+")||
                operation.text.toString().endsWith("-")||
                operation.text.toString().endsWith(".")){
                str = operation.text.toString()
                resText(str)
            }
            else{
                str = operation.text.toString() + "/"
                resText(str)
            }
        }
        comma.setOnClickListener {
            if(operation.text.toString().endsWith("%")||
                operation.text.toString().endsWith("/")||
                operation.text.toString().endsWith("*")||
                operation.text.toString().endsWith("+")||
                operation.text.toString().endsWith("-")||
                operation.text.toString().endsWith(".")){
                str = operation.text.toString()
                resText(str)
            }
            else{
                str = operation.text.toString() + "."
                resText(str)

            }
        }
        ac.setOnClickListener {
            operation.text = "0"
            result.text = ""
        }

        sign.setOnClickListener {
            try {
                val a = operation.text.toString()
                val sings = a.filterNot { it.isDigit() }
                val singsNumb = a.filter { it.isDigit() }
                val regex = "^[+-]?[0-9][\\.\\d]*(.\\d+)?\$".toRegex()
                val matched1 = regex.matches(input = a)
                if(singsNumb != "0"){
                    if (matched1 == true) {
                        val a1 = a.toDouble()
                        val a2 = a1 * (- 1)
                        val a3 = ExpressionBuilder(a2.toString()).build()
                        val a4 = a3.evaluate()//матем решение
                        val longres = a4.toLong()//в типы long перевел
                        if (a4 == longres.toDouble()){
                            str = longres.toString().format("%.2f")
                            resText(str)
                        }
                        else{// если с плав точкой значение
                            str = a4.toString().format("%.2f")
                            resText(str)
                        }
                    }
                    else{
                        if (sings.endsWith("+")) {
                            val After = a.substringAfterLast("+")
                            val Bef = a.substringBeforeLast("+")
                            val End = After.toDouble() * (-1)
                            val a3 = ExpressionBuilder(End.toString()).build()
                            val a4 = a3.evaluate()//матем решение
                            val longres = a4.toLong()//в типы long перевел
                            if (a4 == longres.toDouble()){
                                str = operation.text.toString().replace(a, "$Bef+$longres").format("%.2f")
                                resText(str)
                            }
                            else{// если с плав точкой значение
                                str = operation.text.toString().replace(a, "$Bef+$a4").format("%.2f")
                                resText(str)
                            }
                        }
                        if (sings.endsWith("-")) {
                            val After = a.substringAfterLast("-")
                            val Bef = a.substringBeforeLast("-")
                            val End = After.toDouble() * (-1)
                            val a3 = ExpressionBuilder(End.toString()).build()
                            val a4 = a3.evaluate()//матем решение
                            val longres = a4.toLong()//в типы long перевел
                            if (a4 == longres.toDouble()){
                                str = operation.text.toString().replace(a, "$Bef-$longres").format("%.2f")
                                resText(str)
                            }
                            else{// если с плав точкой значение
                                str = operation.text.toString().replace(a, "$Bef-$a4").format("%.2f")
                                resText(str)
                            }
                        }
                        if (sings.endsWith("*")) {
                            val After = a.substringAfterLast("*")
                            val Bef = a.substringBeforeLast("*")
                            val End = After.toDouble() * (-1)
                            val a3 = ExpressionBuilder(End.toString()).build()
                            val a4 = a3.evaluate()//матем решение
                            val longres = a4.toLong()//в типы long перевел
                            if (a4 == longres.toDouble()){
                                str = operation.text.toString().replace(a, "$Bef*$longres").format("%.2f")
                                resText(str)
                            }
                            else{// если с плав точкой значение
                                str = operation.text.toString().replace(a, "$Bef*$a4").format("%.2f")
                                resText(str)
                            }
                        }
                        if (sings.endsWith("/")) {
                            val After = a.substringAfterLast("/")
                            val Bef = a.substringBeforeLast("/")
                            val End = After.toDouble() * (-1)
                            val a3 = ExpressionBuilder(End.toString()).build()
                            val a4 = a3.evaluate()//матем решение
                            val longres = a4.toLong()//в типы long перевел
                            if (a4 == longres.toDouble()){
                                str = operation.text.toString().replace(a, "$Bef/$longres").format("%.2f")
                                resText(str)
                            }
                            else{// если с плав точкой значение
                                str = operation.text.toString().replace(a, "$Bef/$a4").format("%.2f")
                                resText(str)
                            }
                        }
                    }
                }
            }
            catch (e:Exception) {
                Log.d("Ошибка", "сообщение: ${e.message}")
                result.text = "Ошибка"
                operation.text = "0"
            }
        }

        percent.setOnClickListener {
            if(operation.text.toString().endsWith("%")||
                operation.text.toString().endsWith("/")||
                operation.text.toString().endsWith("*")||
                operation.text.toString().endsWith("+")||
                operation.text.toString().endsWith("-")||
                operation.text.toString().endsWith(".")){
                str = operation.text.toString()
                resText(str)
            }
            else{
                val a = operation.text.toString()
                val sings = a.filterNot{it.isDigit()}
                val singsNumb = a.filter{it.isDigit()}
                val regex = "^[+-]?[0-9][\\.\\d]*(.\\d+)?\$".toRegex()
                val matched1 = regex.matches(input = a)
                if(singsNumb != "0"){
                    if(matched1 == true){
                        val a_end = a.toDouble()
                        val str0 = a_end/100
                        val a3 = ExpressionBuilder(str0.toString()).build()
                        val a4 = a3.evaluate()//матем решение
                        val longres = a4.toLong()//в типы long перевел
                        if (a4 == longres.toDouble()){
                            str = operation.text.toString().replace(a, "$longres").format("%.2f")
                            resText(str)
                        }
                        else{// если с плав точкой значение
                            str = operation.text.toString().replace(a, "$a4").format("%.2f")
                            resText(str)
                        }
                    }
                    else{
                        if(sings.endsWith("+")){
                            val After = a.substringAfterLast("+")
                            val Bef = a.substringBeforeLast("+")
                            val Bef1 = ExpressionBuilder(Bef.toString()).build()
                            val Bef2 = Bef1.evaluate().toString()//матем решение
                            val End = Bef2.toDouble() / 100 * After.toDouble()
                            val a3 = ExpressionBuilder(End.toString()).build()
                            val a4 = a3.evaluate()//матем решение
                            val longres = a4.toLong()//в типы long перевел
                            if (a4 == longres.toDouble()){
                                str = operation.text.toString().replace(a, "$Bef+$longres").format("%.2f")
                                resText(str)
                            }
                            else{// если с плав точкой значение
                                str = operation.text.toString().replace(a, "$Bef+$a4").format("%.2f")
                                resText(str)
                            }
                        }
                        if(sings.endsWith("-")){
                            val After = a.substringAfterLast("-")
                            val Bef = a.substringBeforeLast("-")
                            val Bef1 = ExpressionBuilder(Bef).build()
                            val Bef2 = Bef1.evaluate().toString()//матем решение
                            val End = Bef2.toDouble() / 100 * After.toDouble()
                            val a3 = ExpressionBuilder(End.toString()).build()
                            val a4 = a3.evaluate()//матем решение
                            val longres = a4.toLong()//в типы long перевел
                            if (a4 == longres.toDouble()){
                                str = operation.text.toString().replace(a, "$Bef-$longres").format("%.2f")
                                resText(str)
                            }
                            else{// если с плав точкой значение
                                str = operation.text.toString().replace(a, "$Bef-$a4").format("%.2f")
                                resText(str)
                            }
                        }
                        if(sings.endsWith("*")){
                            val After = a.substringAfterLast("*")
                            val Bef = a.substringBeforeLast("*")
                            val del1 = "+"
                            val del2 = "/"
                            val del3 = "-"
                            val del4 = "*"
                            val BefEnd = Bef.split(del1,del2,del3, del4, ignoreCase = true).toString()
                            val BefEnd1 = BefEnd.substringBeforeLast("]")
                            val BefEnd2 = BefEnd1.substringAfterLast(",").toDouble()
                            val End = BefEnd2 / After.toDouble() / 100
                            val a3 = ExpressionBuilder(End.toString()).build()
                            val a4 = a3.evaluate()//матем решение
                            val longres = a4.toLong()//в типы long перевел
                            if (a4 == longres.toDouble()){
                                str = operation.text.toString().replace(a, "$Bef*$longres").format("%.2f")
                                resText(str)
                            }
                            else{// если с плав точкой значение
                                str = operation.text.toString().replace(a, "$Bef*$a4").format("%.2f")
                                resText(str)
                            }
                        }
                        if(sings.endsWith("/")){
                            val After = a.substringAfterLast("/")
                            val Bef = a.substringBeforeLast("/")
                            val del1 = "+"
                            val del2 = "/"
                            val del3 = "-"
                            val del4 = "*"
                            val BefEnd = Bef.split(del1,del2,del3, del4, ignoreCase = true).toString()
                            val BefEnd1 = BefEnd.substringBeforeLast("]")
                            val BefEnd2 = BefEnd1.substringAfterLast(",").toDouble()
                            val End = BefEnd2 * 0.01 / After.toDouble()
                            val a3 = ExpressionBuilder(End.toString()).build()
                            val a4 = a3.evaluate()//матем решение
                            val longres = a4.toLong()//в типы long перевел
                            if (a4 == longres.toDouble()){
                                str = operation.text.toString().replace(a, "$Bef/$longres").format("%.2f")
                                resText(str)
                            }
                            else{// если с плав точкой значение
                                str = operation.text.toString().replace(a, "$Bef/$a4").format("%.2f")
                                resText(str)
                            }
                        }
                    }
                }
            }
        }

        equality.setOnClickListener {
            try {
                val a = ExpressionBuilder(operation.text.toString()).build()
                val res = a.evaluate()//матем решение

                val longres = res.toLong()//в типы long перевел
                if (res == longres.toDouble()){
                    operation.text = longres.toString().format("%.2f")
                }
                else{// если с плав точкой значение
                    operation.text = res.toString().format("%.2f")
                }
            }

            catch (e:Exception) {
                Log.d("Ошибка", "сообщение: ${e.message}")
                result.text = "Ошибка"
                operation.text = "0"
            }
        }
    }

    private  fun resText(str: String){
        operation.text = str
        if (result.text != "") {
            if (result.text == "Ошибка") {
                operation.text = "0"
                result.text = ""
            }
        }
    }
}