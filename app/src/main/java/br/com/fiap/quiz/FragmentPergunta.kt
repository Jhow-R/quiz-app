package br.com.fiap.quiz

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentPergunta : Fragment(R.layout.fragment_pergunta) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonProxima = view.findViewById<Button>(R.id.buttonProxima)
        val radioGroupOpcao = view.findViewById<RadioGroup>(R.id.radioGroupOpcoes)

        buttonProxima.setOnClickListener {

            when (radioGroupOpcao.checkedRadioButtonId) {
                R.id.opcao1 -> {
                    navegarRespostaIncorreta()
                }
                R.id.opcao2 -> {
                    navegarRespostaIncorreta()
                }
                R.id.opcao3 -> {
                    navegarRespostaCorreta()
                }
                R.id.opcao4 -> {
                    navegarRespostaIncorreta()
                }
                else -> {
                    Toast.makeText(context, "Selecione uma opção", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun navegarRespostaCorreta() {
        findNavController().navigate(R.id.action_fragmentPergunta_to_fragmentRespostaCorreta)
    }

    private fun navegarRespostaIncorreta() {
        findNavController().navigate(R.id.action_fragmentPergunta_to_fragmentRespostaIncorreta)
    }
}