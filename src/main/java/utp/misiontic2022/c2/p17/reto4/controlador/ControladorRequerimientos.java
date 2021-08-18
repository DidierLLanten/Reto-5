package utp.misiontic2022.c2.p17.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p17.reto4.modelo.dao.Requerimiento_1Dao;
import utp.misiontic2022.c2.p17.reto4.modelo.dao.Requerimiento_2Dao;
import utp.misiontic2022.c2.p17.reto4.modelo.dao.Requerimiento_3Dao;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;

public class ControladorRequerimientos {

    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        Requerimiento_1Dao rq1 = new Requerimiento_1Dao();
        return rq1.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        Requerimiento_2Dao rq2 = new Requerimiento_2Dao();
        return rq2.requerimiento2();
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        Requerimiento_3Dao rq3 = new Requerimiento_3Dao();
        return rq3.requerimiento3();
    }
}