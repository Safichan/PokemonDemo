package pokemon.userinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * userinterface. Gui created a GUI to get an overview over trainers and pokemon. Currently in progress.
 * Maybe with high probibility too complicated, but its my first try so shut up xD.
 *
 * JFrame and JPanel have to be static! Its important right now for the right outcome.
 */
public class Gui implements ActionListener, ItemListener {

    // all components
    protected static JFrame frame;

    protected static JPanel contentPane;
    protected JPanel buttonPanel;
    protected JPanel comboPanel;
    protected JPanel newPanel;
    //protected JPanel pokePanel;
    protected JPanel bottomPanel;

    protected JLabel comboLabel;

    protected JButton butNew;
    protected JButton butEdit;
    protected JButton butDel;
    protected JButton butBackPoke;
    protected JButton butContinue;

    protected JComboBox<String> trainer;
    protected String[] trainerList = {"du da", "er da", "Noir", "Han", "Mary", "ich", "du"};

    /**
     * Consturctor places all components at the right place. Currently in progress and without
     * any parameters.
     */
    public Gui() {
        // set frame and contentPane
        frame = new JFrame();
        contentPane = new JPanel();
        frame.setContentPane(contentPane);

        // adding elements
        this.comboPanel = new JPanel();

        this.trainer = new JComboBox<String>(trainerList);
        trainer.addItemListener(this);
        trainer.setMaximumSize(this.trainer.getPreferredSize());
        this.comboPanel.add(trainer);
        this.comboLabel = new JLabel(" ");
        this.comboPanel.add(comboLabel);

        //buttons
        this.buttonPanel = new JPanel();
        this.bottomPanel = new JPanel();

        this.butNew = new JButton("New");
        this.butNew.setBounds(130, 100, 100, 40);
        this.butNew.addActionListener(this);
        this.buttonPanel.add(butNew);

        this.butEdit = new JButton("Edit");
        this.butEdit.setBounds(130, 100, 100, 40);
        this.butEdit.addActionListener(this);
        this.buttonPanel.add(butEdit);

        this.butDel = new JButton("Delete");
        this.butDel.setBounds(130, 100, 100, 40);
        this.butDel.addActionListener(this);
        this.buttonPanel.add(butDel);

        this.butContinue = new JButton("Continue");
        this.butContinue.setBounds(130, 100, 100, 40);
        this.butContinue.addActionListener(this);
        this.bottomPanel.add(butContinue);
        this.buttonPanel.setMaximumSize(this.buttonPanel.getPreferredSize());

        this.butBackPoke = new JButton("Back");
        this.butBackPoke.setBounds(130, 100, 100, 40);
        this.butBackPoke.addActionListener(this);

        /*pokemon Layout
        this.pokePanel = new JPanel();
        this.pokePanel.add(butBackPoke);*/

        contentPane.add(comboPanel);
        contentPane.add(buttonPanel);
        contentPane.add(bottomPanel);

        // set Layout
        frame.setTitle("PokéDexReloaded");
        frame.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        frame.setLayout(new FlowLayout());
        frame.setSize(290, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set visible
        frame.setVisible(true);
    }

    /**
     * Overrided method from ActionListener. Currently in progress.
     *
     * @param ae Action Event
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == butNew) {
            System.out.println("Neuer Trainer wird erstellt!");
        }
        if (ae.getSource() == butEdit) {
            GuiEdit edit = new GuiEdit(trainer.getSelectedIndex(), this.trainerList);
            System.out.println("Trainer wird bearbeitet!");
            contentPane.setVisible(false);
            edit.setVisiblity(true);
            frame.setContentPane(edit.getContentPane());
        }
        if (ae.getSource() == butDel) {
            System.out.println(trainerList[trainer.getSelectedIndex()] + " wird gelöscht!");
            trainer.removeItem(trainer.getSelectedItem());
            for (int i = trainer.getSelectedIndex(); i > trainerList.length; i++) {
                this.trainerList[i] = this.trainerList[i+1];
            }
            trainer.updateUI();
        }
        if (ae.getSource() == butBackPoke) {
            System.out.println("Zurück");
            contentPane.setVisible(true);
            frame.setContentPane(contentPane);
        }
        if (ae.getSource() == butContinue) {
            System.out.println("Weiter");
            contentPane.setVisible(false);
            //this.pokePanel.setVisible(true);
            //frame.setContentPane(pokePanel);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == trainer) {
            comboLabel.setText(trainer.getSelectedItem() + " selected");
        }
    }

    /**Method to get contentPane from Gui. Used in other classes to make it visible or not.
     *
     * @return contentPane JPanel
     */
    public static JPanel getContentPane() {
        return contentPane;
    }

    /**Method sets visibility from contentPane of Gui. Used in other classes.
     *
     * @param value
     */
    public static void setVisiblity(boolean value) {
        contentPane.setVisible(value);
    }
}

