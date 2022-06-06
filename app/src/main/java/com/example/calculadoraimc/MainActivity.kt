package com.example.calculadoraimc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<TextView>(R.id.btn)
        val height = findViewById<TextView>(R.id.height)
        val weight = findViewById<TextView>(R.id.weight)
        val result = findViewById<TextView>(R.id.result)

        btn.setOnClickListener {
            val h = (height.text).toString().toFloat() /100
            val w = weight.text.toString().toFloat()
            val res = w/(h*h)

            if (res < 16) {
                result.text = ("%.2f".format(res) + " Magreza Grave. Cuidado! Recomendamos que você procure um médico com urgência. ")
            } else if (res >= 16 && res <= 17) {
                result.text = ("%.2f".format(res) + " Magreza Moderada. Recomendamos que você matenha o olho na sua saúde. ")
            } else if (res > 17 && res < 18.5) {
                result.text = ("%.2f".format(res) + " Magreza Leve. Não descuide da sua saúde procure manter hábitos saudáveis. ")
            }else if (res >= 18.5 && res <= 24.99) {
                result.text = ("%.2f".format(res) + " Peso Normal. Parabéns, você está com o peso normal. Recomendamos que mantenha hábitos saudáveis em seu dia a dia. ")
            } else if (res >= 25 && res <= 29.99) {
                result.text = ("%.2f".format(res) + " Acima do peso. Atenção! Alguns quilos a mais já são suficientes para que algumas pessoas desenvolvam doenças associadas, como diabetes e hipertensão. É importante rever seus hábitos.")
            } else if (res >= 30 && res <= 34.99) {
                result.text = ("%.2f".format(res) + " Obesidade I. Sinal de alerta! O excesso de peso é fator de risco para desenvolvimento de outros problemas de saúde. A boa notícia é que uma pequena perda de peso já traz benefícios à saúde.")
            } else if (res >= 35 && res <= 39.99) {
                result.text = ("%.2f".format(res) + " Obesidae II (severa). Sinal vermelho! Ao atingir este nível de IMC, o risco de doenças associadas está entre alto e muito alto.")
            } else if (res > 40) {
                result.text = ("%.2f".format(res) + " Obesidae III (móbida). Sinal vermelho! Ao atingir este nível de IMC, o risco é muito alto. Busque ajuda de um profissional de saúde; não perca tempo")
            }

        }
    }
}