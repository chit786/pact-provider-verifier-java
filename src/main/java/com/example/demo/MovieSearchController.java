package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/movies")
public class MovieSearchController {

    private List<Show> showData = Arrays.asList(
            new Show("Ozark", 5),
            new Show("Stranger Things", 5)
    );

    @GetMapping
    public List<Show> getMovies(@RequestParam("titleFilter") Optional<String> titleFilter) {
        if(titleFilter.isPresent()) {
            return showData.stream().filter(s -> s.getTitle().startsWith(titleFilter.get())).collect(Collectors.toList());
        }
        return showData;
    }
}
