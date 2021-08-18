/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p17.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.c2.p17.reto4.modelo.vo.Requerimiento_2;

/**
 *
 * @author Didier
 */
public class MaterialesTM extends AbstractTableModel {

    private List<Requerimiento_2> materiales;

    public MaterialesTM() {
        this.materiales = new ArrayList<>();
    }

    public MaterialesTM(List<Requerimiento_2> materiales) {
        this.materiales = materiales;
    }

    @Override
    public int getRowCount() {
        return materiales.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Requerimiento_2 material = materiales.get(row);
        switch (column) {
            case 0:
                return material.getId();
            case 1:
                return material.getmaterial();
            case 2:
                return material.getAmount();
            case 3:
                return material.getUnitaryPrice();
            case 4:
                return material.getTotalPrice();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Material";
            case 2:
                return "Cantidad";
            case 3:
                return "Precio Unidad";
            case 4:
                return "Precio Total";
        }
        return super.getColumnName(column);
    }
}