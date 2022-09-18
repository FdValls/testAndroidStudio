package com.example.practicandonav.fragments


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.practicandonav.Person
import com.example.practicandonav.R


class PrimerFragmento : Fragment() {

    lateinit var vistaFragment: View
    lateinit var btnFragmentVista1: Button
    lateinit var btnFragmentVista2: Button
    lateinit var txtInputNombre: EditText   // nombre
    lateinit var txtInputApellido: EditText // apellido
    lateinit var txtInputEmail: EditText // Email
    lateinit var p: Person


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        vistaFragment = inflater.inflate(R.layout.fragment_primer_fragmento, container, false)

        btnFragmentVista1 = vistaFragment.findViewById(R.id.btnFragmentVista1) //Vista 1
        btnFragmentVista2 = vistaFragment.findViewById(R.id.btnFragmentVista2) //Vista 2
        txtInputNombre = vistaFragment.findViewById(R.id.txtInputNombre)
        txtInputApellido = vistaFragment.findViewById(R.id.txtInputApellido)
        txtInputEmail = vistaFragment.findViewById(R.id.txtInputEmail)

        return vistaFragment
    }

    override fun onStart() {
        super.onStart()

        requireActivity().title = "Test"


        //Vista 1
        btnFragmentVista1.setOnClickListener {

            var param1 = txtInputNombre.text.toString()

            Log.d("Input Nombre:", txtInputNombre.text.toString())

            var action = PrimerFragmentoDirections.actionPrimerFragmentoToSegundoFragmento(param1)

            vistaFragment.findNavController().navigate(action)
        }

        //Vista 2
        btnFragmentVista2.setOnClickListener {

            p = Person(
                txtInputNombre.text.toString(),
                txtInputApellido.text.toString(),
                txtInputEmail.text.toString()
            )

            var enviar = PrimerFragmentoDirections.actionPrimerFragmentoToTercerFragmento(p)

            Log.d("Que tiene persona???", p.nombre)

            vistaFragment.findNavController().navigate(enviar)

        }
    }

}