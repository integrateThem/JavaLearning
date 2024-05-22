import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ads {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Right Click Delete Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Table model
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
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

        // Create popup menu
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem deleteItem = new JMenuItem("Sil");
        popupMenu.add(deleteItem);

        // Add mouse listener to the table
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.rowAtPoint(e.getPoint());
                int column = table.columnAtPoint(e.getPoint());
                if (row >= 0 && column >= 0) {
                    if (SwingUtilities.isRightMouseButton(e)) {
                        // Show popup menu
                        table.setRowSelectionInterval(row, row);
                        popupMenu.show(table, e.getX(), e.getY());
                    } else if (e.getClickCount() == 2 && !e.isConsumed()) {
                        // Double click to show cell content
                        e.consume();
                        Object value = table.getValueAt(row, column);
                        JOptionPane.showMessageDialog(frame, "Value: " + value.toString(), "Cell Content", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });

        // Add action listener to the delete item
        deleteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    int confirmed = JOptionPane.showConfirmDialog(frame, "Bu satırı silmek istediğinizden emin misiniz?", "Satırı Sil", JOptionPane.YES_NO_OPTION);
                    if (confirmed == JOptionPane.YES_OPTION) {
                        model.removeRow(selectedRow);
                    }
                }
            }
        });
//xzcxzc
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
