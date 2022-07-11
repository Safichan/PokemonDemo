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
public class Gui extends JPanel implements ActionListener, ItemListener {

    // all components
    protected JPanel buttonPanel;
    protected JPanel comboPanel;

    protected JLabel comboLabel;

    protected JButton butNew;
    protected JButton butEdit;
    protected JButton butDel;

    protected JComboBox<String> trainer;
    protected String[] trainerList = {"du da", "er da", "Noir", "Han", "Mary", "ich", "du"};

    /**
     * Consturctor places all components at the right place. Currently in progress and without
     * any parameters.
     */
    public Gui() {
        super();
        // adding elements
        this.comboPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        this.trainer = new JComboBox<String>(trainerList);
        trainer.addItemListener(this);
        trainer.setMaximumSize(this.trainer.getPreferredSize());
        this.comboPanel.add(trainer);
        this.comboLabel = new JLabel(" ");
        this.comboPanel.add(comboLabel);

        //buttons
        this.buttonPanel = new JPanel();

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

        add(comboPanel);
        add(buttonPanel);
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
            System.out.println("Trainer wird bearbeitet!");
            GuiCard.cardPanel.add("Edit", new GuiEdit(trainer.getSelectedIndex(), this.trainerList));
            GuiCard.cards.show(GuiCard.cardPanel, "Edit");
        }
        if (ae.getSource() == butDel) {
            System.out.println(trainerList[trainer.getSelectedIndex()] + " wird gelöscht!");
            trainer.removeItem(trainer.getSelectedItem());
            for (int i = trainer.getSelectedIndex(); i > trainerList.length; i++) {
                this.trainerList[i] = this.trainerList[i+1];
            }
            trainer.updateUI();
            JOptionPane.showMessageDialog(null, trainer.getSelectedItem() + " wurde gelöscht!");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == trainer) {
            comboLabel.setText(trainer.getSelectedItem() + " selected");
        }
    }
}

