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
public class GuiCard implements ActionListener, ItemListener {

    // all components
    protected static JFrame frame;
    protected static JLabel comboLabel;

    protected static CardLayout cards;

    protected static JPanel contentPane;
    protected static JPanel cardPanel;
    protected JPanel bottomPanel;

    protected JButton butBack;
    protected JButton butContinue;

    protected JComboBox<String> trainer;
    protected String[] trainerList = {"du da", "er da", "Noir", "Han", "Mary", "ich", "du"};

    /**
     * Consturctor places all components at the right place. Currently in progress and without
     * any parameters.
     */
    public GuiCard() {
        // set frame and contentPane
        frame = new JFrame();
        cards = new CardLayout();
        contentPane = new JPanel(new BorderLayout());
        frame.setContentPane(contentPane);

        // adding elements
        GuiCard.cardPanel = new JPanel(cards);
        GuiCard.cardPanel.add("Start", new Gui());

        //buttons
        this.bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        this.butContinue = new JButton("Continue");
        this.butContinue.setBounds(130, 100, 100, 40);
        this.butContinue.addActionListener(this);
        this.bottomPanel.add(butContinue);

        this.butBack = new JButton("Back");
        this.butBack.setBounds(130, 100, 100, 40);
        this.butBack.addActionListener(this);
        this.bottomPanel.add(butBack);
        
        contentPane.add(cardPanel);
        contentPane.add(bottomPanel, BorderLayout.SOUTH);

        // set Layout
        frame.setTitle("PokéDexReloaded");
        frame.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set visible
        frame.setVisible(true);

        //TestPurposes for JSON
    }

    /**
     * Overrided method from ActionListener. Currently in progress.
     *
     * @param ae Action Event
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == butBack) {
            System.out.println("Zurück");
            GuiCard.cards.previous(cardPanel);
        }
        if (ae.getSource() == butContinue) {
            System.out.println("Weiter");
            GuiCard.cards.next(cardPanel);
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

