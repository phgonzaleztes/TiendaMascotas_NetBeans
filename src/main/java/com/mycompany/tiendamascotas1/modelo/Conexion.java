package com.mycompany.tiendamascotas1.modelo; // OJO: Verifica que esto coincida con tu paquete real

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection con;
    
    // DATOS DE TU BASE DE DATOS (Cámbialos si son diferentes)
    String url = "jdbc:postgresql://localhost:5432/db_tienda_mascotas";
    String usuario = "postgres";
    String clave = "1234"; // <--- TU CONTRASEÑA DE PGADMIN AQUÍ
    
    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, clave);
            // JOptionPane.showMessageDialog(null, "¡Conexión Exitosa!"); // Descomenta esta linea si quieres probar si conecta
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar: " + e.toString());
        }
        return con;
    }
}