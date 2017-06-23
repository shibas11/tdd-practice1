import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MovieTest {
    @Test
    public void should_return_0_when_just_created() {
        Movie movie = new Movie();
        assertThat(movie.averageRating(), is(0));
    }

    @Test
    public void should_return_1_when_1_was_rated() {
        Movie movie = new Movie();
        movie.rate(1);
        assertThat(movie.averageRating(), is(1));
    }
}
