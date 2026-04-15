package islas.mariana.peliculasapp.modelos

import kotlin.Int

class Repositorio {

    fun getUsuarios(): List<Usuario>{
        return listOf(
            Usuario(1, "Mario", "mparra@tec.mx", 30),
            Usuario(2, "Zuleyca", "zule@tec.mx", 20),
            Usuario(3, "Mariana", "mariana@tec.mx", 20),
            Usuario(4, "Regina", "regina@tec.mx", 20),
        )


    }

    fun getPeliculas(): List<Pelicula>{
        return listOf(
            Pelicula(1,"The Drama","Drama","1h 20min","Una pareja antes de su boda descubre verdades incomodas que ponen en peligro su matrimonio."),
            Pelicula(2,"Challengers","Drama","1h 45min","Mejores amigos muestran interes por la misma persona y un torneo de tenis pone en juego su amistad."),
            Pelicula(3,"Anora","Drama","1h 55min","Una mujer se enamora de un millonario ruso pero su familia no aprueba esta relación."),
            Pelicula(4,"Amores Perros","Drama","1h 47min","Se habla acerca del amor, amistad y lo que cada persona esta dispuesta a arriesgar para seguir adelante."),
            Pelicula(5,"Y tu Mamá También","Drama","1h 25min","Dos jovenes conocen a una mujer que capta su interes y deciden seguirla y llevarla a la playa."),

        )


    }
}