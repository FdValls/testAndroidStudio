package com.example.practicandonav.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.practicandonav.R


class PrimerFragmento : Fragment() {

    lateinit var vistaFragment: View
    lateinit var btnFragmentMain: Button
    lateinit var btnFragmentMain1: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        vistaFragment = inflater.inflate(R.layout.fragment_primer_fragmento, container, false)

        btnFragmentMain = vistaFragment.findViewById(R.id.btnFragmentMain)
        btnFragmentMain1 = vistaFragment.findViewById(R.id.btnFragmentMain1)

        return vistaFragment
    }

    override fun onStart() {
        super.onStart()

        requireActivity().title = "Test"

        btnFragmentMain.setOnClickListener {

            var action = PrimerFragmentoDirections.actionPrimerFragmentoToSegundoFragmento()

            vistaFragment.findNavController().navigate(action)
        }

        btnFragmentMain1.setOnClickListener {

            var action1 = PrimerFragmentoDirections.actionPrimerFragmentoToTercerFragmento()

            vistaFragment.findNavController().navigate(action1)
            //Realizar el challenger

        }

    }

}