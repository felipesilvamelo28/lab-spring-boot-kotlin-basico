package br.com.blacklab.labspringbootkotlinbasico.entity

import javax.persistence.*

@Entity
@Table(name = "book")
data class BookEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String,
    val year: String,
    val edition: Double,
    val author: String
)
