package com.example.wazitoecommerce.models

class Worker {
    var name:String = ""
    var email:String = ""
    var password:String = ""
    var servicesOffered:String = ""
    var pricing:String = ""
    var availability:String = ""
    var imageUrl = ""
    var id:String = ""

    constructor(name: String, email: String, password: String,servicesOffered:String,pricing:String,availability:String, imageUrl: String, id: String) {
        this.name = name
        this.email = email
        this.password = password
        this.servicesOffered = servicesOffered
        this.pricing = pricing
        this.availability =availability
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}