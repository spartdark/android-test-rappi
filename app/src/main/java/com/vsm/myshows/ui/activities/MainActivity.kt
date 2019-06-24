package com.vsm.myshows.ui.activities

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import com.vsm.myshows.R
import com.vsm.myshows.ui.fragments.PopularFragment
import com.vsm.myshows.ui.fragments.TopRatedFragment
import com.vsm.myshows.ui.fragments.UpcomingFragment
import com.vsm.myshows.ui.main.SectionsPagerAdapter

class MainActivity : AppCompatActivity(),
    PopularFragment.OnFragmentInteractionListener,
    TopRatedFragment.OnFragmentInteractionListener,
    UpcomingFragment.OnFragmentInteractionListener
{
    override fun onFragmentInteraction(uri: Uri) {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = findViewById(R.id.fab)


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}