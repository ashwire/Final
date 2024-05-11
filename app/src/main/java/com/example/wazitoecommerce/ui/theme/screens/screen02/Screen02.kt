package com.example.wazitoecommerce.ui.theme.screens.screen02

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.rememberScrollableState
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.BOOKING_URL
import com.example.wazitoecommerce.navigation.SCREEN01_URL
import com.example.wazitoecommerce.navigation.VIEW_WORKERS_URL
import com.example.wazitoecommerce.ui.theme.Purple41
import com.example.wazitoecommerce.ui.theme.lBlue
import com.example.wazitoecommerce.ui.theme.screens.screen01.bottomNavItems


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen02(navController:NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.asbg), contentScale = ContentScale.FillBounds))
    {
                val mContext = LocalContext.current
                //TopAppBar
                TopAppBar(title = {  },
                    colors = TopAppBarDefaults.mediumTopAppBarColors(Purple41),
                    navigationIcon = {
                        IconButton(onClick = { navController.navigate(SCREEN01_URL) }) {
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


                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Choose Category",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontFamily = FontFamily.SansSerif,
                    modifier = Modifier.padding(start = 10.dp))

                Spacer(modifier = Modifier.height(20.dp))

                Column (modifier = Modifier
                    .padding(start = 20.dp)
                    .verticalScroll(rememberScrollState())){
                    val mContext = LocalContext.current
                    Row {
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.cleaners),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Cleaning",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default,
                                color = Color.Black
                            )

                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.electricians),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Electrical",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }


                    }


                    //End of Row1
                    Spacer(modifier = Modifier.height(20.dp))

                    Row {
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.hmremodell),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Home Remodelling",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.masonry),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .
                                        fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Masonry",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }


                    }

                    //End of Row
                    Spacer(modifier = Modifier.height(20.dp))

                    Row {
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.chef),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Personal Chef",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.smarthm),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Smart Home Automations",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }


                    }
                    //End row

                    Row {
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.paint),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Paint Work",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.pestcontroll),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Pest Control",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }


                    }
                    //End of Row
                    Spacer(modifier = Modifier.height(20.dp))

                    Row {
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.plumber),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Plumbing",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.pool),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Pool Services",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }


                    }
                    //End of Row

                    Spacer(modifier = Modifier.height(20.dp))

                    Row {
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.windclean),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Window Cleaning",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.dogwalk),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Dog Walking",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }


                    }
                    //End of Row

                    Spacer(modifier = Modifier.height(20.dp))

                    Row {
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.child),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Child Care",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.security),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Security",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }


                    }
                    //End of Row
                    Spacer(modifier = Modifier.height(20.dp))

                    Row {
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.lawn),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Lawn Care",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.hvac),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "HVAC Services",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }


                    }
                    //End of Row
                    Spacer(modifier = Modifier.height(20.dp))

                    Row {
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.roofing),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Roofing services",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.handyman),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Handyman services",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }


                    }
                    //End of Row
                    Spacer(modifier = Modifier.height(20.dp))

                    Row {
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.movers),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Home-moving ",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                                Card {
                                    Image(
                                        painter = painterResource(id = R.drawable.cap),
                                        contentDescription = "cloth",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { navController.navigate(VIEW_WORKERS_URL) },
                                        contentScale = ContentScale.Crop
                                    )

                                }
                                //end of card
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Capentry",
                                fontSize = 18.sp,
                                fontFamily = FontFamily.Default
                            )

                        }


                    }
                    //End of Row

                }
                //End of Column


            }




        //BottomNav





    }




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Screen02Preview() {
    Screen02(rememberNavController())
}