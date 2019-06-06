package com.r4sh33d.duplicatecontactsremover

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.toolbar_layout.*

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpNavigation()
    }

    private fun setUpNavigation() {
        toolbar.overflowIcon = getDrawable(R.drawable.ic_more_vert_black_24dp)
        setSupportActionBar(toolbar)
        navController = findNavController(R.id.nav_host_fragment)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            supportActionBar?.apply {
                setDisplayShowTitleEnabled(false)
                val isRootPage = destination.id == R.id.landingPageFragment
                setDisplayHomeAsUpEnabled(!isRootPage)
                setHomeAsUpIndicator(if (!isRootPage) R.drawable.ic_close_black_24dp else 0)
                toolbarTitle.text = destination.label
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, appBarConfiguration)
    }
}