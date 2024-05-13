package com.example.wazitoecommerce.ui.theme.screens.service

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.data.WorkerViewModel
import com.example.wazitoecommerce.models.Worker
import com.example.wazitoecommerce.navigation.SCREEN01_URL
import com.example.wazitoecommerce.navigation.SCREEN02_URL
import com.example.wazitoecommerce.ui.theme.Purple41
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewWorkers(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current
        var workerRepository = WorkerViewModel(navController, context)


        val emptyWorkerState = remember { mutableStateOf(Worker("","","","","","","")) }
        var emptyWorkersListState = remember { mutableStateListOf<Worker>() }

        var workers = workerRepository.allWorkers(emptyWorkerState, emptyWorkersListState)


        Column(
            modifier = Modifier
                .fillMaxSize()
                .paint(painterResource(id = R.drawable.w1), contentScale = ContentScale.FillBounds),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

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
            Text(text = "All Workers",
                fontSize = 30.sp,
                fontFamily = FontFamily.Monospace,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){
                items(workers){
                    WorkerItem(
                        name = it.name,
                        email = it.email,
                        password= it.password,
                        servicesOffered = it.servicesOffered,
                        pricing = it.pricing,
                        availability = it.availability,
                        id = it.id,
                        navController = navController,
                        workerRepository = workerRepository,
                        workerImage = it.imageUrl
                    )
                }
            }
        }
    }
}


@Composable
fun WorkerItem(name:String, email:String, password:String, servicesOffered:String, pricing:String, availability:String, id:String,
                        navController:NavHostController,
                        workerRepository:WorkerViewModel, workerImage:String) {

    Column(modifier = Modifier
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = name)
        Text(text = email)
        Text(text = password)
        Text(text = servicesOffered)
        Text(text = pricing)
        Text(text = availability)
        Box (modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)){
            Image(
                painter = rememberAsyncImagePainter(workerImage),
                contentDescription = null,
                modifier = Modifier.size(250.dp)
            )

        }

        Row {

            Button(onClick = {
                //navController.navigate(ROUTE_UPDATE_WORKERS+"/$id")
            },colors = ButtonDefaults.buttonColors(Purple41)) {
                Text(text = "Book")
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(onClick = {
                //navController.navigate(ROUTE_UPDATE_WORKERS+"/$id")
            },colors = ButtonDefaults.buttonColors(Purple41)) {
                Text(text = "Update")
            }

        }

    }
}

@Composable
@Preview(showBackground = true)
fun ViewWorkersPreview(){
    WazitoECommerceTheme {
        ViewWorkers(navController = rememberNavController())
    }
}