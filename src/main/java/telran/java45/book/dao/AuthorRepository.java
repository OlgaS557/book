package telran.java45.book.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import telran.java45.book.model.Author;

public interface AuthorRepository extends CrudRepository<Author, String> {
	@Query("delete a.name from Author a join Book b join b.authors where b.isbn=a.name=?1")
	Author deleteAuthor(String name);

}
