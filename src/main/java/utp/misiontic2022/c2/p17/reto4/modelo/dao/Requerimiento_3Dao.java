package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {

        ArrayList<Requerimiento_3> proyectos = new ArrayList<>();
        String sqlConsulta = "SELECT  c.ID_Proyecto , Ciudad , Clasificacion , SUM(mc.Precio_Unidad * c.Cantidad)"
                + " AS 'Costo_Proyecto' "
                + "FROM Proyecto p NATURAL JOIN (Compra c NATURAL JOIN MaterialConstruccion mc)"
                + " GROUP BY Ciudad, Clasificacion , p.ID_Proyecto "
                + "HAVING p.Ciudad IN('Sta. Rosa de Cabal', 'Pereira') AND Costo_Proyecto>87000 "
                + "ORDER BY Ciudad , Clasificacion , p.ID_Proyecto ;";

        try (
            Connection connection = JDBCUtilities.getConnection();
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sqlConsulta);
            ) {
                while(rs.next()){
                    Requerimiento_3 auxProyecto = new Requerimiento_3();
                    auxProyecto.setId(rs.getInt("ID_Proyecto"));
                    auxProyecto.setCity(rs.getString("Ciudad"));
                    auxProyecto.setClassification(rs.getString("Clasificacion"));
                    auxProyecto.setCost(rs.getInt("Costo_Proyecto"));                   

                    proyectos.add(auxProyecto);
                }
        } 
        return proyectos;        
    }
}