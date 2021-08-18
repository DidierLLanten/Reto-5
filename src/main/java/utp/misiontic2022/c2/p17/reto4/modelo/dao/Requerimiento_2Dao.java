package utp.misiontic2022.c2.p17.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p17.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        
        ArrayList<Requerimiento_2> materiales = new ArrayList<>();
        String sqlConsulta = "SELECT mc.ID_MaterialConstruccion , mc.Nombre_Material , c.Cantidad ,"
                + " mc.Precio_Unidad , c.Cantidad * mc.Precio_Unidad AS 'Precio_Total' "
                + "FROM MaterialConstruccion mc NATURAL JOIN (Compra c NATURAL JOIN Proyecto p )"
                + " WHERE ID_Proyecto IN(14,20,18,36,45,48,56) "
                + "ORDER BY ID_Proyecto , mc.Precio_Unidad DESC ;";

        try (
            Connection connection = JDBCUtilities.getConnection();
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(sqlConsulta);
            ) {
                while(rs.next()){
                    Requerimiento_2 auxMaterial = new Requerimiento_2();
                    auxMaterial.setId(rs.getInt("ID_MaterialConstruccion"));
                    auxMaterial.setmaterial(rs.getString("Nombre_Material"));
                    auxMaterial.setAmount(rs.getInt("Cantidad"));
                    auxMaterial.setUnitaryPrice(rs.getInt("Precio_Unidad"));
                    auxMaterial.setTotalPrice(rs.getInt("Precio_Total"));

                    materiales.add(auxMaterial);
                }
        } 
        return materiales;
    }
}