package com.example.wazitoecommerce.ui.theme.screens.booking

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.navigation.SCREEN01_URL
import com.example.wazitoecommerce.navigation.SCREEN02_URL
import com.example.wazitoecommerce.ui.theme.Purple41

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Booking(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(title = {  },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Purple41),
            navigationIcon = {
                IconButton(onClick = { navController.navigate(SCREEN02_URL) }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "back",
                        tint = Color.Black


                    )

                }

            },
            actions = {


                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "notifications",
                        tint = Color.Black
                    )
                }
            })
        //End of TopAppBar
        Spacer(modifier = Modifier.height(20.dp))


        Text(
            text ="Bookings made",
            fontSize = 25.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold,
            )



    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BookingPreview() {
    Booking(rememberNavController())
}