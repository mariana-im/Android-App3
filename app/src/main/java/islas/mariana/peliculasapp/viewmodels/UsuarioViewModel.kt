package islas.mariana.peliculasapp.viewmodels

import android.net.Uri
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import islas.mariana.peliculasapp.R
import islas.mariana.peliculasapp.modelos.Repositorio
import islas.mariana.peliculasapp.modelos.Usuario

class UsuarioViewModel(val repo: Repositorio): ViewModel() {
    private val _usuarios = mutableStateOf<List<Usuario>>(emptyList())
    val usuarios: State<List<Usuario>> = _usuarios



    init {
        getUsuarios()
    }

    private fun getUsuarios(){
        _usuarios.value = repo.getUsuarios()

    }
    fun agregarUsuario(nombre: String, correo: String, edad: Int, fotoUri: String){
//        val nuevoId = _usuarios.value.size + 1
//        val usu = Usuario(nuevoId, nombre, correo, edad, R.drawable.bootstrap_person_circle)
//        repo.agregarUsuario(usu)
//
//        _usuarios.value = repo getUsuarios()
    }

}