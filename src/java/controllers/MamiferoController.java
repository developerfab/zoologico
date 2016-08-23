/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.ListaAnimales;
import models.mamifero.Ballena;
import models.mamifero.Gato;
import models.mamifero.Perro;

/**
 *
 * @author fabricio
 */
public class MamiferoController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            System.out.println("alksdfjlkadsjfaldksjfalkdsjflsakdsjflakdñsjfalsdkjad");
            System.out.println("tipo: "+ request.getParameter("tipo"));
            String tipo = request.getParameter("tipo");
            String nombre = request.getParameter("nombre");
            if (tipo.equals("ballena")){
                crearBallena(nombre);
            }else if(tipo.equals("gato")){
                crearGato(nombre);
            }else if(tipo.equals("perro")){
                crearPerro(nombre);
            }
            /* TODO output your page here. You may use following sample code. */
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        response.sendRedirect("crear_mamifero_form.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public void crearBallena(String nombre){
        Ballena ballena = new Ballena(nombre);
        ListaAnimales lista = ListaAnimales.getListaAnimales();
        lista.adicionar(ballena);
    }
    
    public void crearGato(String nombre){
        Gato gato = new Gato(nombre);
        ListaAnimales lista = ListaAnimales.getListaAnimales();
        lista.adicionar(gato);
        
    }
    
    public void crearPerro(String nombre){
        Perro perro = new Perro(nombre);
        ListaAnimales lista = ListaAnimales.getListaAnimales();
        lista.adicionar(perro);
    }
}
