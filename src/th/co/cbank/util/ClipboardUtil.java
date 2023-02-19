package th.co.cbank.util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import static java.awt.event.KeyEvent.VK_CONTROL;
import static java.awt.event.KeyEvent.VK_V;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ClipboardUtil {

    public static void copyTableContent(JTable table) {
        int rowSel = table.getSelectedRow();
        int colSel = table.getSelectedColumn();
        if (rowSel != -1) {
            String myString = table.getValueAt(rowSel, colSel).toString();
            StringSelection stringSelection = new StringSelection(myString.replace(",", ""));
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
            JOptionPane.showMessageDialog(null, "Copy data to clipboard");
        }
    }

    public static void paste() {
        try {
            Robot robot = new Robot();
            int controlKey = VK_CONTROL;
            robot.keyPress(controlKey);
            robot.keyPress(VK_V);
            robot.keyRelease(controlKey);
            robot.keyRelease(VK_V);
        } catch (AWTException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
