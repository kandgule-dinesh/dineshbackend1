package movie.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // Create or update a movie
    @PostMapping("/save")
    public Movieapp saveMovie(@RequestBody Movieapp movie) {
        return movieService.saveMovie(movie);
    }

    // Get all movies
    @GetMapping("/all")
    public List<Movieapp> getAllMovies() {
        return movieService.getAllMovies();
    }

    // Get a movie by ID
    @GetMapping("/{id}")
    public Movieapp getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    // Delete a movie by ID
    @DeleteMapping("/delete/{id}")
    public void deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
    }
}
