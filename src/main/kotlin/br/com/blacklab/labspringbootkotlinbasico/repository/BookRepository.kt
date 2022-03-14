package br.com.blacklab.labspringbootkotlinbasico.repository

import br.com.blacklab.labspringbootkotlinbasico.entity.BookEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository: JpaRepository<BookEntity, Long>