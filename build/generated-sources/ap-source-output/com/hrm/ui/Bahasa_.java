package com.hrm.ui;

import com.hrm.ui.Bahasa;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.jdesktop.beansbinding.BindingGroup;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-10-05T09:57:03")
@StaticMetamodel(Bahasa.class)
public class Bahasa_ { 

    public static volatile SingularAttribute<Bahasa, BigInteger> employeeId;
    public static volatile SingularAttribute<Bahasa, Query> query;
    public static volatile SingularAttribute<Bahasa, JTextField> idField;
    public static volatile SingularAttribute<Bahasa, JButton> saveButton;
    public static volatile SingularAttribute<Bahasa, JLabel> idLabel;
    public static volatile SingularAttribute<Bahasa, JTable> masterTable;
    public static volatile SingularAttribute<Bahasa, Long> id;
    public static volatile SingularAttribute<Bahasa, String> tulisan;
    public static volatile SingularAttribute<Bahasa, JTextField> lisanField;
    public static volatile SingularAttribute<Bahasa, JScrollPane> masterScrollPane;
    public static volatile SingularAttribute<Bahasa, JLabel> employeeLabel;
    public static volatile SingularAttribute<Bahasa, BindingGroup> bindingGroup;
    public static volatile SingularAttribute<Bahasa, JTextField> bahasaField;
    public static volatile SingularAttribute<Bahasa, JLabel> lisanLabel;
    public static volatile SingularAttribute<Bahasa, String> lisan;
    public static volatile SingularAttribute<Bahasa, JLabel> tulisanLabel;
    public static volatile SingularAttribute<Bahasa, JButton> deleteButton;
    public static volatile ListAttribute<Bahasa, Bahasa> list;
    public static volatile SingularAttribute<Bahasa, JButton> newButton;
    public static volatile SingularAttribute<Bahasa, JButton> refreshButton;
    public static volatile SingularAttribute<Bahasa, String> bahasa;
    public static volatile SingularAttribute<Bahasa, JTextField> tulisanField;
    public static volatile SingularAttribute<Bahasa, JTextField> employeeField;
    public static volatile SingularAttribute<Bahasa, JLabel> bahasaLabel;
    public static volatile SingularAttribute<Bahasa, EntityManager> entityManager;

}