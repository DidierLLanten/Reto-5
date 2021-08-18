/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p17.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_1;

/**
 *
 * @author Didier
 */
public class LideresTM extends AbstractTableModel {

    private List<Requerimiento_1> lideres;

    public LideresTM() {
        this.lideres = new ArrayList<>();
    }

    public LideresTM(List<Requerimiento_1> lideres) {
        this.lideres = lideres;
    }

    public Requerimiento_1 getLider(int posRow) {
        return lideres.get(posRow);
    }

    @Override
    public int getRowCount() {
        return lideres.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_1 lider = lideres.get(row);
        switch (column) {
            case 0:
                return lider.getLider();
            case 1:
                return lider.getCargo();
            case 2:
                return lider.getCantidadProyectos();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Lider";
            case 1:
                return "Cargo";
            case 2:
                return "#Proyectos";
        }
        return super.getColumnName(column);
    }
}