package com.ngs

class House {
    static searchable = {
        occupants component: true 
    }

    List occupants

    static hasMany = [occupants: Person]

    static constraints = {
    }
}
