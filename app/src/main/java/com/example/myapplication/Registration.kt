package com.example.myapplication

object Registration {

    private val existedUsersList = listOf("suresh", "soundarya")

    fun validateRegistration(user: String, password: String, confirmPassword: String): Boolean {

        if (user.isEmpty() || password.isEmpty() || confirmPassword.isEmpty())
            return false

        if (existedUsersList.contains(user))
            return false

        if (password.count { it.isDigit() } < 2)//gets digit count
            return false

        if (password != confirmPassword)
            return false

        return true
    }
}