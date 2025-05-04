package com.aleaatapasya0002.cakecatalogue.ui.screen

import androidx.lifecycle.ViewModel
import com.aleaatapasya0002.cakecatalogue.model.Daftar

class MainViewModel : ViewModel() {
    val data = listOf(
        Daftar(
            1,
            "Choco Donuts",
            "Donat berisi coklat yang melimpah"
        ),
        Daftar(
            2,
            "Strawberry Cheese Cookies",
            "Cookies yang berisi selai strawberry dan diberi taburan keju"
        ),Daftar(
            3,
            "Blueberry Cake",
            "Kue berisi selai blueberry dan ditaburi oleh potongan buah blueberry"
        ),Daftar(
            4,
            "Pink Lava Cake",
            "Kue lembut berisi lelehan krim strawberry manis"
        ),Daftar(
            5,
            "Red Velvet Cake",
            "Kue lembut berwarna merah dengan rasa coklat dan lapisan krim keju yang creamy"
        ),Daftar(
            6,
            "Pink Choco Donuts",
            "Donat lembut berlapis cokelat pink manis dengan taburan yang menggoda di atasnya"
        ),
    )
}