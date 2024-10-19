package movie.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    // Save or update movie
    public Movieapp saveMovie(Movieapp movie) {
        return movieRepository.save(movie);
    }

    // Fetch all movies
    public List<Movieapp> getAllMovies() {
        return movieRepository.findAll();
    }

    // Fetch movie by ID
    public Movieapp getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    // Delete movie by ID
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
