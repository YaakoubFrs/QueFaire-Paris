package com.yaakoub.whattodoinparis.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator

import com.yaakoub.whattodoinparis.R
import com.yaakoub.whattodoinparis.adapters.HomePagerAdapter
import com.yaakoub.whattodoinparis.adapters.MY_FAV_PAGE_INDEX
import com.yaakoub.whattodoinparis.adapters.PLACE_LIST_PAGE_INDEX
import com.yaakoub.whattodoinparis.databinding.FragmentHomeViewPagerBinding

class HomeViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeViewPagerBinding.inflate(inflater, container, false)
        val tabLayout = binding.tabs
        val viewPager = binding.viewPager

        viewPager.adapter = HomePagerAdapter(this)

        // Set the icon and text for each tab
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.setIcon(getTabIcon(position))
            tab.text = getTabTitle(position)
        }.attach()

        (activity as AppCompatActivity).setSupportActionBar(binding.toolbar)

        return binding.root
    }

    private fun getTabIcon(position: Int): Int {
        return when (position) {
            MY_FAV_PAGE_INDEX -> R.drawable.home_fav_tab_selector
            PLACE_LIST_PAGE_INDEX -> R.drawable.home_place_list_tab_selector
            else -> throw IndexOutOfBoundsException()
        }
    }

    private fun getTabTitle(position: Int): String? {
        return when (position) {
            MY_FAV_PAGE_INDEX -> getString(R.string.my_fav_title)
            PLACE_LIST_PAGE_INDEX -> getString(R.string.place_list_title)
            else -> null
        }
    }
}
