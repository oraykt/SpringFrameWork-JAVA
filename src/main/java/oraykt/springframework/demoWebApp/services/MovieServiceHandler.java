package oraykt.springframework.demoWebApp.services;

import oraykt.springframework.demoWebApp.model.Movie;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MovieServiceHandler  {

    public Movie getMovies(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse);
}
