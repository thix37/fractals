
import java.awt.Color;
import java.util.HashSet;

import javax.swing.JFrame;
        import javax.swing.SwingUtilities;
        import javax.swing.WindowConstants;

        import org.jfree.chart.ChartFactory;
        import org.jfree.chart.ChartPanel;
        import org.jfree.chart.JFreeChart;
        import org.jfree.chart.plot.XYPlot;
        import org.jfree.data.xy.XYDataset;
        import org.jfree.data.xy.XYSeries;
        import org.jfree.data.xy.XYSeriesCollection;

/**
 * @author imssbora
 */
public class ScatterPlot extends JFrame {
    private static final long serialVersionUID = 6294689542092367723L;

    public ScatterPlot(String title, int numberOfPoints) {
        super(title);

        // Create dataset
        XYDataset dataset = createDataset(numberOfPoints);

        // Create chart
        JFreeChart chart = ChartFactory.createScatterPlot(
                "IKS2 fractal2",
                "X-Axis", "Y-Axis", dataset);


        //Changes background color
        XYPlot plot = (XYPlot)chart.getPlot();
        plot.setBackgroundPaint(new Color(47, 255, 250));


        // Create Panel
        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    }
    private XYDataset createDataset(int numberOfPoints) {
        Iks2 iks2 = new Iks2(numberOfPoints);
        XYSeriesCollection dataset = new XYSeriesCollection();
        HashSet<Point2D> listOFGenPoints = iks2.generateListOfPoints() ;
        XYSeries series = new XYSeries("ix");

        for (Point2D point2D : listOFGenPoints){
            series.add(point2D.getX(),point2D.getY());
        }

        dataset.addSeries(series);

        return dataset;
    }


}