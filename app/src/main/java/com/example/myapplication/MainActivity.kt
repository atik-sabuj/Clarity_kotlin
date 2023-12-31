package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

//clarity packages
import com.microsoft.clarity.Clarity
import com.microsoft.clarity.ClarityConfig



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

// clarity codes and Project ID write here
        val config = ClarityConfig("joos8fevel")
        Clarity.initialize(applicationContext, config)
        //end of clarity code

        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    ShowConfig(config)     //Clarity Project ID Shows here

                    /*Greeting("Android")*/

                }
            }
        }
    }
}


//Clarity Project ID methods here

@Composable
fun ShowConfig(config: ClarityConfig, modifier: Modifier = Modifier) {
    Text(
        text = config.toString(),
        modifier = modifier
    )
}

// End of Clarity Method




/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
*/



/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}
*/
