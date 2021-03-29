package ada.edu.project.Library.repositiries;

import ada.edu.project.Library.domain.Book;
import ada.edu.project.Library.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FetchDataService extends JpaRepository<Book,Integer> {
    @Override
    List<Book> findAll();

}
