/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

import becker.robots.City;

/**
 *
 * @author Cristian Sarmiento
 */
public class Main {
    public static void main(String[] args) {
        City Ny= new City();
        Recojeryponer acciones= new Recojeryponer(Ny);
        acciones.asignaciones(Ny, 3, 2, 5, 4, 6);
    }
}
