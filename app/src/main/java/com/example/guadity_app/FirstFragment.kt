package com.example.guadity_app

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.lang.StringBuilder

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class FirstFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var nombreUsuario: TextView
    private lateinit var correoUsuario: TextView

    /*view.findViewById<FloatingActionButton>(R.id.fab_agregar_equipo).setOnClickListener {
        mostrarDialogAgregarEquipo()
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        nombreUsuario = view.findViewById(R.id.nombre_usuario)
        correoUsuario = view.findViewById(R.id.correo_usuario)
        loadUserData()

        return view
    }

    public fun equipos()
    {
        //StringBuilder sb = new StringBuilder();

    }

    private fun loadUserData() {
        val sharedPreferences = activity?.getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
        val email = sharedPreferences?.getString("Email", "")
        val nombre = sharedPreferences?.getString("Nombre", "")

        nombreUsuario.text = nombre
        correoUsuario.text = email
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    /*private fun mostrarDialogAgregarEquipo() {
        val dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_agregar_equipo, null)
        val dialogBuilder = AlertDialog.Builder(requireContext())
            .setView(dialogView)
            .setTitle("Agregar Equipo")
            .setPositiveButton("Registrar") { dialog, _ ->
                val codigoEquipo = dialogView.findViewById<EditText>(R.id.codigo_equipo).text.toString()
                val numeroEquipo = dialogView.findViewById<EditText>(R.id.numero_equipo).text.toString()
                val userId = obtenerIdUsuarioLogueado()

                registrarEquipo(codigoEquipo, numeroEquipo, userId)
                dialog.dismiss()
            }
            .setNegativeButton("Cancelar") { dialog, _ ->
                dialog.dismiss()
            }

        dialogBuilder.create().show()
    }

    holder.itemView.setOnLongClickListener {
        AlertDialog.Builder(context)
            .setTitle("Eliminar Equipo")
            .setMessage("¿Estás seguro que quieres eliminar este equipo?")
            .setPositiveButton("Sí") { _, _ ->
                desvincularEquipo(listaEquipos[position].id)
            }
            .setNegativeButton("Cancelar", null)
            .show()
        true
    }

    private fun loadEquipos() {
        val userId = obtenerIdUsuarioLogueado() // (puede ser obtenido del SharedPreferences si guardaste)

        RetrofitClient.instance.listarEquipos(userId)
            .enqueue(object : Callback<List<Equipo>> {
                override fun onResponse(call: Call<List<Equipo>>, response: Response<List<Equipo>>) {
                    if (response.isSuccessful) {
                        val equipos = response.body()
                        mostrarEquiposEnRecyclerView(equipos ?: emptyList())
                    } else {
                        showErrorToast("No se pudieron cargar los equipos")
                    }
                }

                override fun onFailure(call: Call<List<Equipo>>, t: Throwable) {
                    showErrorToast("Error de conexión: ${t.message}")
                }
            })
    }*/
}
