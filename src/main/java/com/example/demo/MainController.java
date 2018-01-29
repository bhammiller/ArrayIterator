package com.example.demo;
import java.util.ArrayList;
import java.util.Iterator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
    @RequestMapping ("/")
    public ArrayList sometjhinmg(){
        ArrayIterator output = new ArrayIterator();
        ArrayList result = output.iterator();
        return result;
    }
}
