package com.example.practicandonav.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.practicandonav.R


class TercerFragmento : Fragment() {

    lateinit var vistaFragment2: View
    lateinit var btnFragmentReturnMain3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        vistaFragment2 = inflater.inflate(R.layout.fragment_tercer_fragmento, container, false)
        btnFragmentReturnMain3 = vistaFragment2.findViewById(R.id.btnFragmentReturnMain3)

        return vistaFragment2
    }

    override fun onStart() {
        super.onStart()

        //requireActivity().title = "Test"

        btnFragmentReturnMain3.setOnClickListener {

            var action = TercerFragmentoDirections.actionTercerFragmentoToPrimerFragmento()

            vistaFragment2.findNavController().navigate(action)

        }

    }


}