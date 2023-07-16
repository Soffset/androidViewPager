package com.example.esverificafinale

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.esverificafinale.databinding.ActivityHomeBinding
import com.example.esverificafinale.viewpager.HomePagerFragment
import com.example.esverificafinale.viewpager.ScreenSlidePagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

val pages = arrayOf(
    "Reading",
    "To Read",
    "Read",
    "Dropped"
)

class HomeActivity : FragmentActivity() {
    private lateinit var binding: ActivityHomeBinding
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Instantiate a ViewPager2 and a PagerAdapter.
        viewPager = binding.pager
        tabLayout = binding.tabLayout

        // The pager adapter, which provides the pages to the view pager widget.
        val pagerAdapter = ScreenSlidePagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = pagerAdapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = pages[position]
        }.attach()
    }

}