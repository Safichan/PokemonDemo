package pokemon.userinterface;

import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;

/**Class for editor of trainers. Uses methods form Gui to set itself visible or not after pressing buttons.
 * Currently in progress, because I dont really understand, why it works.
 *
 * JPanel has to be static! Its important right now for the right outcome.
 */
public class GuiEdit extends JPanel implements ActionListener, ItemListener {

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
        super();
        this.trainerEdit = trainerToEdit;
        this.trainers = trainers;

        //adds components
        this.labelName = new JLabel("Test!");
        add(labelName);
        this.name = new JTextField(30);
        this.name.setMaximumSize(this.name.getPreferredSize());
        add(name);
    }

    /**Overrided method from ActionListener. Currently in progress.
     *
     * @param ae Action Event
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        //future Buttons here
    }

    /**Overrided method from ItemListener. Currently in progress.
     *
     * @param ie ItemEvent
     */
    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub

    }
}

