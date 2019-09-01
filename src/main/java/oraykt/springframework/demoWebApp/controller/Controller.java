package oraykt.springframework.demoWebApp.controller;

import oraykt.springframework.demoWebApp.services.MovieServiceHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Controller {
    @Autowired
        MovieServiceHandler movieServiceHandler;

    @RequestMapping(method = RequestMethod.GET, value = "/api/movies")
    public String getMovies (HttpServletRequest request, HttpServletResponse response){
        System.out.println("Test");
        return "";
    }
}
