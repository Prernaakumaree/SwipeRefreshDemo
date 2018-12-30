package com.prerna.swipedemo.utils;

/**
 * Created by prernaakumaree on 28/12/2018
 * prernaakumaree@gmail.com
 */

public class Constants {

    public static final String NAME_KEY_API_NEWS = "apiKey";
    public static final String NAME_COUNTRY_API_NEWS = "country";
    public static final String NAME_LANGUAGE_API_NEWS = "language";
    public static final String VALUE_KEY_API_NEWS = "d03181877c724ff0b1c2294e9a65b84c";
    //public static final String VALUE_COUNTRY_API_NEWS = "in";

    public enum LanguageCode {
        ARABIC("ar"),
        GERMAN("de"),
        ENGLISH("en"),
        SPANISH("es"),
        FRENCH("fr"),
        HEBREW("he"),
        DUTCH("nl"),
        PORTUGUESE("pt"),
        RUSSIAN("ru"),
        SAMI("se"),
        CHINESE("zh");

        private final String text;

        /**
         * @param text
         */
        LanguageCode(final String text) {
            this.text = text;
        }

        /* (non-Javadoc)
         * @see java.lang.Enum#toString()
         */
        @Override
        public String toString() {
            return text;
        }
    }

    public enum CountryCode {
        BELGIUM("be"),
        BULGARIA("bg"),
        BRAZIL("br"),
        CANADA("ca"),
        CHINA("cn"),
        COLOMBIA("co"),
        CUBA("cu"),
        CZECH_REPUBLIC("cz"),
        GERMANY("de"),
        EGYPT("eg"),
        FRANCE("fr"),
        UK("gb"),
        GREECE("gr"),
        HONGKONG("hk"),
        HUNGARY("hu"),
        INDONESIA("id"),
        IRELAND("ie"),
        ISRAEL("il"),
        INDIA("in"),
        ITALY("it"),
        JAPAN("jp"),
        SOUTH_KOREA("kr"),
        LITHUANIA("lt"),
        LATVIA("lv"),
        MOROCCO("ma"),
        MEXICO("mx"),
        MALAYSIA("my"),
        NIGERIA("ng"),
        NETHERLANDS("nl"),
        NORWAY("no"),
        NEW_ZEALAND("nz"),
        PHILIPPINES("ph"),
        POLAND("pl"),
        PORTUGAL("pt"),
        ROMANIA("ro"),
        SERBIA("rs"),
        RUSSIA("ru"),
        SAUDI_ARABIA("sa"),
        SWEDEN("se"),
        SINGAPORE("sg"),
        SLOVENIA("si"),
        SLOVAKIA("sk"),
        THAILAND("th"),
        TURKEY("tr"),
        TAIWAN("tw"),
        UKRAINE("ua"),
        US("us"),
        VENUZUELA("ve"),
        SOUTH_AFRICA("za");

        private final String text;

        /**
         * @param text
         */
        CountryCode(final String text) {
            this.text = text;
        }

        /* (non-Javadoc)
         * @see java.lang.Enum#toString()
         */
        @Override
        public String toString() {
            return text;
        }
    }
}
