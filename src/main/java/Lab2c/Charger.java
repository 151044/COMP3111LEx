package Lab2c;

/**
 * Code provided by COMP 3111H teaching team.
 */

interface Chargable {
    void charge(); // interface methods are by default public
}
public class Charger {
    public void charge(Chargable c) {
        c.charge();
    }
}
