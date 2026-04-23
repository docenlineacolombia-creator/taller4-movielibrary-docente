package com.docenlineacolombia.movielibrary.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.docenlineacolombia.movielibrary.databinding.FragmentMovieDetailBinding

/**
 * Fragmento de detalle de película.
 * Aquí el estudiante deberá:
 * - Recibir el argumento movieId (Bundle primero, luego Safe Args).
 * - Observar el LiveData de una película concreta.
 * - Permitir marcar como vista/no vista, editar y eliminar.
 */
class MovieDetailFragment : Fragment() {

    private var _binding: FragmentMovieDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMovieDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
