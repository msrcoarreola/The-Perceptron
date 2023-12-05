import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create and train the perceptron for AND (2 inputs)
        int andInputSize2 = 2;
        double andLearningRate2 = 0.1;
        Neuron andNeuron2 = new Neuron(andInputSize2, andLearningRate2);
        TrainingSet andTrainingSet2 = new TrainingSet(new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 1}}, new int[]{0, 0, 0, 1});
        PerceptronTrainer andTrainer2 = new PerceptronTrainer(andNeuron2);
        andTrainer2.train(andTrainingSet2, 1000);

        // Test the trained perceptron for AND (2 inputs)
        System.out.println("AND (2 inputs):");
        andTrainingSet2.display();
        System.out.println("\nFinal weights for AND (2 inputs):");
        printWeights(andNeuron2.getWeights());

        // Create and train the perceptron for OR (2 inputs)
        int orInputSize2 = 2;
        double orLearningRate2 = 0.1;
        Neuron orNeuron2 = new Neuron(orInputSize2, orLearningRate2);
        TrainingSet orTrainingSet2 = new TrainingSet(new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 1}}, new int[]{0, 1, 1, 1});
        PerceptronTrainer orTrainer2 = new PerceptronTrainer(orNeuron2);
        orTrainer2.train(orTrainingSet2, 1000);

        // Test the trained perceptron for OR (2 inputs)
        System.out.println("\nOR (2 inputs):");
        orTrainingSet2.display();
        System.out.println("\nFinal weights for OR (2 inputs):");
        printWeights(orNeuron2.getWeights());
    }

    private static void printWeights(double[] weights) {
        System.out.println("Weights: " + Arrays.toString(weights));
    }
}