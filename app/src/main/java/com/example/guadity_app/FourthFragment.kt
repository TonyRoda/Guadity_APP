package com.example.guadity_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FourthFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FourthFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false)
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FourthFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FourthFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    /*private fun listarEquipos(userId: Int) {
        RetrofitClient.instance.listarEquipos(userId)
            .enqueue(object : retrofit2.Callback<List<Equipo>> {
                override fun onResponse(call: retrofit2.Call<List<Equipo>>, response: retrofit2.Response<List<Equipo>>) {
                    if (response.isSuccessful) {
                        val listaEquipos = response.body()
                        if (listaEquipos != null) {
                            // Mostrar lista de equipos en pantalla
                            for (equipo in listaEquipos) {
                                println("Equipo: ${equipo.codEquipo} - ${equipo.num}")
                            }
                        }
                    } else {
                        showErrorToast("Error al listar equipos.")
                    }
                }

                override fun onFailure(call: retrofit2.Call<List<Equipo>>, t: Throwable) {
                    showErrorToast("Error de conexión: ${t.message}")
                }
            })
    }*/
}