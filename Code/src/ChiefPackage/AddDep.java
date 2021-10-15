package ChiefPackage;

import Classes.*;
import static LoginPackage.LoginForm.*;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddDep extends javax.swing.JPanel {

    DepChief dep;
    BorderLayout b;
    
    public AddDep() {
        initComponents();
        IDTxt.setText(String.valueOf(DepartmentList.size()+1));
        CIDTxt.setText(String.valueOf(CaptainList.size()+OfficersList.size()+2));
        IDTxt.setEditable(false);
        CIDTxt.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IDLbl = new javax.swing.JLabel();
        IDTxt = new javax.swing.JTextField();
        NameLbl = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        PNumLbl = new javax.swing.JLabel();
        CIDTxt = new javax.swing.JTextField();
        PNumTxt = new javax.swing.JTextField();
        CNameLbl = new javax.swing.JLabel();
        CNameTxt = new javax.swing.JTextField();
        BDateLbl = new javax.swing.JLabel();
        GenderLbl = new javax.swing.JLabel();
        MaleRBtn = new javax.swing.JRadioButton();
        AddressLbl = new javax.swing.JLabel();
        AddressTxt = new javax.swing.JTextField();
        CIDLbl = new javax.swing.JLabel();
        FemaleRBtn = new javax.swing.JRadioButton();
        BDateTxt = new com.toedter.calendar.JDateChooser();
        SalaryLbl1 = new javax.swing.JLabel();
        SalaryTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(31, 40, 51));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IDLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        IDLbl.setForeground(new java.awt.Color(255, 255, 255));
        IDLbl.setText("ID");
        add(IDLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 251, -1, -1));

        IDTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        add(IDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 250, 200, -1));

        NameLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        NameLbl.setForeground(new java.awt.Color(255, 255, 255));
        NameLbl.setText("Name");
        add(NameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(926, 251, -1, -1));

        NameTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        add(NameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1087, 250, 200, -1));

        AddBtn.setBackground(new java.awt.Color(102, 252, 241));
        AddBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.setBorder(null);
        AddBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddBtn.setFocusable(false);
        AddBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, 168, 47));

        PNumLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        PNumLbl.setForeground(new java.awt.Color(255, 255, 255));
        PNumLbl.setText("Phone Number");
        add(PNumLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(926, 452, -1, -1));

        CIDTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        add(CIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 314, 200, -1));

        PNumTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        add(PNumTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1086, 451, 200, -1));

        CNameLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        CNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        CNameLbl.setText("Captain Name");
        add(CNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(926, 316, -1, -1));

        CNameTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        add(CNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1087, 315, 200, -1));

        BDateLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BDateLbl.setForeground(new java.awt.Color(255, 255, 255));
        BDateLbl.setText("Birth date");
        add(BDateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 381, -1, -1));

        GenderLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        GenderLbl.setForeground(new java.awt.Color(255, 255, 255));
        GenderLbl.setText("Gender");
        add(GenderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(926, 384, -1, -1));

        MaleRBtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        MaleRBtn.setForeground(new java.awt.Color(255, 255, 255));
        MaleRBtn.setText("Male");
        MaleRBtn.setContentAreaFilled(false);
        add(MaleRBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1086, 380, -1, -1));

        AddressLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        AddressLbl.setForeground(new java.awt.Color(255, 255, 255));
        AddressLbl.setText("Address");
        add(AddressLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 452, -1, -1));

        AddressTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        add(AddressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 451, 200, -1));

        CIDLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        CIDLbl.setForeground(new java.awt.Color(255, 255, 255));
        CIDLbl.setText("Captain ID");
        add(CIDLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 315, -1, -1));

        FemaleRBtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        FemaleRBtn.setForeground(new java.awt.Color(255, 255, 255));
        FemaleRBtn.setText("Female");
        FemaleRBtn.setContentAreaFilled(false);
        add(FemaleRBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1191, 380, -1, -1));
        add(BDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 382, 200, -1));

        SalaryLbl1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        SalaryLbl1.setForeground(new java.awt.Color(255, 255, 255));
        SalaryLbl1.setText("Salary");
        add(SalaryLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 519, -1, -1));

        SalaryTxt.setColumns(10);
        SalaryTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        add(SalaryTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 516, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        IDTxt.setEditable(true);
        CIDTxt.setEditable(true);
        String dep_name=NameTxt.getText();
        Date thisdate=new Date();
        SimpleDateFormat dateform=new SimpleDateFormat("dd/MM/Y");
        String Date_of_Activation=dateform.format(thisdate);
        int depID = Integer.valueOf(IDTxt.getText());
        int CapID = Integer.valueOf(CIDTxt.getText());
        Department department = new Department(depID, dep_name, 0, 0, Date_of_Activation);
        chief.add_department(department);

        String cap_name=CNameTxt.getText();
        String gender="";
        if (FemaleRBtn.isSelected())
        {
            gender=FemaleRBtn.getText();
        }  
        if (MaleRBtn.isSelected())
        { 
            gender=MaleRBtn.getText();
        }
        Date date=BDateTxt.getDate();
        SimpleDateFormat d_f=new SimpleDateFormat("dd/MM/Y");
        String b_date=d_f.format(date);
        String address=AddressTxt.getText();
        String phone =PNumTxt.getText();
        double salary=Double.valueOf(SalaryTxt.getText());
        Captain captain =new Captain(CapID,cap_name,"0",gender,b_date,address,phone,salary,0,0.0,"Available",depID,"Captain");
        chief.add_captain(captain);
        JFrame f=new JFrame();  
        JOptionPane.showMessageDialog(f,"Successfully Added");

        dep = new DepChief();
        b = new BorderLayout();

        this.setLayout(b);
        this.add(dep);

        AddBtn.setVisible(false);
        IDLbl.setVisible(false);
        IDTxt.setVisible(false);
        NameLbl.setVisible(false);
        NameTxt.setVisible(false);
        CIDLbl.setVisible(false);
        CIDTxt.setVisible(false);
        CNameLbl.setVisible(false);
        CNameTxt.setVisible(false);
        BDateLbl.setVisible(false);
        BDateTxt.setVisible(false);
        GenderLbl.setVisible(false);
        SalaryLbl1.setVisible(false);
        SalaryTxt.setVisible(false);
        PNumLbl.setVisible(false);
        PNumTxt.setVisible(false);
        MaleRBtn.setVisible(false);
        FemaleRBtn.setVisible(false);
        AddressLbl.setVisible(false);
        AddressTxt.setVisible(false);
        dep.setVisible(true);
    }//GEN-LAST:event_AddBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel AddressLbl;
    private javax.swing.JTextField AddressTxt;
    private javax.swing.JLabel BDateLbl;
    private com.toedter.calendar.JDateChooser BDateTxt;
    private javax.swing.JLabel CIDLbl;
    private javax.swing.JTextField CIDTxt;
    private javax.swing.JLabel CNameLbl;
    private javax.swing.JTextField CNameTxt;
    private javax.swing.JRadioButton FemaleRBtn;
    private javax.swing.JLabel GenderLbl;
    private javax.swing.JLabel IDLbl;
    private javax.swing.JTextField IDTxt;
    private javax.swing.JRadioButton MaleRBtn;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JLabel PNumLbl;
    private javax.swing.JTextField PNumTxt;
    private javax.swing.JLabel SalaryLbl1;
    private javax.swing.JTextField SalaryTxt;
    // End of variables declaration//GEN-END:variables
}