package pl.idea4u.entities.idea;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IdeaRepository extends JpaRepository<Idea, Long>{

//    @Query(value = "SELECT *" +
//            " FROM SYS.IDEA" +
//            " WHERE IDEA_AVAL='Y'" +
//            " ORDER BY IDEA_PK DESC LIMIT 10",
//            nativeQuery = true)
//    List<Idea> findLastTenIdeas();





//    @Query(value = "SELECT * FROM SYS.IDEA WHERE IDEA_AVAL='Y' ORDER BY IDEA_PK DESC LIMIT 10",
//            nativeQuery = true)
//    List<Idea> findLastTenAddedIdeas();
//
//    @Query(value = "START TRANSACTION;\n" +
//            "INSERT INTO SYS.IDEA\n" +
//            "(IDEA_DESC,\n" +
//            "IDEA_CATEGORY)\n" +
//            "VALUES\n" +
//            "( :description ,\n" +
//            " :category);" +
//            "SELECT LAST_INSERT_ID();\n" +
//            "COMMIT;",
//            nativeQuery = true)
//    int addNewIdea(
//            @Param("description") String description,
//            @Param("category") int category);





}
