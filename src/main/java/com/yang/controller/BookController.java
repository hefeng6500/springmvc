package com.yang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

//@Controller
@RestController // @Controller + ReponseBody
@RequestMapping("/book")
public class BookController {
    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save..." + book);
        return "{'module':'book save'}";
    }

    //@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("book delete..." + id);
        return "{'module':'book delete'}";
    }

    //@RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody Book book){
        System.out.println("book update..." + book);
        return "{'module':'book update'}";
    }

    //@RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("book getById..." + id);
        return "{'module':'book getById'}";
    }

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String getAll(){
        System.out.println("book getAll...");
        return "{'module':'book getAll'}";
    }
//    @RequestMapping(value = "/books",method = RequestMethod.POST)
//    @ResponseBody
//    public String save(@RequestBody Book book){
//        System.out.println("book save..." + book);
//        return "{'module':'book save'}";
//    }
//
//    @RequestMapping(value = "/books/{id}",method = RequestMethod.DELETE)
//    @ResponseBody
//    public String delete(@PathVariable Integer id){
//        System.out.println("book delete..." + id);
//        return "{'module':'book delete'}";
//    }
//
//    @RequestMapping(value = "/books",method = RequestMethod.PUT)
//    @ResponseBody
//    public String update(@RequestBody Book book){
//        System.out.println("book update..." + book);
//        return "{'module':'book update'}";
//    }
//
//    @RequestMapping(value = "/books/{id}",method = RequestMethod.GET)
//    @ResponseBody
//    public String getById(@PathVariable Integer id){
//        System.out.println("book getById..." + id);
//        return "{'module':'book getById'}";
//    }
//
//    @RequestMapping(value = "/books",method = RequestMethod.GET)
//    @ResponseBody
//    public String getAll(){
//        System.out.println("book getAll...");
//        return "{'module':'book getAll'}";
//    }
//    @RequestMapping("/save")
//    @ResponseBody
//    public String save(){
//        System.out.println("book save ...");
//        return "{'module':'book save'}";
//    }
}
