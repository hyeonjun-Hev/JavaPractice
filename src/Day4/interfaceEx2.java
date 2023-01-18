package Day4;

interface Translate{
    public String translate();
    public String translateTo();
}

class KT implements Translate{
    @Override
    public String translate() {
        return "translate Korean";
    }

    @Override
    public String translateTo() {
        return "translate English";
    }
}

class KT2 implements Translate{

    @Override
    public String translate() {
        return "what?";
    }

    @Override
    public String translateTo() {
        return "wait!";
    }
}

public class interfaceEx2 {
    public static void main(String[] args) {
        KT kt = new KT();
        System.out.println(kt.translate());
        System.out.println(kt.translateTo());
        System.out.println();
        Translate kt2 = new KT();
        Translate kt3 = new KT2();
        System.out.println(kt2.translate());
        System.out.println(kt3.translate());
    }
}
