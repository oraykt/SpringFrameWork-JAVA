package oraykt.springframework.demoWebApp.services.Imp;

import oraykt.springframework.demoWebApp.model.Movie;
import oraykt.springframework.demoWebApp.services.MovieServiceHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MovieService implements MovieServiceHandler {
    @Override
    public Movie getMovies(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        /*
            call provider by MongoDb.

            It would be getting all datas from movies collections by MongoDb

         */
        Movie movie = new Movie();


        return movie;
    }
}
