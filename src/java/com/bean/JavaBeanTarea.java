/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;
import com.bean.EntityManagerFactor;
import com.jpa.controlador.TareaJpaController;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author gonzalo.araya
 */
public class JavaBeanTarea {
        private EntityManagerFactory emf;
        private TareaJpaController tareaControl;
        public JavaBeanTarea (){
            emf = Persistence.createEntityManagerFactory("tareaICPU");
            tareaControl = new TareaJpaController(emf);
        }
        public void guardar(Tarea tarea){
            //tareaControl.create(tarea);
        }
    }
        
