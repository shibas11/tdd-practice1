import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MovieTest {
    @Test
    public void should_return_0_when_just_created() {
        Movie movie = new Movie();
        assertThat(movie.averageRating(), is(0));
    }
}
