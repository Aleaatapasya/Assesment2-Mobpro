package com.aleaatapasya0002.cakecatalogue.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.aleaatapasya0002.cakecatalogue.ui.screen.DetailScreen
import com.aleaatapasya0002.cakecatalogue.ui.screen.MainScreen

@Composable
fun SetupNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(route = Screen.Home.route){
            MainScreen()
        }
        composable(route = Screen.FormBaru.route){
            DetailScreen()
        }

    }

}