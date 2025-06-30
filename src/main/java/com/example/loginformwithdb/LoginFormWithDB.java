/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.loginformwithdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class LoginFormWithDB {
    private static Connection connector;
    private static String dbName = "java_login_form";
    
    public static void main(String[] args) {
        try {
            connector = DriverManager.getConnection("jdbc:mysql://localhost/" + dbName, "root", "");
        } catch (SQLException sqle) {
             System.err.printf("Cannot establish connection to '%s'.\nReason: %s\n", dbName, sqle.getMessage());
             return;
        }
        LoginJFrame form = new LoginJFrame(connector);
        form.setVisible(true);
    }
}
