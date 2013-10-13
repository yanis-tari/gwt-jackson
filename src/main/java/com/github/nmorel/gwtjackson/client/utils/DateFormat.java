package com.github.nmorel.gwtjackson.client.utils;

import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.TimeZone;

/**
 * @author Nicolas Morel
 */
public final class DateFormat {

    /**
     * Defines a commonly used date format that conforms
     * to ISO-8601 date formatting standard, when it includes basic undecorated
     * timezone definition
     */
    public static final DateTimeFormat DATE_FORMAT_STR_ISO8601 = DateTimeFormat.getFormat( "yyyy-MM-dd'T'HH:mm:ss.SSSZ" );

    /**
     * Same as 'regular' 8601, but handles 'Z' as an alias for "+0000"
     * (or "GMT")
     */
    public final static DateTimeFormat DATE_FORMAT_STR_ISO8601_Z = DateTimeFormat.getFormat( "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" );

    /**
     * ISO-8601 with just the Date part, no time
     */
    public final static DateTimeFormat DATE_FORMAT_STR_PLAIN = DateTimeFormat.getFormat( "yyyy-MM-dd" );

    /**
     * This constant defines the date format specified by
     * RFC 1123 / RFC 822.
     */
    public final static DateTimeFormat DATE_FORMAT_STR_RFC1123 = DateTimeFormat.getFormat( "EEE, dd MMM yyyy HH:mm:ss zzz" );

    /**
     * UTC TimeZone
     */
    public static final TimeZone UTC_TIMEZONE = TimeZone.createTimeZone( 0 );

    /**
     * Format a date using {@link #DATE_FORMAT_STR_ISO8601} and {@link #UTC_TIMEZONE}
     *
     * @param date date to format
     *
     * @return the formatted date
     */
    public static String format( Date date ) {
        return DateFormat.DATE_FORMAT_STR_ISO8601.format( date, DateFormat.UTC_TIMEZONE );
    }

    private DateFormat() {}
}
