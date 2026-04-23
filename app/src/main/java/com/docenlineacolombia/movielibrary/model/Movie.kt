package com.docenlineacolombia.movielibrary.model

/**
 * Modelo de dominio para una película.
 * El estudiante puede extender esta clase según los requerimientos del taller.
 */
data class Movie(
    val id: Int = 0,
    val title: String,
    val year: Int,
    val genre: String,
    val rating: Int,
    val watched: Boolean
)
