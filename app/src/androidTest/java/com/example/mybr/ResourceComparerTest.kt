package com.svbneelmane.learn.unittesting

import android.content.Context
import android.util.Log
import androidx.test.core.app.ApplicationProvider
import org.junit.After
import org.junit.Before
import org.junit.Test
import com.example.mybr.R;

class ResourceComparerTest {

    private lateinit var resourceComparer: ResourceComparer

    /**
     * Run before each test
     */
    @Before
    fun setup() {
        resourceComparer = ResourceComparer()
    }

    @Test
    fun validateResourceString_returnTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()

        val result = resourceComparer.isEqual(context,R.string.first_name, "india")
        assert(result).equals(true)
    }

    @Test
    fun validateResourceString_returnFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()

        val result = resourceComparer.isEqual(context, android.R.string.ok, "OKay")
        assert(result).equals(false)
    }

    /**
     *
     */
    @After
    fun done() {
        Log.d("D/ResourceComparerTest","Done..")
    }
}