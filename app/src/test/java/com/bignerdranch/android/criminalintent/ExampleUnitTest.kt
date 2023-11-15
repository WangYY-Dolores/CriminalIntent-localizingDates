package com.bignerdranch.android.criminalintent

import org.junit.Test

import org.junit.Assert.*
import java.util.Date

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CrimeDetailFragmentUnitTest {

    @Test
    fun formatDate() {
        val crimeDetailFragment = CrimeDetailFragment()

        val date = Date(1641264000000) // 2023-01-05T00:00:00Z

        val formattedDate = crimeDetailFragment.formatDate(date)

        // Customize this assertion based on your actual date formatting
        assertEquals("Expected Date Format", "Wed, Jan, 05", formattedDate)
    }
}