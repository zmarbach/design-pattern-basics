package designpatterns;

public abstract class ParentMain {
    private String patternName;

    public ParentMain(String patternName) {
        this.patternName = patternName;
    }

    public abstract void execute();

    public String toString(ParentMain pattern){
        return pattern.getPatternName();
    }

    public String getPatternName() {
        return patternName;
    }
}
