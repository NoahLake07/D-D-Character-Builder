import com.prog2.panels.AbilityPanel;
import com.prog2.panels.ClassPanel;
import com.prog2.panels.InfoPanel;
import com.prog2.panels.RacePanel;

import javax.swing.*;

public class SheetBuilderView extends JFrame {

    private JTabbedPane tabs;
    private JPanel raceTab, infoTab, abilityTab, classTab;


    public SheetBuilderView(){
        // Setup tabbed pane
        tabs = new JTabbedPane();

        // setup
        raceTab = new RacePanel();
        classTab = new ClassPanel();
        infoTab = new InfoPanel();
        abilityTab = new AbilityPanel();

        // add all panels to the tab pane
        tabs.add("Choose Race", raceTab);
        tabs.add("Choose Class", classTab);
        tabs.add("Choose Name/Background",infoTab);
        tabs.add("Roll Abilities", abilityTab);

        add(tabs);

        // Frame setup
        setTitle("Character Setup - D&D");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,400);
        setVisible(true);

    }

}
