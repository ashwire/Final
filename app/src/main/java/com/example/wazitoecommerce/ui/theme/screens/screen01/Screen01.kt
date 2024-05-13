package com.example.wazitoecommerce.ui.theme.screens.screen01

import android.annotation.SuppressLint
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.FIRST_URL
import com.example.wazitoecommerce.navigation.SCREEN01_URL
import com.example.wazitoecommerce.navigation.SCREEN02_URL
import com.example.wazitoecommerce.navigation.SIGNUP_URL
import com.example.wazitoecommerce.navigation.VIEW_WORKERS_URL
import com.example.wazitoecommerce.ui.theme.Blue01
import com.example.wazitoecommerce.ui.theme.Purple41
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition", "UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen01(navController:NavHostController) {


        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            })
                    }
                }
            },


            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Add,
                            contentDescription = "menu")
                    }
                }
            },





            //Content Section
            content = @Composable{
                Column(
                    modifier = Modifier.fillMaxSize(),

                ){
                    //TopAppBar
                    TopAppBar(title = {  },
                        colors = TopAppBarDefaults.mediumTopAppBarColors(Purple41),
                        navigationIcon = {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(
                                    imageVector = Icons.Default.Menu,
                                    contentDescription = "menu",
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


                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.s1),
                            contentDescription = "bali",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        androidx.compose.material3.Text(
                            text = "Home Solutions, hassle-free",
                            fontSize = 40.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))

                    Text(text = "Popular Services",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Row (modifier = Modifier
                        .horizontalScroll(rememberScrollState())
                        .padding(15.dp)){
                        Card(
                            modifier = Modifier
                                .height(200.dp)
                                .width(200.dp)
                        ) {
                            Column {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(150.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.hmremodell),
                                        contentDescription = "bali",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                androidx.compose.material3.Text(
                                    text = "Home Remodelling",
                                    fontSize = 15.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )


                            }
                        }
                        //End of card1
                        Spacer(modifier = Modifier.width(10.dp))

                        Card(
                            modifier = Modifier
                                .height(200.dp)
                                .width(200.dp)
                        ) {
                            Column {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(150.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.cleaners),
                                        contentDescription = "bali",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                androidx.compose.material3.Text(
                                    text = "Cleaning",
                                    fontSize = 15.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )


                            }
                        }
                        //End of card2

                        Spacer(modifier = Modifier.width(10.dp))

                        Card(
                            modifier = Modifier
                                .height(200.dp)
                                .width(200.dp)
                        ) {
                            Column {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(150.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.electricians),
                                        contentDescription = "bali",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                androidx.compose.material3.Text(
                                    text = "Electrical",
                                    fontSize = 15.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )


                            }
                        }
                        //End of card3
                        Spacer(modifier = Modifier.width(10.dp))


                        Card(
                            modifier = Modifier
                                .height(200.dp)
                                .width(200.dp)
                        ) {
                            Column {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(150.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.pestcontroll),
                                        contentDescription = "bali",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                androidx.compose.material3.Text(
                                    text = "Pest Control",
                                    fontSize = 15.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )


                            }
                        }
                        //End of card4




                    }
                    Spacer(modifier = Modifier.height(30.dp))



                }

            }

        )


}



val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),



    BottomNavItem(
        title = "Explore",
        route="screen02",
        selectedIcon=Icons.Filled.Info,
        unselectedIcon=Icons.Outlined.Info,
        hasNews = true,
        badges=0

    ),




    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon : ImageVector,
    val hasNews :Boolean,
    val badges :Int
)




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Screen01Preview() {
    Screen01(rememberNavController())
}