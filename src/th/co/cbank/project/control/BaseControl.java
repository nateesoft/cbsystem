package th.co.cbank.project.control;

import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class BaseControl {
    private final Logger logger = Logger.getLogger(BaseControl.class);

    public int update(String sql) {
        try {
            return MySQLConnect.exeUpdate(sql);
        } catch (Exception e) {
            logger.error(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return -1;
    }

}
