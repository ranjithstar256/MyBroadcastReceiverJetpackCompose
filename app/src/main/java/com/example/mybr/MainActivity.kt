package com.example.mybr

import android.content.Intent
import android.content.IntentFilter
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
import com.example.mybr.ui.theme.MyBRTheme

class MainActivity : ComponentActivity() {
    lateinit var receiver: MyReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBRTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                    // context = this = current class name = current activity
                    // alert dia = toast =etc =
                    // intent = switch bw activity
                    // navigation
                ) {
                    receiver = MyReceiver()

                    val k = IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
                    registerReceiver(receiver, k)
                 }
            }
        }
    }
}
