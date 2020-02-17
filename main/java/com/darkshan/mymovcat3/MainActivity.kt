package com.darkshan.mymovcat3

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.darkshan.mymovcat3.ui.main.MovieFragment
import com.darkshan.mymovcat3.ui.main.SectionsPagerAdapter
import com.darkshan.mymovcat3.ui.main.TvSeriesFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)

        sectionsPagerAdapter.addTabs(MovieFragment(),resources.getString(R.string.tab_one))
        sectionsPagerAdapter.addTabs(TvSeriesFragment(),resources.getString(R.string.tab_two))
        view_pager.adapter = sectionsPagerAdapter
        tabs.setupWithViewPager(view_pager)


    }
}