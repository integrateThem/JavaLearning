import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ad {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Double Click Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Table modeldasdsaDASDASDAS
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Age");

        // Adding some rows to the table model
        model.addRow(new Object[]{1, "John Doe", 25});
        model.addRow(new Object[]{2, "Jane Smith", 30});
        model.addRow(new Object[]{3, "Emily Johnson", 22});

        // Table
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Add mouse listener to the table
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && !e.isConsumed()) {
                    e.consume();
                    int row = table.rowAtPoint(e.getPoint());
                    int column = table.columnAtPoint(e.getPoint());
                    if (row >= 0 && column >= 0) {
                        Object value = table.getValueAt(row, column);
                        JOptionPane.showMessageDialog(frame, "Value: " + value.toString(), "Cell Content", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });

        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
