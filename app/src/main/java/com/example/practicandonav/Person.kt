package com.example.practicandonav

import java.io.Serializable

class Person : Serializable {

    var nombre: String
    var apellido: String
    var email: String

    constructor(nombre: String, apellido: String, email: String) {
        this.nombre = nombre
        this.apellido = apellido
        this.email = email

    }

}