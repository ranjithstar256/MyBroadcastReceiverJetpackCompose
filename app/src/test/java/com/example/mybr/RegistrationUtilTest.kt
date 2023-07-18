package com.svbneelmane.learn.unittesting

 import com.example.mybr.RegistrationUtil
 import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun sam(){
        assert(
            RegistrationUtil.validateRegistration("jhdgdfhjfgdh"
        ,"asdasd1","asdasd1")).equals(true)
    }

    @Test
    fun docheck(){
        val dat= RegistrationUtil.validateRegistration("abddcdcef"
        ,"fcdsdbcs44c"
        ,"fcdsdbcs44c")

        assert(dat).equals(true)
    }

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistration(
            "",
            "valid123",
            "valid123"
        )
        assert(result).equals(false)
       /// assertThat(result).isFalse()
    }

    @Test
    fun `valid user name and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistration(
            "Phillip",
            "valid123",
            "valid123"
        )
        assert(result).equals(true)

     //   assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistration(
            "Cal",
            "valid123",
            "valid123"
        )
        assert(result).equals(false)
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistration(
            "Cal",
            "",
            ""
        )
        assert(result).equals(false)
    }

    @Test
    fun `password with less than 2 digits returns false`() {
        val result = RegistrationUtil.validateRegistration(
            "Cal",
            "valid",
            "valid"
        )
        assert(result).equals(false)
    }
}