/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenmgt;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Shahryar
 */
public class CustomTableCellRenderer extends DefaultTableCellRenderer {
        public Component getTableCellRendererComponent(JTable table, Object obj, boolean isSelected, boolean hasFocus, int row, int column) {
            Component cell = super.getTableCellRendererComponent(table, obj, isSelected, hasFocus, row, column);

             String status = (String)table.getModel().getValueAt(row, column);
        if ("Consumed".equals(status)) {
            setBackground(Color.RED);
            setForeground(Color.WHITE);
        } else  if ("FREE".equals(status)) {
            setBackground(Color.GREEN);
            setForeground(Color.WHITE);
        } else{
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }      

            return cell;
        }
    }