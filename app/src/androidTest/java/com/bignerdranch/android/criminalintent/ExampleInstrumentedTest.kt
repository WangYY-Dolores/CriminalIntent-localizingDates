package com.bignerdranch.android.criminalintent

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.ext.junit.runners.AndroidJUnit4
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import java.util.Date
import java.util.UUID

@RunWith(AndroidJUnit4::class)
class CrimeDetailFragmentInstrumentedTest {

    @Test
    fun checkDateDisplay() {

        val crime = Crime(UUID.fromString("4F916C0CFAA1486BB9A90D55922FD2E1"), "Example Crime", Date(), false, "")
        val args = CrimeDetailFragmentArgs(UUID.fromString("4F916C0CFAA1486BB9A90D55922FD2E1"))
        val fragmentScenario: FragmentScenario<CrimeDetailFragment> =
            launchFragmentInContainer(args.toBundle())

        fragmentScenario.onFragment { fragment ->
            fragment.updateUi(crime)

            assertEquals("Expected Date Display", "Wed, Jan 01", fragment.binding.crimeDate.text.toString())
        }
    }
}