package islas.mariana.peliculasapp.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import islas.mariana.peliculasapp.R
import islas.mariana.peliculasapp.modelos.Pelicula
import islas.mariana.peliculasapp.modelos.Repositorio
import islas.mariana.peliculasapp.modelos.Usuario

class PeliculaViewModel(val repo: Repositorio): ViewModel() {

    private val _peliculas = mutableStateOf<List<Pelicula>>(emptyList())
    val peliculas: State<List<Pelicula>> = _peliculas

    init{
        getPeliculas()
    }

    private fun getPeliculas(){
        _peliculas.value = repo.getPeliculas()
    }

    fun agregarPelicula(titulo: String, categoria: String, duracion: String, sinopsis: String, fotoUri: String?){
        val nuevoId = peliculas.value.size + 1
        val peli = Pelicula(nuevoId, titulo, categoria, duracion, sinopsis, R.drawable.bootstrap_person_circle, fotoUri)
        repo.agregarPelicula(peli)

        _peliculas.value = repo.getPeliculas()
    }

    fun eliminarPelicula(pelicula: Pelicula){
        repo.eliminarPelicula(pelicula)
        _peliculas.value = repo.getPeliculas()
    }

    fun editarPelicula(id: Int, titulo: String, categoria: String, duracion: String, sinopsis: String, fotoUri: String?){
        val peli = Pelicula(id, titulo, categoria, duracion, sinopsis,  R.drawable.bootstrap_person_circle, fotoUri)
        repo.editarPelicula(peli)

        _peliculas.value = repo.getPeliculas()
    }
}