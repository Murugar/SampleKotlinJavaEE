package com.iqmsoft.javaee.kotlin

import java.io.Serializable
import javax.inject.*
import javax.enterprise.context.*


@Named("person")
@SessionScoped
open class Person : Serializable {

    open var name: String = ""

    open fun submit() {
        println("Submit : $name")
    }
}
