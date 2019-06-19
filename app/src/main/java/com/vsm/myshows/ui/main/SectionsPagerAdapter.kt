package com.vsm.myshows.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.vsm.myshows.R
import com.vsm.myshows.ui.fragments.PlaceholderFragment
import com.vsm.myshows.ui.fragments.PopularFragment
import com.vsm.myshows.ui.fragments.TopRatedFragment
import com.vsm.myshows.ui.fragments.UpcomingFragment

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1_popular,
    R.string.tab_text_2_top_rated,
    R.string.tab_text_3_upcoming
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        //return PlaceholderFragment.newInstance(position + 1)
        return when (position) {
            0 -> {
                PopularFragment.newInstance(position.toString(),"")
            }
            1 -> {
                TopRatedFragment.newInstance(position.toString(),"")
            }
            2 -> {
                UpcomingFragment.newInstance(position.toString(),"")
            }
            else -> {
                return PopularFragment.newInstance(position.toString(),"")
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 3
    }
}