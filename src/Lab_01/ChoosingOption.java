package Lab_01;

import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                "Nguyen Thi Nhung 20215109 \nDo you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "NguyenThiNhung20215109-You've chosen: " +
        (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        System.exit(0);
    }
}