package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.screens.booking.Booking
import com.example.wazitoecommerce.ui.theme.screens.first.First

import com.example.wazitoecommerce.ui.theme.screens.log.Log
import com.example.wazitoecommerce.ui.theme.screens.screen01.Screen01
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen
import com.example.wazitoecommerce.ui.theme.screens.products.AddProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.products.ViewProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.screen02.Screen02
import com.example.wazitoecommerce.ui.theme.screens.service.AddWorkers
import com.example.wazitoecommerce.ui.theme.screens.service.ViewWorkers
import com.example.wazitoecommerce.ui.theme.screens.sign.Sign
import com.example.wazitoecommerce.ui.theme.screens.signup.SignupScreen
import com.example.wazitoecommerce.ui.theme.screens.splash.Splash


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }

        composable(ADD_PRODUCTS_URL){
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL){
            ViewProductsScreen(navController = navController)
        }
        composable(SPLASH_URL){
            Splash(navController = navController)
        }
        composable(SCREEN01_URL){
            Screen01(navController = navController)
        }
        composable(SCREEN02_URL){
            Screen02(navController = navController)
        }
        composable(BOOKING_URL){
            Booking(navController = navController)
        }

        composable(ADD_WORKERS_URL){
            AddWorkers(navController = navController)
        }
        composable(VIEW_WORKERS_URL){
            ViewWorkers(navController = navController)
        }
        composable(LOG_URL){
            Log(navController = navController)
        }
        composable(SIGN_URL){
            Sign(navController = navController)
        }
        composable(FIRST_URL){
            First(navController = navController)
        }


    }
}


