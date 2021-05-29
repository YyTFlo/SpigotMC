package de.pixelmc.bchallenges.utils;

/**
 * Diese Datei wurde von Florian A. am 25.05.2021 erstellt.
 * Jede nutzung dieser Datei ist nur nach erlaubnis von Florian erlaubt.
 * Kontakt:
 * Discord: YyTFlo#6608
 * Email: yytflo.tw@gmail.com
 **/
public class Data {

    private String messegePrefix;
    private String debugPrefix;
    private String errorPrefix;

    public Data () {
         debugPrefix = "§8| §1Debug §8» §7";
        errorPrefix = "§8| §4Error §8» §7";
        messegePrefix = "§8| §6BChellenges §8» §7";
    }

    public String getMessegePrefix() {
        return messegePrefix;
    }

    public String getDebugPrefix() {
        return debugPrefix;
    }

    public String getErrorPrefix() {
        return errorPrefix;
    }
}
