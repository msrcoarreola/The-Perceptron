class PerceptronTrainer {
    private Neuron neuron;

    public PerceptronTrainer(Neuron neuron) {
        this.neuron = neuron;
    }

    public void train(TrainingSet trainingSet, int epochs) {
        int[][] data = trainingSet.getData();
        int[] targets = trainingSet.getTargets();

        for (int epoch = 0; epoch < epochs; epoch++) {
            for (int i = 0; i < data.length; i++) {
                neuron.train(data[i], targets[i]);
            }
        }
    }
}