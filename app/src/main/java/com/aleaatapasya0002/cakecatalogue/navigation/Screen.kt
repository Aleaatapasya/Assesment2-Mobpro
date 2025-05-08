package com.aleaatapasya0002.cakecatalogue.navigation

import com.aleaatapasya0002.cakecatalogue.ui.screen.KEY_ID_DAFTAR

sealed class Screen(val route: String) {
    data object Home: Screen("mainScreen")
    data object About: Screen("aboutScreen")
    data object FormBaru: Screen("detailScreen")
    data object FormUbah: Screen("detailScreen/{$KEY_ID_DAFTAR}"){
        fun withId(id: Long) = "detailScreen/$id"
    }
}