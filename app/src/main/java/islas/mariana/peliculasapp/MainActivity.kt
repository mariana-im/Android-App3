package islas.mariana.peliculasapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import islas.mariana.peliculasapp.modelos.Repositorio
import islas.mariana.peliculasapp.ui.theme.PeliculasAppTheme
import islas.mariana.peliculasapp.viewmodels.PeliculaViewModel
import islas.mariana.peliculasapp.viewmodels.PeliculaViewModelFactory
import islas.mariana.peliculasapp.viewmodels.UsuarioViewModel
import islas.mariana.peliculasapp.viewmodels.UsuarioViewModelFactory
    import islas.mariana.peliculasapp.vistas.PeliculaScreen
import islas.mariana.peliculasapp.vistas.UsuarioScreen

class MainActivity : ComponentActivity() {
    private val TAG = "PELICULAS"

    private val viewModel: PeliculaViewModel by viewModels {
        PeliculaViewModelFactory(Repositorio())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        Log.d(TAG, "Create")

        Toast.makeText(this, "Create", Toast.LENGTH_SHORT).show()
        setContent {
//            PeliculasAppTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
            PeliculaScreen(viewModel = viewModel)
        }
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "Start")
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "Resume")
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this, "Destroy", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "Destroy")
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "Stop")
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this, "Pause", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "Pause")
    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(this, "Restart", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "Restart")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

