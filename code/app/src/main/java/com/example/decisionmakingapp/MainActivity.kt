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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.decisionmakingapp.ui.theme.DecisionMakingAppTheme
import kotlin.random.Random

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
    var decision by remember{mutableStateOf("")}
    var clickerTracker by remember { mutableIntStateOf(0) }

    Column(modifier = modifier.fillMaxSize().padding(50.dp)) {
        Text(
            text = "Abdalla Ali\nCCID: abdalla5\nID: 1848812"


        )
        Text(
            text = "Should we go?: $decision",
            fontSize = 30.sp,
            modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp, vertical = 40.dp)

        )
        Text(text = "Clicks counted: $clickerTracker")

        Row(modifier = Modifier.fillMaxWidth()) {

            Spacer(modifier = Modifier.height(150.dp))
            Button(onClick = {clickerTracker++
                decision = if(Random.nextInt(100)<50) "Yes" else "No"}) {
                Text("Yeah")

            }
            Button(onClick = {clickerTracker++
                decision = if(Random.nextInt(100)<25) "Yes" else "No"
            }) {

                Text("Maybe")
            }
            Button(onClick = {clickerTracker++
            decision = if(Random.nextInt(100)<10)"Yes" else "No"}) {
                Text("Nah")
            }


        }

    }
}
