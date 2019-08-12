public class AffineMappingWithProbability extends AffineMapping {
    private double probability;

    public AffineMappingWithProbability(double probability, double a11, double a12, double c1, double a21, double a22, double c2) {
        super(a11, a12, c1, a21, a22, c2);
        isItProbability(probability);
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public void isItProbability(double probability) {
        if (probability >= 0 && probability <= 1)
            this.probability = probability;
        else
            throw new IllegalArgumentException();
    }


}
