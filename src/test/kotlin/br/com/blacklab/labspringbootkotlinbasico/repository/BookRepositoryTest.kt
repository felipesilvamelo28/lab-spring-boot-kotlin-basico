package br.com.blacklab.labspringbootkotlinbasico.repository

import br.com.blacklab.labspringbootkotlinbasico.entity.BookEntity
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.jdbc.Sql

@SpringBootTest
@ActiveProfiles("test")
@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = ["classpath:db/BookRepositoryTest-before.sql"])
@Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, scripts = ["classpath:db/BookRepositoryTest-after.sql"])
class BookRepositoryTest(
    @Autowired private val repository: BookRepository
){
    companion object{
        const val BOOK_SIZE = 2
    }

    @Test
    fun testFindAll(){
        //recuperei a lista
        val list: List<BookEntity> = repository.findAll()
        //comparei o valor
        Assertions.assertThat(list.size).isEqualTo(BOOK_SIZE)
    }
}