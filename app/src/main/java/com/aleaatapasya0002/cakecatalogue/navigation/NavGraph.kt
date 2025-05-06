package com.aleaatapasya0002.cakecatalogue.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.aleaatapasya0002.cakecatalogue.ui.screen.AboutScreen
import com.aleaatapasya0002.cakecatalogue.ui.screen.DetailScreen
import com.aleaatapasya0002.cakecatalogue.ui.screen.KEY_ID_DAFTAR
import com.aleaatapasya0002.cakecatalogue.ui.screen.MainScreen

@Composable
fun SetupNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ){
        composable(route = Screen.Home.route){
            MainScreen(navController)
        }
        composable(route = Screen.About.route){
            AboutScreen(navController)
        }
        composable(route = Screen.FormBaru.route){
            DetailScreen(navController)
        }
        composable(
            route = Screen.FormUbah.route,
            arguments = listOf(
                navArgument(KEY_ID_DAFTAR){type = NavType.LongType}
            )
        ){  navBackStackEntry ->
            val id = navBackStackEntry.arguments?.getLong(KEY_ID_DAFTAR)
            DetailScreen(navController,id)
        }

    }

}