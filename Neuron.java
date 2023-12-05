class Neuron {
    private double[] weights;
    private double learningRate;

    public Neuron(int inputSize, double learningRate) {
        this.weights = new double[inputSize];
        this.learningRate = learningRate;

        // Initialize weights with small random values
        for (int i = 0; i < weights.length; i++) {
            weights[i] = Math.random() * 0.1;
        }
    }

    public int predict(int[] inputs) {
        double sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += inputs[i] * weights[i];
        }

        return (sum >= 0.5) ? 1 : 0;
    }


    public void train(int[] inputs, int target) {
        int prediction = predict(inputs);
        int error = target - prediction;

        // Update weights based on error and learning rate
        for (int i = 0; i < weights.length; i++) {
            weights[i] += learningRate * error * inputs[i];
        }
    }

    public double[] getWeights() {
        return weights;
    }
}


