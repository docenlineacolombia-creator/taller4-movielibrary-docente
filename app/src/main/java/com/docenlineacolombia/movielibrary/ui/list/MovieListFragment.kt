package com.docenlineacolombia.movielibrary.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.docenlineacolombia.movielibrary.databinding.FragmentMovieListBinding

/**
 * Fragmento de lista de películas.
 * Aquí el estudiante deberá:
 * - Conectarse al MovieViewModel.
 * - Observar la lista de películas vía LiveData.
 * - Configurar el RecyclerView.
 * - Navegar al detalle y a la pantalla de edición.
 */
class MovieListFragment : Fragment() {

    private var _binding: FragmentMovieListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMovieListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
