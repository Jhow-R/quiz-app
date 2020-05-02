package br.com.fiap.quiz

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentPrincipal : Fragment(R.layout.fragment_principal) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonPlay = view.findViewById<Button>(R.id.buttonPlay)

        buttonPlay.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentPrincipal_to_fragmentPergunta)
        }
    }
}