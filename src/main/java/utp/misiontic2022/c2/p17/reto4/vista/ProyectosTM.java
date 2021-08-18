/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p17.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_3;

/**
 *
 * @author Didier
 */
public class ProyectosTM extends AbstractTableModel {

    private List<Requerimiento_3> proyectos;

    public ProyectosTM() {
        this.proyectos = new ArrayList<>();
    }

    public ProyectosTM(List<Requerimiento_3> proyectos) {
        this.proyectos = proyectos;
    }

    public Requerimiento_3 getProyecto(int posRow) {
        return proyectos.get(posRow);
    }

    @Override
    public int getRowCount() {
        return proyectos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_3 proyecto = proyectos.get(row);
        switch (column) {
            case 0:
                return proyecto.getId();
            case 1:
                return proyecto.getCity();
            case 2:
                return proyecto.getClassification();
            case 3:
                return proyecto.getCost();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Ciudad";
            case 2:
                return "Clasificacion";
            case 3:
                return "Costo_Proyecto";
        }
        return super.getColumnName(column);
    }
}