package islas.mariana.peliculasapp.modelos

import islas.mariana.peliculasapp.R
import kotlin.Int

class Repositorio {

    private val usuarios = mutableListOf(
        Usuario(1, "Mari", "mari@tec.mx", 21, R.drawable.hudson),
        Usuario(2, "Zuleyca", "zule@tec.mx", 20, R.drawable.leon),
        Usuario(3, "Mariana", "mariana@tec.mx", 20, R.drawable.leon2),
        Usuario(4, "Regina", "regina@tec.mx", 20, R.drawable.jensen),
        )
    fun getUsuarios(): List<Usuario>{
        return usuarios.toList()
    }

    fun agregarUsuario(usuario: Usuario){
        usuarios.add(usuario)
    }

    private val peliculas = mutableListOf(
        Pelicula(1,"The Drama","Drama","1h 20min","Una pareja antes de su boda descubre verdades incomodas que ponen en peligro su matrimonio.", R.drawable.capybara),
        Pelicula(2,"Challengers","Drama","1h 45min","Mejores amigos muestran interes por la misma persona y un torneo de tenis pone en juego su amistad.", R.drawable.capybara),
        Pelicula(3,"Anora","Drama","1h 55min","Una mujer se enamora de un millonario ruso pero su familia no aprueba esta relación.", R.drawable.capybara),
        Pelicula(4,"Amores Perros","Drama","1h 47min","Se habla acerca del amor, amistad y lo que cada persona esta dispuesta a arriesgar para seguir adelante.", R.drawable.capybara),
        Pelicula(5,"Y tu Mamá También","Drama","1h 25min","Dos jovenes conocen a una mujer que capta su interes y deciden seguirla y llevarla a la playa.", R.drawable.capybara),
        )

    fun getPeliculas(): List<Pelicula>{
        return peliculas.toList()
    }

    fun agregarPelicula(pelicula: Pelicula){
        peliculas.add(pelicula)
    }

    fun eliminarPelicula(pelicula: Pelicula){
        peliculas.remove(pelicula)
    }

    fun editarPelicula(pelicula: Pelicula){
        val indice = peliculas.indexOfFirst { it.id == pelicula.id }

        if(indice != -1){
            peliculas[indice] = pelicula
        }
    }

}