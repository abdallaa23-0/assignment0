package com.example.decisionmakingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
                        Greeting(name = "Abdalla")
                        JapanTrip()
                    }
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Text(
        text = stringResource(R.string.nameLabel),
        modifier = modifier.padding(2.dp)
    )
    Text(
        text = stringResource(R.string.ccidLabel),
        modifier = modifier.padding(33.dp)
    )
    Text(
        text = stringResource(R.string.idLabel),
        modifier = modifier.padding(46.dp)
    )

}

@Composable
fun JapanTrip(modifier: Modifier = Modifier){

    Column(
        modifier = modifier.padding(100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(onClick = {/*TODO*/ }) {
            Text(stringResource(R.string.yeah))
        }
    }
}
