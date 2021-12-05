           package com.example.kantongku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.material.tabs.TabLayoutMediator

           class MainActivity : AppCompatActivity() {
    val menuTeks = arrayOf("Transaksi", "Hutang", "Kantong")
    val menuIcon = arrayOf(R.drawable.ic_transaksi, R.drawable.ic_hutang, R.drawable.ic_dompet)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(this)
        view_pager.setAdapter(adapter) ;
        TabLayoutMediator(tab_layout, view_pager,
        TabLayoutMediator.TabConfigurationStrategy{tab, position ->
            tab.text = menuTeks [position]
            tab.icon = ResourcesCompat.getDrawable(resources, menuIcon[position], null)
        }).attach()
    }
}