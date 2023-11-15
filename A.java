public class A implements Presentable {
    private String AString;
    private String PresentString;

    public A(String AString, String PresentString) {
        super();
        this.AString = AString;
        this.PresentString = PresentString;
    }

    @Override
    public String Present() {
        return AString + PresentString;
    }
}
