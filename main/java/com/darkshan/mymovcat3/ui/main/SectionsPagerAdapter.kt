package com.darkshan.mymovcat3.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.darkshan.mymovcat3.R


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {
    private val listFragment =ArrayList<Fragment>()
    private val listTabTitle =ArrayList<String>()

    override fun getItem(position: Int): Fragment {
       return listFragment.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return listTabTitle.get(position)
    }

    override fun getItemPosition(`object`: Any): Int {
        return super.getItemPosition(`object`)
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return listTabTitle.size
    }
    fun addTabs(fragment: Fragment,tabtitle:String){
        listFragment.add(fragment)
        listTabTitle.add(tabtitle)
    }
}