import java.util.HashMap;
import java.util.Map;

public class Table {
    public final static Map<Double, Double> systemFMap = new HashMap<>();

    public final static Map<Double, Double> trigonomFMap = new HashMap<>();
    public final static Map<Double, Double> logarithmicFMap = new HashMap<>();

    public final static Map<Double, Double> sinMap = new HashMap<>();
    public final static Map<Double, Double> cosMap = new HashMap<>();
    public final static Map<Double, Double> cotMap = new HashMap<>();
    public final static Map<Double, Double> cscMap = new HashMap<>();
    public final static Map<Double, Double> secMap = new HashMap<>();
    public final static Map<Double, Double> tanMap = new HashMap<>();

    public final static Map<Double, Double> lnMap = new HashMap<>();
    public final static Map<Double, Double> log3Map = new HashMap<>();
    public final static Map<Double, Double> log5Map = new HashMap<>();
    public final static Map<Double, Double> log10Map = new HashMap<>();

    static {
        systemFMap.put(-0.4, 336.6779);
        systemFMap.put(-1.0, 8.8386);
        systemFMap.put(-1.43, 262.25079);
        systemFMap.put(-1.7, -736.4724);
        systemFMap.put(-2.06, -84.9726);
        systemFMap.put(-2.54, -344.5429);
        systemFMap.put(-3.42, -291.8291);
        systemFMap.put(-3.87, -0.0644);
        systemFMap.put(-4.57, -220.13498);
        systemFMap.put(-4.9, 260.0393);
        systemFMap.put(-5.4, 30.1132);
        systemFMap.put(-5.9, 494.3992);
        systemFMap.put(0.1, 3.79487);
        systemFMap.put(0.6, 23.8711);
        systemFMap.put(1.4, 18.24437);
        systemFMap.put(2.7, -1.53375);
        systemFMap.put(7.3, -2.3532);

        trigonomFMap.put(-0.4, 336.6779);
        trigonomFMap.put(-1.0, 8.8386);
        trigonomFMap.put(-1.43, 262.25079);
        trigonomFMap.put(-1.7, -736.4724);
        trigonomFMap.put(-2.06, -84.9726);
        trigonomFMap.put(-2.54, -344.5429);
        trigonomFMap.put(-3.42, -291.8291);
        trigonomFMap.put(-3.87, -0.0644);
        trigonomFMap.put(-4.57, -220.13498);
        trigonomFMap.put(-4.9, 260.0393);
        trigonomFMap.put(-5.4, 30.1132);
        trigonomFMap.put(-5.9, 494.3992);

        logarithmicFMap.put(0.1, 3.79487);
        logarithmicFMap.put(0.6, 23.8711);
        logarithmicFMap.put(1.4, 18.24437);
        logarithmicFMap.put(2.7, -1.53375);
        logarithmicFMap.put(7.3, -2.3532);

        sinMap.put(-0.4, -0.38941);
        sinMap.put(-1.0, -0.841470);
        sinMap.put(-1.43, -0.990104);
        sinMap.put(-1.7, -0.991664);
        sinMap.put(-2.06, -0.882707);
        sinMap.put(-2.54, -0.565956);
        sinMap.put(-3.42, 0.274824);
        sinMap.put(-3.87, 0.665681);
        sinMap.put(-4.57, 0.989879);
        sinMap.put(-4.9, 0.982452);
        sinMap.put(-5.4, 0.772764);
        sinMap.put(-5.9, 0.3738766);

        cosMap.put(-0.4, 0.92106);
        cosMap.put(-1.0, 0.5403023);
        cosMap.put(-1.43, 0.140331);
        cosMap.put(-1.7, -0.128844);
        cosMap.put(-2.06, -0.469923);
        cosMap.put(-2.54, -0.82443);
        cosMap.put(-3.42, -0.96149);
        cosMap.put(-3.87, -0.746235);
        cosMap.put(-4.57, -0.1419083);
        cosMap.put(-4.9, 0.1865123);
        cosMap.put(-5.4, 0.634692);
        cosMap.put(-5.9, 0.927478);

        cotMap.put(-0.4, -2.365222);
        cotMap.put(-1.0, -0.642092);
        cotMap.put(-1.43, -0.141734);
        cotMap.put(-1.7, 0.12992);
        cotMap.put(-2.06, 0.53236);
        cotMap.put(-2.54, 1.456712);
        cotMap.put(-3.42, -3.498573);
        cotMap.put(-3.87, -1.121009);
        cotMap.put(-4.57, -0.1433591);
        cotMap.put(-4.9, 0.1898436);
        cotMap.put(-5.4, 0.821327);
        cotMap.put(-5.9, 2.480706);

        cscMap.put(-0.4, -2.567932);
        cscMap.put(-1.0, -1.1883951);
        cscMap.put(-1.43, -1.009994);
        cscMap.put(-1.7, -1.008405);
        cscMap.put(-2.06, -1.132878);
        cscMap.put(-2.54, -1.766921);
        cscMap.put(-3.42, 3.63868);
        cscMap.put(-3.87, 1.502218);
        cscMap.put(-4.57, 1.0102236);
        cscMap.put(-4.9, 1.017860);
        cscMap.put(-5.4, 1.294055);
        cscMap.put(-5.9, 2.674678);

        secMap.put(-0.4, 1.085704);
        secMap.put(-1.0, 1.850815);
        secMap.put(-1.43, 7.125978);
        secMap.put(-1.7, -7.761293);
        secMap.put(-2.06, -2.128007);
        secMap.put(-2.54, -1.212951);
        secMap.put(-3.42, -1.040047);
        secMap.put(-3.87, -1.340059);
        secMap.put(-4.57, -7.0468031);
        secMap.put(-4.9, 5.361574);
        secMap.put(-5.4, 1.575565);
        secMap.put(-5.9, 1.078192);

        tanMap.put(-0.4, -0.42279);
        tanMap.put(-1.0, -1.557407);
        tanMap.put(-1.43, -7.055463);
        tanMap.put(-1.7, 7.696602);
        tanMap.put(-2.06, 1.878408);
        tanMap.put(-2.54, 0.6864774);
        tanMap.put(-3.42, -0.285830);
        tanMap.put(-3.87, -0.892053);
        tanMap.put(-4.57, -6.975488);
        tanMap.put(-4.9, 5.267493);
        tanMap.put(-5.4, 1.217540);
        tanMap.put(-5.9, 0.403110);

        lnMap.put(0.1, -2.3025850);
        lnMap.put(0.6, -0.5108256);
        lnMap.put(1.4, 0.33647224);
        lnMap.put(2.7, 0.99325177);
        lnMap.put(7.3, 1.98787435);

        log3Map.put(0.1, -2.09590327);
        log3Map.put(0.6, -0.46497352);
        log3Map.put(1.4, 0.30627023);
        log3Map.put(2.7, 0.90409673);
        log3Map.put(7.3, 1.80944121);

        log5Map.put(0.1, -1.43067656);
        log5Map.put(0.6, -0.31739381);
        log5Map.put(1.4, 0.20906196);
        log5Map.put(2.7, 0.61714203);
        log5Map.put(7.3, 1.23513578);

        log10Map.put(0.1, -1.0);
        log10Map.put(0.6, -0.22184875);
        log10Map.put(1.4, 0.14612804);
        log10Map.put(2.7, 0.43136376);
        log10Map.put(7.3, 0.86332286);
    }
}
