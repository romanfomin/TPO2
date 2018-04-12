package Functions.Trigonometric;

import Functions.Computable;

public class Cos implements Computable {

    private Sin sin;

    public Cos(Sin sin){
        this.sin = sin;
    }

    @Override
    public double compute(double x, double accuracy) {
        double rad = Math.abs(x%(2*Math.PI));
        if((rad>=0 && rad <=(Math.PI/2)) || rad>=(3*Math.PI/2) && rad<(2*Math.PI)) {
            return Math.sqrt(1 - Math.pow(sin.compute(x, accuracy / 100), 2));
        }
        return -(Math.sqrt(1 - Math.pow(sin.compute(x, accuracy / 100), 2)));
    }
}
