package com.example.wazitoecommerce.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.FIRST_URL
import com.example.wazitoecommerce.navigation.SCREEN01_URL
import com.example.wazitoecommerce.navigation.SIGNUP_URL
import com.example.wazitoecommerce.ui.theme.Blue01
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch



@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun Splash(navController:NavHostController) {
    Column (modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val coroutine = rememberCoroutineScope()
        coroutine.launch {
            delay(2500)
            navController.navigate(FIRST_URL)
        }

        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.spl))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(300.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Home help at your fingertips",
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            fontSize = 25.sp)
        



        

    }


}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SplashPreview() {
    Splash(rememberNavController())
}