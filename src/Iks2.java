import javafx.scene.chart.XYChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Iks2 {
    private final static double t = (double) 1 / 3;
    private int numberOfPoints;

    private AffineMappingWithProbability am1 = new AffineMappingWithProbability(0.2, t, 0, 0, 0, t, 0);
    private AffineMappingWithProbability am2 = new AffineMappingWithProbability(0.2, t, 0, t, 0, t, t);
    private AffineMappingWithProbability am3 = new AffineMappingWithProbability(0.2, t, 0, 0, 0, t, 2 * t);
    private AffineMappingWithProbability am4 = new AffineMappingWithProbability(0.2, t, 0, 2 * t, 0, t, 0);
    private AffineMappingWithProbability am5 = new AffineMappingWithProbability(0.2, t, 0, 2 * t, 0, t, 2 * t);




    public Iks2(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public HashSet<Point2D> generateListOfPoints() {
        List<Point2D> listOfPoints = new ArrayList<>();
        listOfPoints.add(new Point2D(0, 0));
        for (int i = 1; i < numberOfPoints; i++) {

            listOfPoints.add(chooseAffineMappingWithProbabilityRandomly().countNextPoint(listOfPoints.get(i - 1)));
        }
        HashSet<Point2D> uniqueListOfPoints = new HashSet<>(listOfPoints);

        return uniqueListOfPoints;
    }

    //do naprawienia!!!!!!!!!!!!!!!!!!
    private AffineMappingWithProbability chooseAffineMappingWithProbabilityRandomly() {
        List<AffineMappingWithProbability> listOfAffineMappingWithProbability = new ArrayList<AffineMappingWithProbability>();
        listOfAffineMappingWithProbability.addAll(Arrays.asList(am1, am2, am3, am4, am5));

        Random random = new Random();
        int chosenAmpNumber = random.nextInt(5) ;
        return listOfAffineMappingWithProbability.get(chosenAmpNumber);

    }

    void drawIks2(int numberOfPoints){
        SwingUtilities.invokeLater(() -> {
            ScatterPlot example = new ScatterPlot("IKS2 fractal",numberOfPoints);
            example.setSize(800, 800);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }


    @Override
    public String toString() {
        return "Iks2{" +
                "am1=" + am1 +
                ", am2=" + am2 +
                ", am3=" + am3 +
                ", am4=" + am4 +
                ", am5=" + am5 +
                '}';
    }
}
