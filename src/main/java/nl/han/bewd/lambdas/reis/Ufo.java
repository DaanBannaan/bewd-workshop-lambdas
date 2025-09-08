package nl.han.bewd.lambdas.reis;

public class Ufo implements VervoerStrategy {
    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        if(isReisTijdensSpits) {
            return 99999999;
        } else {
            return 1;
        }
    }
}
