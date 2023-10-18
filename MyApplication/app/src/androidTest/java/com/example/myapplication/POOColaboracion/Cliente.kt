package com.example.myapplication.POOColaboracion

class Cliente(var nombre:String, var saldoCuenta:Float) {
    fun consignar(valor:Float){
        this.saldoCuenta += valor
    }

    fun retirar(valor:Float){
        this.saldoCuenta -= valor
    }

    fun imprimir(){
        println("$nombre tiene un saldo en su cuenta de $saldoCuenta")
    }
}