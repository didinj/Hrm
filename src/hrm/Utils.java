/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hrm;

import java.awt.Component;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 *
 * @author DIDIN
 */
public class Utils {
    public void enabledForm(JPanel panel) {
        Component[] components = panel.getComponents();
        for (Component comp:components) {
            comp.setEnabled(true);
        }
    }
    
    public void disabledForm(JPanel panel) {
        Component[] components = panel.getComponents();
        for (Component comp:components) {
            comp.setEnabled(false);
        }
    }
    
    public void clearForm(JPanel panel) {
        Component[] components = panel.getComponents();
        for (Component comp:components) {
            if(comp instanceof JTextField || comp instanceof JTextArea) {
                ((JTextComponent) comp).setText("");
            }
        }
    }
       
    public void refreshData(EntityManager em,Query query,List list) {
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            em.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }
}
