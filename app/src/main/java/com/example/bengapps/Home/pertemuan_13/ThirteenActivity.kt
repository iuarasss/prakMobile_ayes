package com.example.bengapps.Home.pertemuan_13

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bengapps.R
import com.example.bengapps.databinding.ActivityThirteenBinding
import com.google.android.material.tabs.TabLayoutMediator

class ThirteenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirteenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        binding = ActivityThirteenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ThirteenTabsAdapter(this)

        binding.viewPager.adapter = adapter


        TabLayoutMediator(
            binding.tabLayout,
            binding.viewPager
        ) { tab, position ->

            when (position) {
                0 -> tab.text = "Scan"
                1 -> tab.text = "Catatan"
                2 -> tab.text = "Profile"
            }

        }.attach()

        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            title = "Pertemuan 13"
            setHomeAsUpIndicator(R.drawable.ic_arrow_back)
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }
}