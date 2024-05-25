package com.example.inheritancedemo

//Derived Class of BaseClass
//Inherits from BaseClass

open class Secondary: BaseClass() {

    override fun role() {

        println("Knight of house")
    }
}