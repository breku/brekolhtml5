package com.brekol.service;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created with IntelliJ IDEA.
 * User: Breku
 * Date: 12.03.13
 * Time: 21:08
 * To change this template use File | Settings | File Templates.
 */
public class EMFService {

    private static final EntityManagerFactory emfInstance = Persistence.createEntityManagerFactory("transactions-optional");

    private EMFService() {
    }

    public static EntityManagerFactory get() {
        return emfInstance;
    }
}
