import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.color.*;


public class EmployeeSalary {
    private JPanel Main;
    private JButton OKButton;
    private JTextField txtName;
    private JTextField txtSalary;
    private JTextField txtEpf;
    private JTextField txtSocso;
    private JTextField txtEis;
    private JTextField txtNetsalary;
    private JButton a9Button;

    public static void main(String[] args) {
        JFrame frame = new JFrame("EmployeeSalary");
        frame.setContentPane(new EmployeeSalary().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.pack();
        frame.setVisible(true);

    }

    public EmployeeSalary() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double salary = Double.parseDouble(txtSalary.getText());
                double epf, socso, eis, netsalary;

                epf = salary * 11 / 100;
                txtEpf.setText(String.valueOf(epf));
                socso = salary * 0.5 / 100;
                txtSocso.setText(String.valueOf(socso));
                eis = salary * 0.2 / 100;
                txtEis.setText(String.valueOf(eis));
                netsalary = salary - epf - socso - eis;
                txtNetsalary.setText(String.valueOf(netsalary));


            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double salary = Double.parseDouble(txtSalary.getText());
                double epf, socso, eis, netsalary;

                epf = salary * 9 / 100;
                txtEpf.setText(String.valueOf(epf));
                socso = salary * 0.5 / 100;
                txtSocso.setText(String.valueOf(socso));
                eis = salary * 0.2 / 100;
                txtEis.setText(String.valueOf(eis));
                netsalary = salary - epf - socso - eis;
                txtNetsalary.setText(String.valueOf(netsalary));

            }
        });
    }
}
