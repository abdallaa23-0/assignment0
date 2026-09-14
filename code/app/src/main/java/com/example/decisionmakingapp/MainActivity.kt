package com.example.decisionmakingapp



import android.os.Bundle
import com.example.decisionmakingapp.R
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.benchmark.traceprocessor.Row
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.decisionmakingapp.ui.theme.DecisionMakingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DecisionMakingAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {

                        JapanTrip()
                    }
                }
            }
        }
    }
}




@Composable
fun JapanTrip(modifier: Modifier = Modifier){
    Text(
        text = "Abdalla Ali\nCCID: abdalla5\nID: 1848812"


    )
    Column(
        modifier = modifier.padding(100.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        Spacer(modifier = Modifier.height(30.dp).width(30.dp))
        Button(onClick = {/*TODO*/ }) {
            Text("Yeah")

        }
        Button(onClick = {/*TODO*/ }) {
            Text("Maybe")
        }
        Button(onClick = {/*TODO*/ }) {
            Text("Nah")
        }
    }
}
