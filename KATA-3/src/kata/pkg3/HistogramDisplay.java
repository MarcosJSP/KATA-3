/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata.pkg3;

import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Usuario
 */
public class HistogramDisplay extends ApplicationFrame{
    
    //Map <ChartPanel> CP = new HashMap <>();
    
    public HistogramDisplay() {
        super("Histograma");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        
        
        JFreeChart chart = ChartFactory.createBarChart3D( "Histograma JFreeChart",
                "Dominios email", "Nยบ de emails", dataSet, PlotOrientation.VERTICAL,
                rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
        
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(10, "", "ulpgc.es");
        dataSet.addValue(6, "", "google.es");
        dataSet.addValue(1, "", "pedro.meme");
        return dataSet;
    }
}
