package com.example.esverificafinale.viewpager

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.esverificafinale.pages

private const val NUM_TABS = 4

class ScreenSlidePagerAdapter(fm: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fm, lifecycle) {
    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        val bundle = bundleOf("page_name" to pages[position])

        return HomePagerFragment().apply {
            arguments = bundle
        }
    }
}