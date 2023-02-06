package br.com.academico.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FabricaDeConexoes {

  public static Connection pegarConexao() throws Exception {
    String protocolo = "jdbc:mysql://";
    String servidor = "localhost";
    String BD = "bdacademico";
    String usuario = "uacademico";
    String senha = "#Uacad10";

    return DriverManager.getConnection(protocolo + servidor + "/" + BD, usuario, senha);
  }
  
  public static void encerrarRecursosBD(Connection con) throws Exception {
    if (con != null)
      con.close();
  }
  
  public static void encerrarRecursosBD(Connection con, Statement stmt) throws Exception {
    encerrarRecursosBD(con);
    if (stmt != null)
      stmt.close();
  }
  
  public static void encerrarRecursosBD(Connection con, Statement stmt, ResultSet rs) throws Exception {
    encerrarRecursosBD(con, stmt);
    if (rs != null)
      rs.close();
  }
}
