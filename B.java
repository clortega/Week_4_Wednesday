public class B extends A { //From todays slide (12) We are creating B
    private String BString;
    private String PresentBString;

    public B(String AString, String PresentString, String BString, String PresentBString) {
        super(AString, PresentString);
        this.BString = BString;
        this.PresentBString = PresentBString;
    }

    @Override
    public String Present() {
        return super.Present() + BString + PresentBString;
    }
}
