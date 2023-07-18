package com.example.mybr

object RegistrationUtil {

    private val existingUsers = listOf("Kevin", "Paul", "James")

    fun validateRegistration(username: String,  password: String, confirmPassword: String): Boolean {
          if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            return false
        }
      if (username in existingUsers) {
            return false
        }
        if (password != confirmPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 1) {
            return false
        }
        return true
    }
}