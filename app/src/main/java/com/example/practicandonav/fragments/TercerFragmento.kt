package com.example.practicandonav.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import com.example.practicandonav.Person
import com.example.practicandonav.R
import java.io.Serializable


class TercerFragmento : Fragment(), Serializable {

    lateinit var vistaFragment2: View
    lateinit var btnFragmentReturnMain3: Button
    lateinit var titleWindow: TextView
    lateinit var personView: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        vistaFragment2 = inflater.inflate(R.layout.fragment_tercer_fragmento, container, false)
        btnFragmentReturnMain3 = vistaFragment2.findViewById(R.id.btnFragmentReturnMain3)
        titleWindow = vistaFragment2.findViewById(R.id.textView2)
        personView = TercerFragmentoArgs.fromBundle(requireArguments()).persona

        Log.d("Nombre persona vista 2", personView.nombre)


        return vistaFragment2
    }

    override fun onStart() {
        super.onStart()

        titleWindow.text = personView.email

        btnFragmentReturnMain3.setOnClickListener {

            var action = TercerFragmentoDirections.actionTercerFragmentoToPrimerFragmento()

            vistaFragment2.findNavController().navigate(action)

        }
    }

}