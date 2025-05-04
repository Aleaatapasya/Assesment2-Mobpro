package com.aleaatapasya0002.cakecatalogue

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.aleaatapasya0002.cakecatalogue.navigation.SetupNavGraph
import com.aleaatapasya0002.cakecatalogue.ui.theme.CakeCatalogueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CakeCatalogueTheme {
                SetupNavGraph()
            }
        }
    }
}
