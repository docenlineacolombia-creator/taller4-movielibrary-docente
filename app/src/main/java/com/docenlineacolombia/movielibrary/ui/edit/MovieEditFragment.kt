package com.docenlineacolombia.movielibrary.ui.edit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.docenlineacolombia.movielibrary.databinding.FragmentMovieEditBinding

/**
 * Fragmento para crear o editar una película.
 * El estudiante debe:
 * - Usar este fragment en modo creación (sin id) y edición (con id).
 * - Llenar el formulario con los datos actuales cuando corresponda.
 * - Guardar cambios a través del ViewModel/Repository.
 */
class MovieEditFragment : Fragment() {

    private var _binding: FragmentMovieEditBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMovieEditBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
