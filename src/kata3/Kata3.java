package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram <String> histogram = new Histogram();
        for (int i = 0; i < 20; i++) {
            histogram.increment("ulpgc.es");
        }
        for (int i = 0; i < 30; i++) {
            histogram.increment("qwerty.es");
        }
        for (int i = 0; i < 16; i++) {
            histogram.increment("mclh.es");
        }
        for (int i = 0; i < 32; i++) {
            histogram.increment("algo.es");
        }
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
