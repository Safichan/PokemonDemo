package pokemon.userinterface;

import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;

/**Class for editor of trainers. Uses methods form Gui to set itself visible or not after pressing buttons.
 * Currently in progress, because I dont really understand, why it works.
 *
 * JPanel has to be static! Its important right now for the right outcome.
 */
public class GuiEdit implements ActionListener, ItemListener {

    //attributes
    protected static JPanel contentPane;

    protected JButton butBack;

    protected JLabel labelName;

    protected JTextField name;

    protected int trainerEdit;
    protected String[] trainers;

    /**Constructor. Needs the index of the trainer who is going to be edited.
     * Currently in progress.
     *
     * @param trainerToEdit int
     * @param trainers String Array
     */
    public GuiEdit(int trainerToEdit, String[] trainers) {
        this.trainerEdit = trainerToEdit;
        this.trainers = trainers;

        contentPane = new JPanel();

        //adds components
        this.labelName = new JLabel("Test!");
        contentPane.add(labelName);
        this.name = new JTextField(30);
        this.name.setMaximumSize(this.name.getPreferredSize());
        contentPane.add(name);

        this.butBack = new JButton("Back");
        this.butBack.setBounds(130, 100, 100, 40);
        this.butBack.addActionListener(this);
        contentPane.add(butBack);

        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.setVisible(true);

        Gui.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**Overrided method from ActionListener. Currently in progress.
     *
     * @param ae Action Event
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == butBack) {
            System.out.println("Zurück");
            contentPane.setVisible(false);
            Gui.setVisiblity(true);
            Gui.frame.setContentPane(Gui.getContentPane());
        }

    }

    /**Overrided method from ItemListener. Currently in progress.
     *
     * @param ie ItemEvent
     */
    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub

    }

    /**Method returns contentPane of GuiEdit.Used in other classes to make it visible or not.
     *
     * @return contentPane JPanel
     */
    public JPanel getContentPane() {
        return contentPane;
    }

    /**Method sets visibility from contentPane of Gui. Used in other classes.
     *
     * @param value
     */
    public void setVisiblity(boolean value) {
        contentPane.setVisible(value);
    }
}

