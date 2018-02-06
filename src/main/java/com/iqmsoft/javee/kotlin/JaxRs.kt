package com.iqmsoft.javaee.kotlin

import javax.inject.Inject
import javax.ws.rs.ApplicationPath
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.core.Application

@ApplicationPath("rest")
open class HelloWorldApplication : Application()

@Path("person")
open class PersonResource {

    @Inject
    lateinit private var store: Person

    @GET
    open public fun getName(): String {
        return store.name
    }

}
