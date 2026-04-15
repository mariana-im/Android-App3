package islas.mariana.peliculasapp.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import islas.mariana.peliculasapp.modelos.Pelicula
import islas.mariana.peliculasapp.modelos.Repositorio
import islas.mariana.peliculasapp.modelos.Usuario

class PeliculaViewModel(val repo: Repositorio): ViewModel() {
    private val _peliculas = mutableStateOf<List<Pelicula>>(emptyList())
    val peliculas: State<List<Pelicula>> = _peliculas


    init {
        getPeliculas()
    }

    private fun getPeliculas() {
        _peliculas.value = repo.getPeliculas()

    }
}