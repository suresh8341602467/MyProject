package com.example.myapplication

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class RegistrationTest {

    @Test
     fun empty_username_returns_false(){
         val result= Registration.validateRegistration("","suresh12","suresh12")
        println("suresh $result")
        assertFalse (result)
     }

    @Test
    fun existing_user_returns_false(){
        val result= Registration.validateRegistration("suresh","suresh12","suresh12")
        println("suresh $result")
        assertFalse (result)
    }

    @Test
    fun password_and_confirm_password_same(){
        val result= Registration.validateRegistration("phani","suresh123","suresh12")
        println("suresh $result")
        assertFalse (result)
    }

    @Test
    fun password_contain_two_digits(){
        val result= Registration.validateRegistration("phani","suresh1","suresh1")
        println("suresh $result")
        assertFalse (result)
    }

}