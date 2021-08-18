package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {

        ArrayList<Requerimiento_1> lideres = new ArrayList<>();
        String sqlConsulta = "SELECT l.Nombre ||' ' || l.Primer_Apellido AS Lider, l.Cargo, "
                + "COUNT(p.ID_Lider) AS '# Proyectos' "
                + "FROM Proyecto p JOIN Lider l USING (ID_Lider) "
                + "WHERE p.Constructora = 'Pegaso' "
                + "GROUP BY l.ID_Lider "
                + "ORDER BY l.Cargo, Lider ;";

        try (
            Connection connection = JDBCUtilities.getConnection();
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sqlConsulta);
            ) {
                while(rs.next()){
                    Requerimiento_1 auxLider = new Requerimiento_1();
                    auxLider.setLider(rs.getString("Lider"));
                    auxLider.setCargo(rs.getString("Cargo"));
                    auxLider.setCantidadProyectos(rs.getInt("# Proyectos"));                   

                    lideres.add(auxLider);
                }
        } 
        return lideres;
    }
}