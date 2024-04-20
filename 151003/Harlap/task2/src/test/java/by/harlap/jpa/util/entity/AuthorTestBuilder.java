package by.harlap.jpa.util.entity;

import by.harlap.jpa.model.Author;
import by.harlap.jpa.util.TestBuilder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;

@AllArgsConstructor
@NoArgsConstructor(staticName = "author")
@With
public class AuthorTestBuilder implements TestBuilder<Author> {

    private Long id = 1L;
    private String login = "author2456";
    private String password = "asdfghj241";
    private String firstname = "firstname1294";
    private String lastname = "lastname6724";

    @Override
    public Author build() {
        Author author = new Author();

        author.setId(id);
        author.setLogin(login);
        author.setFirstname(firstname);
        author.setPassword(password);
        author.setLastname(lastname);

        return author;
    }
}
