
package kata.pkg3;
public class KATA3 {
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("google.es");
        histogram.increment("google.es");
        histogram.increment("google.es");
        histogram.increment("pedro.es");
        histogram.increment("pipo.es");
        histogram.increment("pipo.es");
        histogram.increment("pipo.es");
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
