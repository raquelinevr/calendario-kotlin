package com.example.myapplication.model

import java.util.Calendar

class Calendario {
    private var data: Calendar = Calendar.getInstance()
    val meses = arrayListOf("JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO")
    val dias = arrayListOf("DOMINGO", "SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA-FEIRA", "SABADO" )

    fun diaDaSemana(dia : Int): String{
        data.set(Calendar.DAY_OF_WEEK_IN_MONTH,dia)
        return dias[this.data.get(Calendar.DAY_OF_WEEK_IN_MONTH)-1]
    }

    fun mesDiaAno (dia: Int, mes: Int, ano: Int){
        data.set(Calendar.YEAR,ano)
        data.set(Calendar.MONTH,mes)
        data.set(Calendar.DAY_OF_MONTH,dia)
        println("Raqueline faz aniversário em ${data.get(Calendar.DAY_OF_MONTH)}/${data.get(Calendar.MONTH)}/${data.get(Calendar.YEAR)}")
    }

    private fun mapMesInt(mes: Int): String{
        return meses[mes-1]
    }

}

fun main () {
    var teste = Calendario()
    teste.mesDiaAno(30,4,2000)
}
