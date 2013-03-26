package com.brekol.controller;

import com.brekol.model.User;
import com.brekol.service.EMFService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Breku
 * Date: 10.03.13
 */
@Controller
@RequestMapping(value = {"/","index","home"})
public class IndexController {



    @RequestMapping(method = RequestMethod.GET)
    public String init(){

        System.out.println("AAaA");
        EntityManagerFactory x = EMFService.get();
        EntityManager entityManager = x.createEntityManager();
        entityManager.getTransaction().begin();
        User u1 = new User("u1");
        u1.setId(new Long(1));
        entityManager.persist(u1);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "home/index";
    }
}
