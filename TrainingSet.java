import java.util.Arrays;

class TrainingSet {
    private int[][] data;
    private int[] targets;

    public TrainingSet(int[][] data, int[] targets) {
        this.data = data;
        this.targets = targets;
    }

    public int[][] getData() {
        return data;
    }

    public int[] getTargets() {
        return targets;
    }

    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]) + " " + targets[i]);
        }
    }
}
