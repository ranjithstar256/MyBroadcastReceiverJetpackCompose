package com.svbneelmane.learn.unittesting

import android.content.Context
import android.util.Log
import androidx.test.core.app.ApplicationProvider
import org.junit.After
import org.junit.Before
import org.junit.Test

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

        val result = resourceComparer.isEqual(context,android.R.string.ok, "OK")
        assert(result).equals(true)
    }

    @Test
    fun validateResourceString_returnFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()

        val result = resourceComparer.isEqual(context, android.R.string.ok, "OK")
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